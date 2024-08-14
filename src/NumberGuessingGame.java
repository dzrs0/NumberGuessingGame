import java.util.Scanner;

/**
 * A simple number guessing game implemented in Java.
 * The game offers two modes: user-defined limited attempts or unlimited attempts.
 */
public class NumberGuessingGame {

    /**
     * The main method where the game starts. It presents the user with two options:
     * 1. User decides the number of attempts.
     * 2. Unlimited attempts.
     */
    public static void main(String[] args) {
        int userChoice = 0;

        // Loop until the user provides a valid choice (1 or 2)
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to the number guessing game! \n Choose an option (1-2): \n 1 - You decide how many attempts you have. \n 2 - You have unlimited attempts. \n Your choice:  ");
                userChoice = scanner.nextInt();

                // Check if the user input is valid (1 or 2)
                if (userChoice == 1 || userChoice == 2) {
                    break;
                } else {
                    System.out.println("Invalid number. Choose 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        // Execute the chosen game mode
        switch (userChoice) {
            case 1 -> userAttempts();
            case 2 -> unlimitedAttempts();
        }
    }

    /**
     * Game mode where the user decides the number of attempts to guess the number.
     * The random number is generated between 1 and 50.
     */
    public static void userAttempts() {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 50 + 1);
        int counter = 0;
        int number = 0;

        // Loop until the user guesses the number or runs out of attempts
        while (true) {
            try {
                System.out.println("Enter a number of attempts:");
                int userChoose = scanner.nextInt();

                // Check if the number of attempts is valid (greater than 0)
                if (userChoose > 0) {
                    while (counter < userChoose) {
                        try {
                            System.out.println("Enter a number (1-50): ");
                            number = scanner.nextInt();

                            // Check if the number is within the valid range (1-50)
                            if (number >= 1 && number <= 50) {
                                counter++;
                                if (checkGuess(number, random)) {
                                    break;
                                }
                            } else {
                                System.out.println("Invalid number. Choose from range 1-50.");
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid input. Try again.");
                            scanner.next(); // Clear the buffer
                        }
                    }
                    System.out.println("Your score is: " + counter);
                    System.out.println("End game.");
                    break;
                } else {
                    System.out.println("Invalid number of attempts.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                scanner.next(); // Clear the buffer
            }
        }
    }

    /**
     * Game mode where the user has unlimited attempts to guess the number.
     * The random number is generated between 1 and 50.
     */
    public static void unlimitedAttempts() {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 50 + 1);
        int counter = 0;
        int number = 0;

        // Loop until the user guesses the number
        while (true) {
            try {
                System.out.println("Enter a number (1-50): ");
                number = scanner.nextInt();

                // Check if the number is within the valid range (1-50)
                if (number >= 1 && number <= 50) {
                    counter++;
                    if (checkGuess(number, random)) {
                        break;
                    }
                } else {
                    System.out.println("Invalid number. Choose from range 1-50.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                scanner.next(); // Clear the buffer
            }
        }
        System.out.println("Your score is: " + counter);
    }

    /**
     * Checks if the guessed number matches the random number.
     * Provides feedback to the user whether their guess is too high, too low, or correct.2
     */
    public static boolean checkGuess(int number, int random) {
        if (number > random) {
            System.out.println("The given number is higher than the drawn number.");
            return false;
        } else if (number < random) {
            System.out.println("The given number is lower than the drawn number.");
            return false;
        } else {
            System.out.println("Yes, it is the drawn number! You win!");
            return true;
        }
    }
}
