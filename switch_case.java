public class switch_case {
    public static void main(String[] args) {
        int day = 4;
        switch (day){
            case 1:
                System.out.println("day 1");
                break;
            case 2:
                System.out.println("day 2");
                break;
            case 3:
                System.out.println("day 3");
                break;
            case 4:
                System.out.println("day 4");
                break;
        }

        //Using default
        int which_month = 12;
        switch (which_month){
            case 1:
                System.out.println("January");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Month not found....");
        }
    }
}
