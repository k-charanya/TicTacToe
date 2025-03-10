//  # TicTacToe
// Simple TicTacToe problem using the OOPs concept.

import static java.lang.Math.abs;

public class TicTacToe {
    private final int[][] board;
    private final int n;
    private final int[] rowSum, colSum;
    private int diagSum, revDiagSum;
    private int winner;

    public TicTacToe(final int n) {
        this.n = n;
        this.board = new int [n][n];
        this.rowSum = new int [n];
        this.colSum = new int [n];
    }

    /*
    * Makes a move on the board and returns the winner if the move is winning move
    *
    * @param player is either 0 or 1
    * @param row    is the move's row index
    * @param col    is the move's column index
    * @return winner +1 if first player,  -1 if second player and zero otherwise
    * @throws IllegalArgumentException if the move is an illegal move
     */

    public int move(int player, int row , int col) throws IllegalArgumentException {
        if (row < 0  ||  col < 0  ||  row >= n  || col >= n)
            throw new IllegalArgumentException("Move out of the boundary!");
        if (board[row][col] != 0)
            throw new IllegalArgumentException("Square is already occupied!");
        if (player != 0  &&  player != 1)
            throw new IllegalArgumentException("Invalid player!");
        if (getWinner() != 0)  throw new IllegalArgumentException("Board is decided!");

        player = player == 0 ? -1 : +1;
        board[row][col] = player;
        rowSum[row] += player;
        colSum[col] += player;
        if (row == col) diagSum += player;
        if (row == n-1-col) revDiagSum += player;
        if (rowSum[row] == abs(n) || colSum[col] == abs(n) || diagSum == abs(n) || revDiagSum == abs(n))  winner = player;
        return 0;
    }

    public int getWinner() {
        return winner;
    }
}
