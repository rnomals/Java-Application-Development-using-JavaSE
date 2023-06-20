import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the group:");
        char group = input.next().charAt(0);

        switch(group){
            case 'A':
                System.out.println("Class Time Slot: 10:00 AM - 12:00 PM");
                //break;
            case 'B':
                System.out.println("Class Time Slot: 12:00 PM - 02:00 PM");
                break;
            case 'C':
                System.out.println("Class Time Slot: 02:00 PM - 04:00 PM");
                break;
            default:
                System.out.println("No such group");

        }
    }
}
