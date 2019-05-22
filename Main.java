/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {
    
    Scanner sc;
    
    public Main(){
        sc = new Scanner(System.in);
        
    }

    public static void main(String[] args){

    }
    
    public void printSum(){
        int target = getInt();
        int sum = 0;
        for(int i=1;i<=target;i++){
            sum += i;
        }
        System.out.printf("The sum of the numbers 1 to %d is %d\n", target, sum);
         
        
        
    }
    
    public int getInt(){
        int target = -1;
        while(target < 1){
            System.out.print("Enter a number greater than 1: ");
            target = sc.nextInt();
        }
        return target;
    }
    
    public void testAnswers(){
        for(int i=1;i<11;i++){
            int sum = 0;
            System.out.print(i + ": ");
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println("--> " + sum);
        }
            
    }
}
