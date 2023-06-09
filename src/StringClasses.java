public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Jenna Kim";
     
            name.equalsIgnoreCase("Jenna Kim"); //true
            name.equalsIgnoreCase("Jenna"); // false
     
            String name_second = new String("Ashley Choi");
            name_second.equalsIgnoreCase("Ashley Choi"); //true 글자 같은지
            name_second.equalsIgnoreCase("Ashley"); //false
            name_second.length();  //11 글자 길이
            name_second = name_second.replaceAll("e","a"); //"Ashlay Choi
            String[] arrays = name_second.split(" "); //잘라낼 기준 정함 " " 공백 기준으로 자름
            name_second= name_second.substring(0, 5); //"Ashla"
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}


