
package lamquenjavaday2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so N: ");
        int n = scanner.nextInt();
        
        int fibonacci = fibonacci(n);
        
        System.out.println("So Fibonacci thu " + n + " la: " + fibonacci);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
