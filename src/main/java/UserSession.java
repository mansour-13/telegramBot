public class UserSession {

    private Person figur;
    private String name;
    private boolean isHintMode;
    private int counter;
    private int correctGuess;

    public Person getFigur() {
        return figur;
    }

    public void setFigur(Person figur) {
        this.figur = figur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHintMode() {
        return isHintMode;
    }

    public void setHintMode(boolean hintMode) {
        isHintMode = hintMode;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCorrectGuess() {
        return correctGuess;
    }

    public void setCorrectGuess(int correctGuess) {
        this.correctGuess = correctGuess;
    }
}
