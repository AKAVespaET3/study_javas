package cases;

import java.util.Scanner;

public class Quest {
 
    public static void main(String[] args) {
        

        try {
            Scanner in = new Scanner(System.in);
            String menu = "";
            boolean loops = true;

            System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("-----------작동 KEY----------");
            System.out.println("(E) or exit : 종료");
            System.out.println("(P) or poll : 설문 시작");
            System.out.println("(S) or Statistic : 설문 통계");

            

            while(loops){

                menu = in.nextLine();
                if(menu.equals("E") ){

                    System.out.println("선택입력 : E or Exit");
                    System.out.println("----------설문 종료----------"); 
                    break;

                } else if(menu.equals("exit")){

                    System.out.println("선택입력 : E or Exit");
                    System.out.println("----------설문 종료----------");
                    break;
                    
                } else if(menu.equals("P")){

                    System.out.println("선택입력 : P or Poll");
                    System.out.println("----------설문 시작----------");
                    
                } else if(menu.equals("poll")){

                    System.out.println("선택입력 : P or Poll");
                    System.out.println("----------설문 시작----------");

                } else if(menu.equals("S")){
                    
                    System.out.println("선택입력 : S or Statistic");
                    System.out.println("----------설문 통계----------");  

                } else if(menu.equals("statistic")){

                    System.out.println("선택입력 : S or Statistic");
                    System.out.println("----------설문 통계----------"); 

                } else {
                    System.out.println("해당사항이 없습니다. 다시 선택 해주세요");
                    
                }
                
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;

    }
}

