import java.util.HashMap;
import java.util.Map;

public class Queen implements ChessPiece{


    @Override
    public String getSteps(ChessBoard board, String position) {
        String result = "";


        String pos = String.valueOf(position.charAt(0));
        int col = board.getColumn(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));

        for (int j = col; j<8; j++){
            result += board.getPosition(row, j)+" ";
        }
        for (int j=col-1; j>=0; j--){
            result += board.getPosition(row, j)+" ";
        }

        for (int i = row; i<8; i++){
            result += board.getPosition(i, col)+" ";
        }
        for (int i=row-1; i>=0; i--){
            result += board.getPosition(i, col)+" ";
        }

        int i=row+1, j=col+1;
        while(i< 8 && j<8){
            result += board.getPosition(i, j)+" ";
            i++;
            j++;
        }
        i=row+1;
        j=col-1;
        while(i<8 && j>=0){
            result += board.getPosition(i, j)+" ";
            i++;
            j--;
        }

        i=row-1;
        j=col-1;
        while(i>=0 && j>=0){
            result += board.getPosition(i, j)+" ";
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<8){
            result += board.getPosition(i, j)+" ";
            i--;
            j++;
        }

        return  result.trim();
    }
}
