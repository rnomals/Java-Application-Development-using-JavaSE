import java.util.Scanner;

public class LargestandMinimum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = input.nextInt();
        System.out.print("Enter the second number:");
        int number2 = input.nextInt();
        System.out.print("Enter the third number:");
        int number3 = input.nextInt();

        int largest = number1;
        int minimum = number1;

        if(number2 > number1 && number2 > number3){
            largest = number2;
        }else if(number3 > number1 && number3 > number2){
            largest = number3;
        }

        if(number2 < number1 && number2 < number3){
            minimum = number2;
        }else if(number3 < number1 && number3 < number2){
            minimum = number3;
        }

        System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+minimum);
    }
}
