import java.util.Scanner;

public class StarPattern2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();

        for(int i = num; i >= 0; i--){
            for(int x = 0; x < i; x++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= num; i++){
            for(int x = 0; x <= num - i; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
