import java.util.Scanner;
public class Study {
    
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    for(int C = 0; C < 6; C++ ){
        System.out.println(A+B);
        A = in.nextInt();
        B = in.nextInt();      
        in.close();  
    }
 }  
}
