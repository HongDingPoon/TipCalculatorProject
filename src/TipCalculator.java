import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[]args){
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);

        // initialize variables
        int numOfPeople;
        int tipPercentage;
        double total = 0;
        double tempPrice = 0;
        double totalTip;

        // welcomes the user and asks for the amount of people and tip percentage as whole numbers
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        numOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercentage = scan.nextInt();
        scan.nextLine();

        // asks for the price for each item in dollars and cents. stops at -1.
        while (tempPrice != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            tempPrice = scan.nextDouble();
            scan.nextLine();
            total += tempPrice;
        }

        // set other variables and use DecimalFormat
        total ++;
        totalTip = (double) tipPercentage/100 * total;
        double total2 = total + totalTip;
        double perPerson = total/numOfPeople;
        double tipPerPerson = totalTip/numOfPeople;
        double perPerson2 = perPerson + tipPerPerson;
        String formattedTotal = formatter.format(total);
        String formattedTotalTip = formatter.format(totalTip);
        String formattedTotal2 = formatter.format(total2);
        String formattedPerPerson = formatter.format(perPerson);
        String formattedTipPerPerson = formatter.format(tipPerPerson);
        String formattedPerPerson2 = formatter.format(perPerson2);

        // print the remaining values
        System.out.println("______________________________");
        System.out.println("Total Bill Before Tip: " + formattedTotal);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total Bill With Tip: " + formattedTotal2 );
        System.out.println("Per Person Cost Before Tip: " + formattedPerPerson);
        System.out.println("Tip Per Person: " + formattedTipPerPerson);
        System.out.println("Total Cost Per Person: " + formattedPerPerson2);
    }

}