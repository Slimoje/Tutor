import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] numbers = new int[3][4];
        for (int r =0; r < numbers.length; r++){
            for(int c = 0; c < numbers[0].length; c++){
                numbers[r][c] = r+c;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        FileWriter fw = new FileWriter(new File("John.txt"), true);
        BufferedWriter bw = new BufferedWriter()
    }
}
