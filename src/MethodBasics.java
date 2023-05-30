public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters){
    //  body
    // }
   
    public int F(int x)
    {
        int result = x + 1;
        return result;
    }
    
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            y = x + 1;
            y = y + 1; 
        } catch (Exception e) {
            
        }
        System.out.println();
    }
}


