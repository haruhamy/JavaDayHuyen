package lamquenjava;

import java.util.Scanner;

public class LamQuenJava3 {
    public static boolean nt(int a){
        // Số nguyên tố phải lớn hơn 1
        if(a < 2){
            return false;
        }
        
        // Duyệt từ 2 đến căn bậc hai của a
        for(int i = 2; i <= Math.sqrt(a); i++){
            // Nếu a chia hết cho i thì không phải là số nguyên tố
            if(a % i == 0){
                return false;
            }
        }
        
        // Nếu không chia hết cho số nào thì là số nguyên tố
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        if(nt(a)){
            System.out.print("Day la so nguyen to");
        }
        else{
            System.out.print("Day khong phai la so nguyen to");
        }
    }
}
