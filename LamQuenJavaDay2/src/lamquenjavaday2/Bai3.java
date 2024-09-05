package lamquenjavaday2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Chuoi dao nguoc: " + reversed);
    }
}
