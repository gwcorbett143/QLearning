import java.util.Random;

public class QLearningTest {
    public static void main(String[] args) {
        String[][] field;
        field = new String[5][5];
        Random r = new Random();

        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = "0";
            }
        }

        for (int i = 0; i < 1; i++) {
            field[r.nextInt(5)][r.nextInt(5)] = "X";
        }
        for (int i = 0; i < 1; i++) {
            int leftNum = r.nextInt(5);
            int rightNum = r.nextInt(5);
            if (!field[leftNum][rightNum].equals("X")) {
                field[leftNum][rightNum] = "F";
            }
        }

        for (int row1 = 0; row1 < field.length; row1++) {
            for (int col1 = 0; col1 < field[row1].length; col1++) {
                System.out.print(field[row1][col1] + "  ");
            }
            System.out.println();
        }
    }

}