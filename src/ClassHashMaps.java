import java.util.HashMap;
public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); //null
            hashMap.put("second", 2); //null
            hashMap.put("third", 3); //null
            hashMap.get("third"); //Integer@51 "3" 값 가져올 때
            hashMap.size(); // 3
            hashMap.put("second", 6); //Integer@44 "2" put으로 수정하기 
            hashMap.remove("second"); //Integer@61 "6" 삭제할때
            hashMap.keySet(); //HashMap$KeySet@70 size=2 키값 뭐?
                              // 0:"third", 1:"first"
            hashMap.values(); //HashMap$Values@77 size=2 values값 뭐?
            hashMap.clear(); // (void) 다 지워!
            
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
