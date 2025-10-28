import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items are you purchasing? ");
        int items = sc.nextInt();
        double adder;
        double total = 0;
        for(int i=0; i < items; i++)
        {
            System.out.println("Price of item " + (i+1) + "?");
            adder = sc.nextDouble();
            total += adder;
        }
        System.out.println("Your cart has " + items + " items with a total cost of $" + total);
    }
}
