import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class BotClass extends TelegramLongPollingBot {

    private Map<Long, UserSession> userSessions;
    private Celebrity celebrities;
    private HistoricalCharacter historicalCharacters;
    private SoccerPlayer soccerPlayers;
    private String messageText;

    public BotClass() {
        celebrities = new Celebrity();
        historicalCharacters = new HistoricalCharacter();
        soccerPlayers = new SoccerPlayer();
        userSessions = new HashMap<>();
    }

    @Override
    public void onUpdateReceived(Update update) {
        messageText = update.getMessage().getText();
        Long userID = update.getMessage().getFrom().getId();
        // Check if a session exists for the user, or create a new one
        UserSession userSession = userSessions.computeIfAbsent(userID, id -> new UserSession());

        if (messageText.equalsIgnoreCase("/start")) {

            // Initialize user-specific data
            userSession.setHintMode(false);
            userSession.setCounter(0);
            userSession.setCorrectGuess(0);

            sendPhoto(userID, "./start.jpg");
            sendMessageText(userID, "Can you guess the famous peopel from their childhood photos?");
            sendMessageText(userID, "type the number of your favorite category: \n\n1️⃣ celebrities\n2️⃣ historical figures\n3️⃣ soccer players");

        } else if (messageText.equalsIgnoreCase("/end")) {
            sendPhoto(userID, "./end.jpg");
            sendMessageText(userID, "press /start for a new game.");

        } else if (messageText.equalsIgnoreCase("1")) {
            userSession.setHintMode(false);
            userSession.setCounter(userSession.getCounter() + 1);
            handleCategoty(userID, "Celebrity", userSession);

        } else if (messageText.equalsIgnoreCase("2")) {
            userSession.setHintMode(false);
            userSession.setCounter(userSession.getCounter() + 1);
            handleCategoty(userID, "Historical character", userSession);

        } else if (messageText.equalsIgnoreCase("3")) {
            userSession.setHintMode(false);
            userSession.setCounter(userSession.getCounter() + 1);
            handleCategoty(userID, "Soccer player", userSession);

        } else if (messageText.equalsIgnoreCase("hint")) {
            handleHint(userID, userSession);

        } else if (messageText.equalsIgnoreCase("score")) {
            handleScore(userID, userSession);

        } else {
            handleGuess(userID, userSession);
        }

    }


    private void handleCategoty(Long userID, String category, UserSession userSession) {

        if (category.equals("Celebrity")) {
            userSession.setFigur(celebrities.randomfigure());
            userSession.setName(userSession.getFigur().getFirstname() + " " + userSession.getFigur().getLastname());
            sendMessageText(userID, category + " categrory 📺");
            sendMessageText(userID, "🤔 Can you guess who he/she is ❓");
            sendPhoto(userID, "./photos/child/" + userSession.getName() + ".jpg");

        } else if (category.equals("Historical character")) {
            userSession.setFigur(historicalCharacters.randomfigure());
            userSession.setName(userSession.getFigur().getFirstname() + " " + userSession.getFigur().getLastname());
            sendMessageText(userID, category + " categrory 🗓");
            sendMessageText(userID, "🤔 Can you guess who he/she is ❓");
            sendPhoto(userID, "./photos/child/" + userSession.getName() + ".jpg");

        } else if (category.equals("Soccer player")) {
            sendMessageText(userID, category + " categrory ⚽");
            sendMessageText(userID, "🤔 Can you guess who he/she is ❓");
            userSession.setFigur(soccerPlayers.randomfigure());
            userSession.setName(userSession.getFigur().getFirstname() + " " + userSession.getFigur().getLastname());
            sendPhoto(userID, "./photos/child/" + userSession.getName() + ".jpg");

        }

        sendMessageText(userID, "🧐 If you know him/her, type his/her name. See how well you recognize this " + category + "." +
                "\n\n🗝  Need a hint? Type 'hint' to get more information.");
        userSession.setHintMode(true);

    }

    public void handleHint(Long userID, UserSession userSession) {
        if (userSession.isHintMode()) {
            sendMessageText(userID, userSession.getFigur().getHint());
            sendMessageText(userID, "Can you guess now ❓");
        } else {
            sendMessageText(userID, "❌ No hint available for this section");
        }
    }

    public void handleGuess(Long userID, UserSession userSession) {
        if (userSession.isHintMode() && messageText.equalsIgnoreCase(userSession.getName())) {
            userSession.setCorrectGuess(userSession.getCorrectGuess()+1);
            sendMessageText(userID, "💥💥💥 Congratulations!💥💥💥 " +
                    "\n\nThat's correct!\n" + userSession.getName());
            sendPhoto(userID, "./photos/adult/" + userSession.getName() + ".jpg");
            userSession.setHintMode(false);
            sendMessageText(userID, "⏯ type the number of category to continue" +
                    "\n🔣 type 'score' to see your result" +
                    "\n\n🔚 press ' /end ' to end the game" +
                    "\n🔄 press ' /start ' to start a new game");
        } else if (userSession.isHintMode() && messageText.equalsIgnoreCase(userSession.getFigur().getFirstname()) ||
                messageText.equalsIgnoreCase(userSession.getFigur().getLastname())) {
            sendMessageText(userID, "You are close but please type the complete name (firstname and lastname)");
        } else if (userSession.isHintMode()) {
            sendMessageText(userID, "💢 Oops! That's not correct. 😟 " +
                    "\n\n↩ Try again or" +
                    "\nℹ type 'hint' for more information or" +
                    "\n⏭ type the number of the category to skip" +
                    "\n\n🔚 press ' /end ' to end the game" +
                    "\n🔄 press ' /start ' to start a new game");
        } else {
            sendMessageText(userID, "Invalid command ⛔");
        }
    }

    public void handleScore(Long userID, UserSession userSession) {
        int notCorrect = userSession.getCounter() - userSession.getCorrectGuess();
        if (userSession.getCorrectGuess() > 0 && notCorrect > 0) {
            sendMessageText(userID, "🎉 Great job! You've recognized " + userSession.getCorrectGuess() +
                    " famous people correctly. Keep going and see if you can guess even more! 🕵️‍♀️" +
                    "\n\nBut it seems like you haven't recognized " + notCorrect + " famous people correctly. 🙇‍♀️🙇‍♂️" +
                    "No worries, keep trying and you'll improve your guessing skills! 💪");
        } else if (userSession.getCorrectGuess() > 0 && notCorrect == 0) {
            sendMessageText(userID, "✨ Great job! You've recognized " + userSession.getCorrectGuess() +
                    " famous people correctly. \nKeep going and see if you can guess even more!");
        } else {
            sendMessageText(userID, "💢 Oops! It looks like you didn't guess any correct answers this time. 😕" +
                    "\nDon't worry, keep playing, and you'll get better with each try. Good luck!");

        }
        sendMessageText(userID, "⏯ type the number of category to continue" +
                "\n\n🔚 press ' /end ' to end the game" +
                "\n🔄 press ' /start ' to start a new game");

    }


    public void sendPhoto(Long userID, String pathname) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(userID);
        sendPhoto.setPhoto(new InputFile(new File(pathname)));
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessageText(Long userID, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(userID);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getBotToken() {
        return "6300811382:AAElMrOUbqNoXRgMwWFSVDsPCnO3sDj0uIE";
    }

    @Override
    public String getBotUsername() {
        return "MansourgwBot";
    }

}
