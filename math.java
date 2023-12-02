import java.util.Random;

public class math {
    public static void main(String[] args) {
        System.out.println(Math.min(10,1002));
        System.out.println(Math.max(10,1002));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-199));
        System.out.println(Math.random());
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        //Random Number from 10 to 1000
        Random r = new Random();
        int low = 10;
        int upper = 100;
        int result = r.nextInt(upper-low) * low;
        System.out.println(result);

        //Boolean
        boolean isHaveMoney = true;
        boolean isGetJob = false;
        System.out.println(isHaveMoney);
        System.out.println(isGetJob);
        int x = 100;
        System.out.println(x==100);
    }
}