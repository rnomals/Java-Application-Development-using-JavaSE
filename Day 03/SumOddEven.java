import java.util.Scanner;

public class SumOddEven {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting value:");
        int min = input.nextInt();

        System.out.print("Enter the ending value:");
        int max = input.nextInt();

        int sumOdd = 0, sumEven = 0;
        for(int i = min; i <= max; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
        }

        System.out.println("Sum of Odd numbers: "+sumOdd);
        System.out.println("Sum of even numbers: "+sumEven);

    }
}
