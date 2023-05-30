package cases;

import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            System.out.println("장바구니엔 5가지만 넣을 수 있습니다");
            System.out.println("- 입력 중 0원이면 입력되었던 값 합산");
            System.out.println("- 100원 이하로 입력 제한, 이상 시 0원 적용");
            System.out.println("장바구니엔 5가지 넣음");
            
            int sum = 0;
            int[] values = new int[5];
            Scanner sc = new Scanner(System.in);
            

            for (int first = 0; first < values.length; first++) {
                System.out.print((first + 1) + "번째 가격: ");
                int input = sc.nextInt();

                if (input == 0){
                    break;
                } else if(input <= 100) {
                    values[first] = input;
                } else {
                    values[first] = 0;
                }
            }
               

            for (int second = 0; second < values.length; second++) {
                 sum += values[second];
            }

            System.out.println("--- 담은 총합---");
            System.out.println("합계 : " + sum);
            System.out.println("");
            System.out.println("--- 계산 종료---");
            sc.close(); 
        } catch (Exception e) {
            
        } finally {

        }
        System.out.println();
        
        // return 0;
    }

}
