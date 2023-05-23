public class Ifs {
    public static void main(String[] args) {
        // if (condition) {
        //     // block of code to be executed if the condition is true 꼭 트루일때는 else 부분 안 써도 됨
        //   } else{

        // } 
        //     int a = 20 ;
        //     int b = 18 ;

        // if (a > b) {
        //     System.out.println(a);
        // }

        // 12시 이전 오전, 18시 이후, 24시까지 밤

        int times = 15;

        // if (times < 12 ) {
        //     System.out.println("오전 입니다");
        // }
        
        // if (times < 18 ) {
        //     System.out.println("오후 입니다");
        // }
        
        // if (times < 24 ) {
        //     System.out.println("밤 입니다");
        // }

        if (times < 12 ) {
            System.out.println("오전 입니다");
        } else if (times < 18 ) {
            System.out.println("오후 입니다");
        } else {
            System.out.println("밤 입니다");
        }
        
        System.out.println("Hello, World!");
        
        // return 0;
        
    }
}
