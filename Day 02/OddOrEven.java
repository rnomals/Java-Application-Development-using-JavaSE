import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:23");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an Even Number.");
        }else{
            System.out.println(number+" is an Odd Number.");
        }
    }
}
