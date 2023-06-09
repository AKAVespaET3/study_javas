import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {
      
        try {
            int[] numbers = {1,2,3};
            
            ArrayList arrayList = new ArrayList(); //Arraylist 묶음임, 자바 자료구조 알고리즘에 옴 
            arrayList.add(1); //true
            arrayList.add(2); //true
            arrayList.add(3); //true
            arrayList.add(4); //true
            System.out.println();    // list는 ARRAY임 Arraylist 랑 Array 랑 다른거하나 담는 그릇 갯수 제한이 없음
                                        //function 을 통해서 값은 넣고 뺄 수 있음
            arrayList.size(); // 단순한거 크기는 size 씀
            // int val = arrayList.get(2); //Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from Object to int.
            arrayList.set(1, 5);// 리스트 1번째 값을 5로 바꿔줌        } catch (Exception e) {
            arrayList.remove(0); // 리스트 0번째 값을 삭제
            arrayList.clear(); //완전 삭제

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
