package firstDay.yaroslav;

/**
 * Created by hi on 06.02.2017.
 */
public class FirstApplication {
    public static void main(String[] args) {
        //  int nums []  ={1,};
        int i;
        int b=0;
        for (i = 1;; i = i + 2)  {
            b++;
            if (i==(1+(56-1)*2)) break;//формула арифметической прогрессии: a1+(n-1)*d, то есть последовательность
            // чисел (членов прогрессии), в которой каждое число, начиная со второго, получается из предыдущего добавлением
            // к нему постоянного числа d (шага, или разности прогрессии):
            System.out.println("порядковый номер "+ b + "=" +i);

        }



    }

}
