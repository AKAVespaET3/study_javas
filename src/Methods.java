public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters){
    //  body
    // }
    public int minus (int first, int second){
        int result = 0;
        try {
           result = first - second ; 
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }


    public int add (int fisrt, int second){
        int result = 0;
        try {
           result = fisrt + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    
    public static void main(String[] args) {
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음
        // - main 결과값은 17
        int first = 0;
        int second = 0;
        int y = 0;
     try {
        Methods method = new Methods();
        for(int i = 0 ; i < 4; i = i + 1 ){
            y = y + method.add(2, 2);    
        } 
            y = y + method.minus(2, 1);
            
            System.out.println("y에 값은 : " + y);
     } catch (Exception e) {
        // TODO: handle exception
     }  
     //return 0; 
    }
}
