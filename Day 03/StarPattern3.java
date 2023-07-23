import java.util.Scanner;

public class StarPattern3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int x = 0; x < num - i; x++){
                System.out.print(" ");
            }
            for(int y = 0; y < i; y++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
