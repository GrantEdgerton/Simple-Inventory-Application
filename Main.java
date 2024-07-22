import java.util.Scanner;
//We will only need the scanner for this project


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog("Store Catalog",7);
        ShoppingCart cart = new ShoppingCart(7);
        //We will three objects,
        //A scanner to get user input
        //a shopping cart to hold user added items
        //And a catalog that will organize created items within the program
    
        catalog.add(new Item("Apple", 2.00, 10, 15.0));
        catalog.add(new Item("Banana", 1.10, 10, 7.12));
        catalog.add(new Item("Orange", 0.79));
        catalog.add(new Item("Milk", 4.15));
        catalog.add(new Item("Bread", 2.99));
        catalog.add(new Item("Eggs", 2.89, 12, 3.49));
        catalog.add(new Item("Toilet Paper", 1.00, 20, 10.0));
        //We will then create items while adding them to our catalog
        //In this case we created 7, and we use both constructors to do this


        while (true) {
            System.out.println("\nAvailable products:");
            //We then create an infinite loop that will print out all items
            //available as well as numbers associated with the items
            //We will use a for loop to traverse through te catalog and print out all of the items features
            //With a number next to them associated what number they will need to enter to then get that item
            
            for (int i = 0; i < catalog.size(); i++) {
                Item item = catalog.get(i);
                if (item.getBulkQuantity() > 0) {
                    System.out.println((i + 1) + ": " + item.getName() + " - $" + item.getPrice() + 
                        " each or $" + item.getBulkPrice() + " for " + item.getBulkQuantity());
                } else {
                    System.out.println((i + 1) + ": " + item.getName() + " - $" + item.getPrice());
                }
            }

            System.out.println("Enter the number of the item you want to add to the cart (0 to finish): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 0) {
                break;
            }
            //0 Will be our exit program, that will then break the while true loop
            //We then will chekc to see if the item number is above 0, since we will not take a negative number, and then
            //If it is a valid number within the catalog
            //After this we will then ask the user to then enter the quantity of the item chosen they would like to buy
            //WE will then use the catalog funciton get, to get the item from the catalog and save it to a temporary variable
            //WE will then take the inputted integer associated with the quantity the user would like to buy
            //And the item that the user has chosen and then create an item order that we will then add to our cart
            if (itemNumber > 0 && itemNumber <= catalog.size()) {
                System.out.println("Enter the quantity: ");
                int quantity = scanner.nextInt();
                
                Item selectedItem = catalog.get(itemNumber - 1); 
                cart.add(new ItemOrder(selectedItem, quantity));
            } else {
                System.out.println("Invalid item number. Please select a valid item.");
            }
        }
        
        System.out.println("Do you have a discount code? (yes/no): ");
        String discountResponse = scanner.next();
        if (discountResponse.equalsIgnoreCase("yes")) {
            cart.setDiscount(true);
        } else {
            cart.setDiscount(false);
        }
        //WE then will ask the  user if they have a discount\
        //If they type in yes, then we will apply the discount to the shopping cart object
        //If they type in anything else then we will assume that they will not have a discount
        
        cart.printCartItems();
        //After thsi we will print out the contents of the shopping cart
        //And then print out the total cost for the user
        System.out.printf("Total cost: $%.2f\n", cart.getTotal());
        
        scanner.close();
        //And finally to end the program we will close the scanner and finish it.
    }
}
