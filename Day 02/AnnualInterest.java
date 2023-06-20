import java.util.Scanner;

public class AnnualInterest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Account Type:");
        char accountType = input.next().charAt(0);
        System.out.print("Enter the Account Balance (Rs.):");
        float balance = input.nextFloat();

        float interestAmount;

        switch(accountType){
            case 'A': case 'C':
                interestAmount = balance * (1.5f / 100);
                System.out.println("Interest Amount : Rs."+interestAmount);
                break;
            case 'B':
                interestAmount = balance * (2f / 100);
                System.out.println("Interest Amount : Rs."+interestAmount);
                break;
            case 'X':
                interestAmount = balance * (5f / 100);
                System.out.println("Interest Amount : Rs."+interestAmount);
                break;
            default:
                System.out.println("Incorrect Account Type. Please try again!");

        }
    }
}
