import java.util.Scanner;
public class Power {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Base:");
        int base = input.nextInt();

        System.out.print("Enter the Exponenet:");
        int exponent = input.nextInt();

        System.out.println("Power is :"+power(base, exponent));

    }

    public static int power(int base, int expon){
        int value = 1;

        for(int i = 1; i <= expon; i++){
            value = value * base;
        }

        return value;
    }
}
