package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        int total = 0;
         do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
// *** create a new item and add it to the cart
            Item newItem = new Item(itemName, itemPrice, quantity);
            cart.add(newItem);
            total+=newItem.getQuantity()*newItem.getPrice();
            // *** print the contents of the cart object using println
            System.out.println("The content of cart :");
            for  (int i = 0; i < cart.size(); i++){
                System.out.println("item "+(i+1)+" : "+cart.get(i));

            }
            System.out.println("Total price is : "+total+"$");
            System.out.print ("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));

    }
}
