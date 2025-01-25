# TicTacToe Game in Java

This project is a simple **Tic Tac Toe** game built in Java. It allows two players to play the game on a 3x3 grid by taking turns and determining the winner.

## Features
- Fully functional 3x3 Tic Tac Toe game.
- Handles player turns and validates moves.
- Determines the winner or a draw based on game rules.
- User-friendly text-based interface.

## How to Play
1. Two players take turns to place their marker (`X` or `O`) on the 3x3 grid.
2. Each player must input the **row** and **column** (0, 1, or 2) where they want to place their marker.
3. The game will end when:
   - A player aligns three markers horizontally, vertically, or diagonally.  
   - All spaces are filled with no winner, resulting in a draw.
4. The game announces the winner or declares a draw.

## Code Structure
- `SIZE`: The size of the game board (fixed at 3x3).
- `board`: A 2D array to store the state of the board.
- `initializeBoard()`: Prepares the board for a new game.
- `printBoard()`: Displays the current board state.
- `playerMove(player)`: Handles the move of a player (`X` or `O`).
- `checkWinner()`: Checks if a player has won or the game ended in a draw.
- `isLineEqual(a, b, c)`: Utility to check three markers for equality.

## Prerequisites
- Install the Java Development Kit (JDK) on your system.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tictactoe-java.git
   ```
2. Navigate to the project directory:
   ```bash
   cd tictactoe-java
   ```
3. Compile the code:
   ```bash
   javac TicTacToe.java
   ```
4. Run the program:
   ```bash
   java TicTacToe
   ```

## Example Gameplay
```
   |   |  
---+---+---
   |   |  
---+---+---
   |   |  
X's Turn: Enter row (0-2) and column (0-2):
```

## Contributions
Feel free to fork this repository and submit pull requests if you want to contribute or add features. Contributions are always welcome!

## License
This project is licensed under the [MIT License](LICENSE).
