
package lamquenjava;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner lamtron = new Scanner(System.in);
        
        double X = lamtron.nextDouble();
        //        Làm tròn Xuống số nguyên gần nhất
        System.out.println((long)Math.floor(X));
        
//        Làm tròn lên số nguyên gần nhất
        System.out.println((long)Math.ceil(X));
        

        
//        Làm tròn số nguyên phụ thuộc vào phần thập phân
        System.out.println((long)Math.round(X));

    }  
}
