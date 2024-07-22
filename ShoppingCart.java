public class ShoppingCart {
    private ItemOrder[] orders;
    private int orderCount = 0;
    private boolean discount = false;
    //We need an array of item orders, we need to track our order count
    //and we also need to see if  a discount was applied to the program




    public ShoppingCart(int size) {
      orders = new ItemOrder[size];
    }
    //This is the constructor for the program, it will need to pass an integer
    //This will then set the size of the shopping cart for the rest of the program




    public void add(ItemOrder order) {
       for (int i = 0; i < orderCount; i++) {
           if (orders[i].getItem().getName().equals(order.getItem().getName())) {
               if (order.getQuantity() >= 0) {
                   orders[i].setQuantity(order.getQuantity());
               }
               return;
           }
       }
       if (order.getQuantity() > 0 && orderCount < orders.length) {
           orders[orderCount++] = order;
       }
   }
   //So this funciton will add an item to your shopping cart, it will first iterate throughout the array first
   //To see if you already have an existing order of the same item
   //This is so then a user can decide to set an item to whatever quantity they want in case they messed up their
   //input at the start
   //If this is not true, then we will then check to see if the quanity within our item order is above 0, since you cannot have
   //0 of an item, and then we will then check to see if the order count is still bellow the capacity of our shopping cart
   //We will then add the item order to the shopping cart placing it at the index of the current item order




    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    //This will set the discount to what the user will want
    //When we ask if they have a discount, we will then send back their reponse as either true or false
    //to our shopping cart object



    public double getTotal() {
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            total += orders[i].getPrice();
        }
        if (discount) {
            total *= 0.9; 
        }
        return total;
    }
    //This will get the total amount of our shopping cart
    //It will do this by using a for loop to traverse through the shopping carts array of items
    //It will then add them to a total double varaible that will hold the total amount
    //After, if discount is set to true by the user, then we will apply a 10 percent discoutn by mutliplying
    //The total by 0.9




    public void printCartItems() {
    if (orderCount == 0) {
        System.out.println("Your cart is empty.");
        return;
    }
    System.out.println("\nItems in your cart:");
        for (int i = 0; i < orderCount; i++) {
            System.out.print(orders[i].getItem().getName() + " x " + orders[i].getQuantity() + ": $" + String.format("%.2f", orders[i].getPrice()) + "\n");

        }
    }
    //This program will print out the items within your shopping cart with thier price and quantity
    //So it will first check to see if the cart is empty, if it is then it will print back that the price was empty
    //After this we will use our existing funcitons in other classes to then get the information that we are looking for
}
