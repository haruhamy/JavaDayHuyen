package lamquenjavaday2;

import java.util.Scanner;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Chon phep toan (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Loi: Khong the chia cho 0.");
                    return;
                }
                break;
            default:
                System.out.println("Phep toan khong hop le.");
                return;
        }
        
        System.out.println("Ket qua: " + result);
    }
    
}
