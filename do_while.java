public class do_while {
    public static void main(String[] args) {
        int number_int = 0;
        int number_decrease = 10;

        //Number increasing
        do{
            System.out.println("Number increasing range : "+number_int);
            number_int++;
        }while (number_int <= 10);

        //Number decreasing
        do {
            System.out.println("Number decreasing range : "+number_decrease);
            number_decrease--;
        }while (number_decrease >=0);

    }
}
