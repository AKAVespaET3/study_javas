public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters){
    //  body
    // }
   
    public int F(int x)
    {
        int result = x + 1;
        return result;
    }
    public int T(int y){
        int result = y + 1;
        return result;
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            MethodBasics methodBacsic = new MethodBasics(); //new 다음 클래스() 괄호 넣어서 function화 클래스도 변수에 담을 수 있음(인스턴스화) 클래스도 타입으로 쓸 수 있음
                                                            // new MethodBasics() 인스턴스화 function 리스트 볼 수 있음
            y = methodBacsic.F(x);

            y = methodBacsic.T(y);
            y = y + 1; // 변수에 + 1
        } catch (Exception e) {
            
        }
        System.out.println();
    }
}


