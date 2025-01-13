import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ChessService chessService = new ChessService();

    public static void main(String[] args) {
        System.out.println("This is chess 1 from Technogise");
        String input = "Queen, E4";
        System.out.println(invokeChessService(input));
    }

    public static String invokeChessService(String input){
        String piece = input.split(", ")[0];
        String position = input.split(", ")[1];
        if(piece.equals("Queen")){
            Queen queen = new Queen();
            return chessService.getStepsForPiece(queen, position);
        }else if(piece.equals("Pawn")){
            Pawn pawn = new Pawn();
            return chessService.getStepsForPiece(pawn, position);
        }else if(piece.equals("King")){
            King king  = new King();
            return chessService.getStepsForPiece(king, position);
        }else {
            System.out.println("This postitions for this piece can not calculated");
        }
        return null;
    }

}