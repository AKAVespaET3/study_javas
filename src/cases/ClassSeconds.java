package cases;

public class ClassSeconds {
    public int third = 0;
    public ClassSeconds(){

    }

    public ClassSeconds(int first){
        System.out.println(first);
        this.third = first;
    }
    public int getThird(){
        return this.third;
    }
}
