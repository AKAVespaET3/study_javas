import java.util.Scanner;

public class PollsWuthoutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름이 무엇입니까?");
        String name = sc.nextLine();
        System.out.println("이름: " + name);
        String[][] polls = {
            {"1. 문항. 당신은 하루에 커피를 몇 잔 마십니까?"}, 
            {"(1) 1잔, (2) 2잔, (3) 3잔, (4) 4잔, (5) 타잔"},
            {"2. 문항. 당신은 하루에 밥을 몇 끼 먹습니까?"}, 
            {"(1) 1끼, (2) 2끼, (3) 3끼, (4) 4끼, (5) 장끼"},
            {"3. 문항. 당신은 하루에 몇 번 양치를 합니까?"}, 
            {"(1) 1번, (2) 2번, (3) 3번, (4) 4번, (5) 안함"},
            {"4. 문항. 당신은 누구입니까?"}, 
            {"(1) 김명곤, (2) 제나아빠, (3) 국힙원탑, (4) 최지윤 남편 (5) GONI"}
        };
        String[] answers = new String[4]; // 배열의 크기는 4이지만 갖고 있는 실제 데이터는 없는 상태, 배열에 넣을 원소를 나중에 지정하고 싶을 땐 이러한 방식을 채택하면 된다.
        

        int count = 0;

        for (int second = 0; second < polls.length; second = second + 2) {
            System.out.println(polls[second][0]);
            System.out.println(polls[second + 1][0]);
            System.out.print("답하기: ");
            answers[count] = sc.nextLine();
            count = count + 1;
            System.out.println(); // 확인용
        }

        System.out.println("----------설문 종료----------");
        System.out.println("");
        System.out.println("----------설문 결과----------");
        
        for (int first = 0; first < answers.length; first = first + 1) {
            System.out.print("(first+1)" + answers[first] + " ");
        }
    }
}

