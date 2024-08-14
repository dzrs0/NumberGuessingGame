# Number Guessing Game

A simple number guessing game implemented in Java. The game allows players to guess a randomly generated number with two different modes: user-defined limited attempts or unlimited attempts.

## Table of Contents

- [Screenshots](#screenshots)
- [Installation](#installation)
- [How to Play](#how-to-play)
- [Game Modes](#game-modes)
  - [Mode 1: Limited Attempts](#mode-1-limited-attempts)
  - [Mode 2: Unlimited Attempts](#mode-2-unlimited-attempts)
- [Technologies Used](#technologies-used)
- [License](#license)

## Screenshots

Here are some screenshots of the application:

### Main Menu

![Main Menu](screenshots/screenshot1.png)

The main menu allows you to choose between two game modes.

### Game in Progress

![Game in Progress](screenshots/screenshot2.png)

Guess the number with feedback provided on each attempt.

## Installation

To run this game, ensure you have the Java Development Kit (JDK) installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/dzrs0/number-guessing-game.git
    ```

2. Navigate to the project directory:

    ```bash
    cd number-guessing-game
    ```

3. Compile the Java file:

    ```bash
    javac NumberGuessingGame.java
    ```

4. Run the game:

    ```bash
    java NumberGuessingGame
    ```

## How to Play

After running the program, you will be prompted to choose between two game modes:

1. **Limited Attempts**: You can specify the number of attempts you want.
2. **Unlimited Attempts**: You can guess as many times as you want until you find the correct number.

In each mode, you will guess numbers between 1 and 50. The game will provide feedback on whether your guess is too high, too low, or correct.

## Game Modes

### Mode 1: Limited Attempts

- The game generates a random number between 1 and 50.
- You decide how many attempts you want to guess the number.
- You receive feedback after each guess.
- The game ends when you guess the number correctly or run out of attempts.

### Mode 2: Unlimited Attempts

- The game generates a random number between 1 and 50.
- You have unlimited attempts to guess the number.
- The game ends when you guess the number correctly.

## Technologies Used

- **Java**: The game is implemented in Java, a widely-used programming language known for its portability and performance.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
