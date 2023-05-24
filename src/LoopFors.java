import java.util.Scanner;
public class LoopFors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // int second = 10;
        //  for (int first = 5 ; first < second ; first = first + 2) {
        //     System.out.println(first);
        //     // for (변수 선언; 컨디션; 변수 변경)
        //       }
        // System.out.println();
        // return 0;
        
        for (int first = in.nextInt() ; first < 10 ; first++){
            for(int j = 1 ; j < 10 ; j++){
                System.out.println(first + " * " + j + " = " + first * j);
            }
      
        }
        
    }    
}
