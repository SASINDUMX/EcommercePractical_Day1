import java.util.*;

public class One{
    public static void main(String [] args){
        //Q1
        System.out.println("Hello World...");

        System.out.println("----------------------------------------");

        //Q2
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("----------------------------------------");

        //Q3
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }

        System.out.println("----------------------------------------");

        //Q3
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }

        System.out.println("----------------------------------------");
        //Q4
        for (int i=1; i<=20; i++){
            if (i%2==1){
                System.out.println(i);
            }            
        }

        System.out.println("----------------------------------------");
        //Q5
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = S.nextInt();
        int mid = (num/2) + 1;
        for (int i=1; i<=num; i++){
             if(i<=mid - 1){
                System.out.print((mid - i) + " ");
             }
             else if (i == mid){
                System.out.print(mid + " ");
             }
             else{
                System.out.print((num - (i - mid - 1)) + " ");
             }      
        }

    }
}