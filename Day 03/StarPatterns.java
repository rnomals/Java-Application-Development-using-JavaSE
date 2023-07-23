import java.util.Scanner;

public class StarPatterns {
    public static void main(String args[]){

       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
       

        for(int i = 1; i <= num; i++){
            for(int x=1; x <= num; x++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}
