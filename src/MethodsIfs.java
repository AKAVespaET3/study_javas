public class MethodsIfs {

    public int time(int times){

        if (times < 12 ) {
            System.out.println("오전 입니다");
        } else if (times < 18 ) {
            System.out.println("오후 입니다");
        } else {
            System.out.println("밤 입니다");
        }
        return times;
    }
        
    
    
    public static void main(String[] args) {
      
        try {
            int time = 0;

            MethodsIfs methodsIfs = new MethodsIfs();
            
            int result = methodsIfs.time(10);
            System.out.println(result);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
