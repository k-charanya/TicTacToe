//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe(3);
        System.out.println(ticTacToe.move(0, 1, 1));
        System.out.println(ticTacToe.move(1, 0, 0));
        System.out.println(ticTacToe.move(0, 0, 1));
        System.out.println(ticTacToe.move(1, 1, 0));
        System.out.println(ticTacToe.move(0, 2, 1));
    }
}