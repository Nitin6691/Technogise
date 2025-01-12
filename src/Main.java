import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is chess 1 from Technogise");

        String input = "Queen E4";
        /*String[][] board = new String[8][8];

        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                board[i][j] = (Character.toString('A'+j))
                        + Integer.toString(8-i);
            }
        }*/

        /*for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                System.out.print(board[i][j] + " " );
            }
            System.out.println();
        }*/

//        System.out.println(getSteps(board, input));
    }

    public static String getSteps(String[][] board, String input){
        String peice = input.split(" ")[0];
        String position = input.split(" ")[1];
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

        System.out.println("Peice is "+peice +" and position is "+position);
        System.out.println("Calculating reachable positions");

        String pos = String.valueOf(position.charAt(0));
        int col = map.get(pos);
        int row = 8 - Integer.parseInt(String.valueOf(position.charAt(1)));
//        System.out.println("row and column: "+row+" "+col);

        if(peice.equals("Queen")){

            for (int j = col; j<8; j++){
                result += board[row][j]+" ";
            }
            for (int j=col-1; j>=0; j--){
                result += board[row][j]+" ";
            }

            for (int i = row; i<8; i++){
                result += board[i][col]+" ";
            }
            for (int i=row-1; i>=0; i--){
                result += board[i][col]+" ";
            }

            int i=row+1, j=col+1;
            while(i< 8 && j<8){
                result += board[i][j]+" ";
                i++;
                j++;
            }
            i=row+1;
            j=col-1;
            while(i<8 && j>=0){
                result += board[i][j]+" ";
                i++;
                j--;
            }

            i=row-1;
            j=col-1;
            while(i>=0 && j>=0){
                result += board[i][j]+" ";
                i--;
                j--;
            }
            i=row-1;
            j=col+1;
            while(i>=0 && j<8){
                result += board[i][j]+" ";
                i--;
                j++;
            }

            return  result.trim();
        }else if(peice.equals("Pawn")){
            if(row-1 >= 0)
                result += board[row-1][col];
            return  result;
        }else if(peice.equals("King")){
            if (row-1>=0)
                result += board[row-1][col]+" ";
            if (row-1 >= 0 && col+1 < 8)
                result += board[row-1][col+1]+" ";
            if (row-1 >= 0 && col-1 >= 0)
                result += board[row-1][col-1]+" ";
            if (col-1 >= 0)
                result += board[row][col-1]+" ";
            if (col+1 < 8)
                result += board[row][col+1]+" ";
            if (row+1 < 8)
                result += board[row+1][col]+" ";
            if (row+1< 8 && col+1 < 8)
                result += board[row+1][col+1]+" ";
            if (row+1< 8 && col-1 >= 0)
                result += board[row+1][col-1];
            return result.trim();
        }else {
            System.out.println("This postitions for this peice can not calculated");
        }
        return null;
    }

}