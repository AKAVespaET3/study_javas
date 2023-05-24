public class LoopWithCounter {
    public static void main(String[] args) {
        
        int num = 1;
        int repeat = 5;
        int count = 1;

        while (count < repeat ) {
            System.out.println(num);
            num = num + 1;
            count = count + 1;
        }
    }
}
