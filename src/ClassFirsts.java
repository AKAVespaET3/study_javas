public class ClassFirsts {
   public int second = 0; //이 변수는 밑에 funtion에서 가져다 쓸 수 있다.
    ClassFirsts(){
        System.out.println();
    }    
    ClassFirsts(int first){
        this.second = first;
        System.out.println(first);
    }    
    public int getSecond(){
        return this.second;
    }
}
// 생성자는 파라미터를 받아도 return이 없이도 돌 수 있다.
//