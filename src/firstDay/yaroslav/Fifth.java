package firstDay.yaroslav;

/**
 Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 … используя массив
 */
public class Fifth {
    public static void main(String[] args) {
        int num[] = new int[20];
        int i, k = 2;

        for (i = 0; i < num.length; i++) {
            num[i] = k;
            k *= 2 ;


                System.out.println("operator= " + num[i]);

            }
        }
    }
