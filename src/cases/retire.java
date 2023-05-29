package cases;

import java.util.Scanner;

public class retire {
   public static void main(String[] args) {

        System.out.println("장바구니엔 5가지만 넣을 수 있습니다");
        System.out.println("- 입력 중 0원이면 입력되었던 값 합산");
        System.out.println("- 100원 이하로 입력 제한, 이상 시 0원 적용");
        System.out.println("장바구니엔 5가지 넣음");

        Scanner in = new Scanner(System.in);

        System.out.println("---계산 시작---");
        int[] price = new int[5];
        int i = 0;
        int j = 0;
        int sum = 0;

        for( i = 0; i < price.length; i = i +1){
            System.out.print((i + 1) + "번째 가격: ");
             price[i] = in.nextInt();
             if(price[i] == 0){
                break;
             } else if(price[i] > 100){  //100원 초과일때 
                System.out.println("100원 초과 0원 적용");  
                price[i] = 0;  //0원 적용
             }  
         }

         for (j = 0; j < price.length; j = j + 1){
            sum = sum + price[j];     
         }

         System.out.println("--- 담은 총합---");
         System.out.println("합계 : " + sum);
         System.out.println("");
         System.out.println("--- 계산 종료---");

   }
}
