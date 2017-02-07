package firstDay.yaroslav;

/**
 Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
 */
public class Forth {
    public static void main(String[] args) {
        int i, b;
        for (i = 2, b = 1; i >0; i = i * 2, b++) {
            if (b == 21) break;

            System.out.println("operation " + b + "=" + i);
        }
    }
}