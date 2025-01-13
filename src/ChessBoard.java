public class ChessBoard {
    private static ChessBoard chessBoard;

    String[][] board = new String[8][8];

    private ChessBoard(){
        for (int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (Character.toString('A' + j))
                        + Integer.toString(8 - i);
            }
        }

    }

    public static ChessBoard getInstance() {
        if (chessBoard == null){
            chessBoard = new ChessBoard();
        }
        return chessBoard;
    }

    public String getPosition(int row, int col){
        return board[row][col];
    }

    //Move map from peice class to here
}
