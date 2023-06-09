
public class Arrays {
    public String[] initialArrays(){
       String[] carsTypes = { "Volvo", "BMW","KIA", "Ford", "Mazda" };
        return carsTypes;
    } // 밑에 있는 오른쪽에 있는 부분을 리턴해서 넣어줌
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length); 
        for (int first = 0 ; first < cars.length ; first = first + 1) {
            System.out.print(cars[first]+ ", ");
        }
         System.out.println();
        // return 0;
        }

    }

