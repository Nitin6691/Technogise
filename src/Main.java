
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final ChessService chessService = new ChessService();
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("This is chess 1 from Technogise");
        List<String> inputs = new ArrayList<>();
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("input.txt");

        if (inputStream != null){
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;

            while (true){
                try {
                    line = reader.readLine();
                    if(line != null)
                        inputs.add(line);
                    else
                        break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        for (String input: inputs) {
            logger.info("Going to call invokeChessService for "+input);
            System.out.println(invokeChessService(input.substring(1, input.length()-1)));
        }

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