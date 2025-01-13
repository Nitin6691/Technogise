import java.util.HashMap;
import java.util.Map;

public class Pawn implements ChessPiece{


    @Override
    public String getSteps(ChessBoard board, String position) {
        String result = "";


        String pos = String.valueOf(position.charAt(0));
        int col = board.getColumn(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));

        if(row-1 >= 0)
            result += board.getPosition(row-1, col);
        return  result;
    }
}
