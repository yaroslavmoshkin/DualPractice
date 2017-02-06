package firstDay.yaroslav;

/**
 * Created by hi on 06.02.2017.
 */
public class Second {
    public static void main(String[] args) {
        int i;
        for (i = 1000; i < 100000000; i = i + 3) {
            if (i>9999) break;
       //or
       // if(String.valueOf(i).length()>4) break;

            System.out.println(i);
        }
    }

}