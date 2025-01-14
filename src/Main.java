import javax.swing.text.Position;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ChessService chessService = new ChessService();
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("This is chess 1 from Technogise");
        String input = "Queen, E4";
        System.out.println(invokeChessService(input));
    }

    public static String invokeChessService(String input){
        logger.info("Inside invokeChessService");

        String piece = input.split(", ")[0];
        String position = input.split(", ")[1];

        if(piece.equals("Queen")){
            logger.info("Queen is at position: "+ position);
            Queen queen = new Queen();
            return chessService.getStepsForPiece(queen, position);
        }else if(piece.equals("Pawn")){
            logger.info("Pawn is at position: "+ position);
            Pawn pawn = new Pawn();
            return chessService.getStepsForPiece(pawn, position);
        }else if(piece.equals("King")){
            logger.info("King is at position: "+ position);
            King king  = new King();
            return chessService.getStepsForPiece(king, position);
        }else {
            logger.info( "This postitions for this piece can not calculated");
        }
        return null;
    }

}