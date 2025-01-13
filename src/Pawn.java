import java.util.HashMap;
import java.util.Map;

public class Pawn implements ChessPiece{


    @Override
    public String getSteps(ChessBoard board, String position) {
        String result = "";

        Map<String, Integer> map= new HashMap<>();
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);
        map.put("D", 3);
        map.put("E", 4);
        map.put("F", 5);
        map.put("G", 6);
        map.put("H", 7);


        String pos = String.valueOf(position.charAt(0));
        int col = map.get(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));

        if(row-1 >= 0)
            result += board.getPosition(row-1, col);
        return  result;
    }
}
