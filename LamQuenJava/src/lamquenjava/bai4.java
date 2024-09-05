
package lamquenjava;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner can = new Scanner(System.in);
        
        long N = can.nextLong();
        System.out.printf("%.2f",Math.sqrt(N));
        System.out.println();
        System.out.printf("%.3f",Math.cbrt(N));
        
    }
    
}
