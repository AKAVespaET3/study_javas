public class LoopNestedLoops {
    public static void main(String[] args) {
        
       
        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("For" + first + "입니다.");
            for (int second = 0; second < first; second = second + 1) {
                System.out.print("_? ");
            }
            System.out.println();
        }
        System.out.println("End");
   } 
}
