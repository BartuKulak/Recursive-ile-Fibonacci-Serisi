import java.util.Scanner;
public class Main {

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        int a = input.nextInt();
        System.out.println(fibo(a));
    }
}