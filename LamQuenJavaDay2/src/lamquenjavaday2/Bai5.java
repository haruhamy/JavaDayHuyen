package lamquenjavaday2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        
        // Tinh tong cac uoc cua num (ngoai tru chinh no)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // Kiem tra xem tong co bang chinh so do khong
        if (sum == num && num != 0) {
            System.out.println(num + " la so hoan hao.");
        } else {
            System.out.println(num + " khong phai la so hoan hao.");
        }
    }
}
