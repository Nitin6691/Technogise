
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestClass {

    private Main main;

    @Test
    public void testGetSteps(){
        String[] inputs = {"King D5",
                "Queen E4",
                "King A1",
                "King A8",
                "King H1",
                "King H8",
                "Pawn A1",
                "Pawn A8",
                "Pawn H8",
                "Pawn H1",
                "Queen A1",
                "Queen A8",
                "Queen H1",
                "Queen H8",
        };

        String[] expectedRes = {"C4, C5, C6, D4, D6, E4, E5, E6",
                "A4, B4, C4, D4, F4, G4, H4, E1, E2, E3, E5, E6, E7, E8, A8, B7, C6, D5, F3, G2, H1, B1, C2, D3, F5, G6, H7",
        "A2, B2, B1",
        "A7, B7, B8",
        "H2, G1, G2",
        "H7, G7, G8",
        "A2",
        "",
        "",
        "H2",
        "A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1, B2, C3, D4, E5, F6, G7, H8",
        "A1, A2, A3, A4, A5, A6, A7, B8, C8, D8, E8, F8, G8, H8, B7, C6, D5, E4, F3, G2, H1",
        "A8, B7, C6, D5, E4, F3, G2, A1, B1, C1, D1, E1, F1, G1, H2, H3, H4, H5, H6, H7, H8",
        "H1, H2, H3, H4, H5, H6, H7, A8, B8, C8, D8, E8, F8, G8, A1, B2, C3, D4, E5, F6, G7"};
        String[][] board = new String[8][8];

        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                board[i][j] = (Character.toString('A'+j))
                        + Integer.toString(8-i);
            }
        }
        for (int i = 0; i<inputs.length; i++) {
            String input = inputs[i];
            String steps = Main.getSteps(board, input);
            String expected = expectedRes[i];
            for (String pos: expected.split(", "))
                assertTrue(steps.contains(pos));
        }
    }
}
