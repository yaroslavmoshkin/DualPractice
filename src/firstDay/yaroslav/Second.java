package firstDay.yaroslav;

/**
 Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
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