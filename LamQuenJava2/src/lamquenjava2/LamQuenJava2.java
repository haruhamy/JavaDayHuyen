package lamquenjava2;
import java.util.Scanner;
public class LamQuenJava2 {
    
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        long X = so.nextLong();
        long Y = so.nextLong();
        long Z = so.nextLong();
        long T= so.nextLong();

        System.out.println(Y + "," + Z + ","  + X + "," + T);
        
        System.out.println(X + Y + Z + T);
        
        System.out.println(X - Y + Z * T);      
    }    
}
