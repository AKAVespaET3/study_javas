public class Arrays {
    public static void main(String[] args) {

        // String[] cars = { "Volvo", "BMW","KIA", "Ford", "Mazda" };
        // System.out.println(cars.length); 
        // for (int first = 0 ; first < cars.length ; first = first + 1) {
        //     System.out.print(cars[first]+ ", ");
        // }
        String[][] num = {{"10", "20", "30", "40"},
                        {"50", "60", "70"}};
       

        for(int second = 0; second < num.length ; second++){
            for(int third = 0; third < num[second].length; third++){
                System.out.print(num[second][third]+ " ");
            }
         System.out.println();
        }
                        // return 0;
    }
}
