# Telegram Guessing Game Bot

![Bot Preview](/preview.png)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Bot Commands](#bot-commands)

## Introduction

The Telegram Guessing Game Bot is a fun and interactive bot that challenges users to guess famous people from their childhood photos. It offers multiple categories, hints, and keeps track of the user's score.

## Features

- Guess celebrities, historical figures, and soccer players.
- Receive hints to help with your guesses.
- Keep track of your score and progress.
- Interactive and engaging gameplay.

## Getting Started

### Prerequisites

To run this bot, you'll need the following:

- Java Development Kit (JDK)
- Telegram Bot API Token ([Create a Telegram Bot](https://core.telegram.org/bots#botfather))

### Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/telegram-guessing-game-bot.git

2. Navigate to the project directory:

    ```bash
    cd telegram-guessing-game-bot

3. Open the `BotClass.java` file and replace `YOUR_BOT_TOKEN` with your actual Telegram Bot API token:

    ```java
    @Override
    public String getBotToken() {
      return "YOUR_BOT_TOKEN";
    }

4. Build the project:

    ```bash
    javac BotClass.java

5. Run the bot:

    ```bash
    java BotClass

Now, your Telegram Guessing Game Bot should be up and running.

## Usage

1. Start a chat with your bot on Telegram.
2. Send /start to begin a new game.
3. Choose a category by typing the corresponding number.
4. Guess the famous person from their childhood photo by typing their name.
5. Use the /hint command for a hint if needed.
6. Use the /score command to check your progress.
7. Use /end to end the game at any time.

## Bot Commands

- /start: Start a new game.
- /end: End the current game.
- /score: Check your current score and progress.
- /hint: Get a hint to help with your guess.
