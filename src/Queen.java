import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Queen implements ChessPiece{
    private static final Logger logger = Logger.getLogger(Queen.class.getName());

    @Override
    public String getSteps(ChessBoard board, String position) {
        logger.info("Inside getSteps()");
        String result = "";


        String pos = String.valueOf(position.charAt(0));
        int col = board.getColumn(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));

        logger.info("The current position of the Pawn is [" + row + ", " +col+ "]");

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
