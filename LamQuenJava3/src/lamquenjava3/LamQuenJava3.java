package lamquenjava3;

import java.util.ArrayList;
import java.util.Scanner;

public class LamQuenJava3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> cars = new ArrayList<Integer>();
        
        while(true){
            int n = sc.nextInt();
            
            cars.add(n);
            
            if(n==0) break;
        }
        int sum = 0;
        for(int x : cars){
            sum += x;
        }
        System.out.println(sum/cars.size());
    }       
}
