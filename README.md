# GuessTheNumber-game
A fun and interactive number guessing game written in JAVA! Try to guess the randomly generated number........

A lightweight, terminal-based number guessing game built with Java. 

I wrote this mini-game to practice basic Java control flows, console input handling, and standard math utility classes. The logic is straightforward: the app generates a secret number between 1 and 100, and you have exactly 5 high-stakes attempts to hunt it down.

----------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------
## 🔥 Key Highlights

* **Pure Vanilla Java:** Zero external dependencies or heavy frameworks—just clean, native code.
* **Smart Feedback Loop:** Instantly alerts you if your guess is too high or too low so you can strategize your next move.
* **Strict Attempt Limit:** A hard cap of 5 turns keeps the game fast, tactical, and challenging.
* **Modular Setup:** The core engine is separated into its own `Game()` method for cleaner execution and easier future updates.

----------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------

## 🎮 Game Loop Breakdown

1. Launch the program to spin up a new session.
2. The engine generates a random integer from `1` to `100`.
3. You get 5 attempts to crack the code.
4. After each incorrect guess, the console drops a hint:
   * ⬆️ *Target is greater than your guess.*
   * ⬇️ *Target is less than your guess.*
5. Nail the exact number to win, or run out of turns and face the reveal!

----------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------

## 🛠️ Built With

* **Language:** Java 8+
* **Packages utilized:** `java.util.Scanner` (Input handling) & `java.lang.Math` (Randomization engine)

----------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------

## 🚀 Quick Start

Got Java installed on your machine? You can run this locally in under 60 seconds:

```bash
# 1. Clone the repo
git clone https://github.com

# 2. Jump into the project folder
cd GuessTheNumber

# 3. Compile the source file
javac GuessTheNumber.java

# 4. Run the app
java GuessTheNumber
```

----------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------

## 🕹️ Code Architecture Overview

Here is a quick look at the central loop handling the player logic and checking constraints:

```java
int num = 1 + (int)(100 * Math.random());
int K = 5;

for (int i = 0; i < K; i++) {
    System.out.println("Enter Your guess number:");
    int guess = sc.nextInt();
    
    if (guess == num) {
        System.out.println("Congratulations! You Won");
        return;
    }
    // High / Low conditions handle the rest of the loop...
}
```

----------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------

## 💡 Future Roadmap & Contributions

This was built as a fundamental coding exercise, but there is plenty of room to grow. If you want to jump in and improve it, feel free to fork the repo and submit a PR! A few ideas I'm thinking about adding:
* [ ] A `while` loop wrapping the game to allow instant replays without re-running the command line.
* [ ] Input validation (`try-catch` block) so the program doesn't crash if someone accidentally types a letter.
* [ ] Selectable difficulty tiers (e.g., Easy = 10 tries, Hard = 3 tries).
