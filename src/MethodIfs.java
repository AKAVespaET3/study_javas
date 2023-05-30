import java.util.Scanner;
 
public class MethodIfs {

    public String Times(int time){
        String str = "";
    try {
        if(time < 12){
            str = "오전 입니다.";
        } else if(time < 18){
            str = "오후 입니다.";
        } else {
            str = "밤 입니다.";
        }
    } catch (Exception e) {
        // TODO: handle exception
    }
    return str;
}
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MethodIfs methodIfs = new MethodIfs();
        
        while(true){
            System.out.println("시간을 입력하세요 : ");
            int time = in.nextInt();
            
            String result = methodIfs.Times(time);
        }
    }
}
