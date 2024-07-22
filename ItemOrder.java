public class ItemOrder {
    private Item item;
    private int quantity;
    //This is the item order class. For this class we need to make an item order that will allow us to place items into our shopping cart
    //We can do this by getting the actual item that has been created within the program earlier within the program
    //and the users enetered quantity of how many items they would like to add to their cart


    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    //Like every object that is created within programming we first need to start out with creating a constrcutor
    //A constructor is a part of a class that is a requirement to create a new instance of a class type
    //In this program you will need to pass an Item that has been created as well as the quantity
    //of said item that you would like to have


    public Item getItem() {
        return item;
    }
    //This is a function that will return the item within the item order when called
    //This funciton can be used to access the contents of the item within the order such as the price
    //name, bulk quantity, and bulk price



    public int getQuantity() {
        return quantity;
    }
    //get quantity is another funciton that will return the quantity of the item order
    //This will be used mainly to either return back the value to either print out how many items we are ordering
    //Or it can utilized to also get the total of all itemOrders within the shopp

    public double getPrice() {
        return item.priceFor(quantity);
    }
    //This will return the price of the the item order back to the shopping cart so then we can caluclate the bill

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //This will allow us to set the quantity within the itemOrder object
}

