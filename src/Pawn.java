
import java.util.logging.Logger;


public class Pawn implements ChessPiece{
    private static final Logger logger = Logger.getLogger(Pawn.class.getName());

    @Override
    public String getSteps(ChessBoard board, String position) {
        logger.info("Inside getSteps()");
        String result = "";


        String pos = String.valueOf(position.charAt(0));
        int col = board.getColumn(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));

        logger.info("The current position of the Pawn is [" + row + ", " +col+ "]");

        if(row-1 >= 0)
            result += board.getPosition(row-1, col);
        return  result;
    }
}
