import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long rate = 23000;
        System.out.println("Nhập vào USD");
        double Vnd = scanner.nextDouble();
        double result = rate * Vnd;
        System.out.println("KQ là: "+result);
    }
}