package lamquenjava2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner canh = new Scanner(System.in);
        
        System.out.print ("nhap canh a:  ");
        int a = canh.nextInt();
        
        System.out.print ("nhap canh b:  ");
        int b = canh.nextInt();
        
        System.out.print ("nhap canh c:  ");
        int c = canh.nextInt();
        
        // ||
        if(a + b > c && a + c > b && b + c > a)
            System.out.println("la tam giac");
        else
             System.out.println("khong la tam giac");
            
            
        
    }
}
