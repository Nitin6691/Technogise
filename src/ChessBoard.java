import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private static ChessBoard chessBoard;

    String[][] board = new String[8][8];

    private final Map<String, Integer> map= new HashMap<>();


    private ChessBoard(){
        for (int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (Character.toString('A' + j))
                        + (8 - i);
            }
        }

        //Map to store column index corresponding to the Letter used for determining position on Chessboard
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);
        map.put("D", 3);
        map.put("E", 4);
        map.put("F", 5);
        map.put("G", 6);
        map.put("H", 7);
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

    public int getColumn(String pos){
        return map.get(pos);
    }
}
