import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chessPieces = { 1, 1, 2, 2, 2, 8 };

        for (int i = 0; i < 6; i++) {
            int input = sc.nextInt();
            int result = chessPieces[i] - input;
            System.out.print(result + " ");
        }

        sc.close();
    }
}