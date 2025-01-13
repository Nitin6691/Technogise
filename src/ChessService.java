public class ChessService {
    private final ChessBoard chessBoard = ChessBoard.getInstance();

    public String getStepsForPiece(ChessPiece peice, String position){
        return peice.getSteps(chessBoard, position);
    }
}
