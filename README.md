# Number Guessing Game (Java)

[Roadmap.sh - Back-End Project](https://roadmap.sh/projects/number-guessing-game)

A simple and interactive command-line **Number Guessing Game** built with Java. The program generates a random number between 0 and 99, and the player tries to guess it based on hints provided by the system within a limited number of attempts.

## 🚀 Features

* **3 Difficulty Levels**:
    * **Easy**: 10 attempts
    * **Medium**: 5 attempts
    * **Hard**: 3 attempts
* **Dynamic Hints**: The game tells you whether the secret number is *greater* or *less* than your current guess.
* **Score Tracking**: Displays the total number of attempts it took to guess correctly.

## 🛠️ Requirements

* **Java Development Kit (JDK)** 8 or higher.
* Any IDE (IntelliJ IDEA, Eclipse, VS Code) or Terminal.

## 🔧 How to Run

1. **Clone the repository** (or download the source code):
   ```bash
   git clone https://github.com
   ```

2. **Navigate to the project directory**:
   ```bash
   cd number-guessing-game/src/main/java/org/example
   ```

3. **Compile the Java file**:
   ```bash
   javac Main.java
   ```

4. **Run the application**:
   ```bash
   java Main
   ```

## 🎮 How to Play

1. Run the game in your terminal.
2. Select your desired difficulty level by typing `1`, `2`, or `3`.
3. Enter your guesses when prompted.
4. Follow the hints (`greater than` or `less than`) to adjust your next guess.
5. Win by guessing the correct number before running out of chances!

## 📝 Code Structure

* **`Main.java`**: Contains the core logic of the game, including the difficulty selection menu and the game loop handling the player's inputs and hints.

## 🖥️ Gameplay Previews

### Example 1: Winning the game (Medium Difficulty)
```text
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2
Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess: 50

This number is greater than 50

Enter your guess: 75

This number is less than 75

Enter your guess: 62

Congratulations! You guessed the correct number in 3 attempts.
That number was 62
```

### Example 2: Running out of chances (Hard Difficulty)
```text
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 3
Great! You have selected the Hard difficulty level.
Let's start the game!

Enter your guess: 50

This number is less than 50

Enter your guess: 25

This number is greater than 25

Enter your guess: 35

This number is greater than 35
That number was 42
```
