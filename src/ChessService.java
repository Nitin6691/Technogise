import java.util.logging.Logger;

//This class for writing service logic related to Chessboard
public class ChessService {

    private final ChessBoard chessBoard = ChessBoard.getInstance();
    private static final Logger logger = Logger.getLogger(ChessService.class.getName());


    public String getStepsForPiece(ChessPiece peice, String position){
        logger.info("inside getStepsForPiece");
        return peice.getSteps(chessBoard, position);
    }
}
