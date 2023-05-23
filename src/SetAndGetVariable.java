public class SetAndGetVariable {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int first = 200;
        int second = 30;
        int third = 50;
        int fourth = 10;

        A = 1;
        B = 3;
        C = 5;
        D = 7;

        if (B == 3) {
            System.out.println(A = fourth);   
        } else {
            System.out.println(C = 5);
        }

        System.out.println(A + " " + B + " " + C + " " + D);

        if (D != 9) {
            System.out.println(B = 5);   
        } else {
            System.out.println(B = first);
        }
        
        System.out.println(A + " " + B + " " + C + " " + D);

        if (A == 10) {
            System.out.println(C = third);   
        } else {
            System.out.println(D = second);
        }
        
        System.out.println(A + " " + B + " " + C + " " + D);

    }
}