import java.util.Scanner;
public class Study {
    
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    System.out.println("A를 입력하시오 : " + A);
    System.out.println("B를 입력하시오 : " + B);
    System.out.println("A와 B의 합 : " + (A + B));
    in.close(); 
 }  
}
