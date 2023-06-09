import java.util.Scanner;

public class MethodSwitchs {

    public String today(int day) {
        String str = "";
        try {
            switch (day) {
                case 1:
                    str = "Mon";
                    break;
                case 2:
                    str = "Tue";
                    break;
                case 3:
                    str = "Wen";
                    break;
                case 4:
                    str = "Thu";
                    break;
            }
        } catch (Exception e) {
           
        }
        return str;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            int day = in.nextInt(); // 1 ~ 4 가능
            MethodSwitchs methodSwitchs = new MethodSwitchs();

            String returnResult = methodSwitchs.today(day);
            System.out.println(returnResult);

            in.close();

        } catch (Exception e) {
           
        }
        // return 0;
    }

}
