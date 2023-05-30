import java.util.Scanner;

public class WhileWithScanners {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // Try Catch문 사용
        // 루프 횟수가 정해져 있지 않으면 while, 루프 횟수가 정해져 있으면for문을 사용
        // java는 문자가 비교가 안됨. 숫자만 됨
        try {
            Scanner myObj = new Scanner(System.in); 
            boolean loops = true;
            String answer = "";
            System.out.println("안내입니다.");
            
            while(loops){ 
                System.out.println("1- 대출, 2- 예금, 3~9-종료");
                System.out.print("입력하셈 :");
                answer = myObj.nextLine();

                if(answer.equals("1")){
                    System.out.println("대출 업무입니다요.");
                } else if(answer.equals("2")){
                    System.out.println("예금 업무입니다요.");
                } else{
                    System.out.println("안내가 종료됩니다요");
                    break;
                } 

            }
           myObj.close();
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;

    }
}
