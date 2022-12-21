import Board.Board;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.prepareBoard();
        System.out.println(board);
    }
}