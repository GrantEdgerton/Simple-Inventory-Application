public class Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;
    //This is the main building block of our program,
    //This will hace 4 traits, that will allow us to create items




    public Item(String name, double price) {
        this(name, price, 0, 0.0);
    }





    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    //In this program we will have two constructors, one for items that do not have bulk discounts 
    //and one for items that do have bulk discounts
    //We can overload the constructor so then the user can have more options when creating and instance of an item



    public String getName() {
        return name;
    }
    //This will return the name of the item back to main





    public double getPrice() {
        return price;
    }
    //This will get the price of the item




    public double getBulkPrice() {
        return bulkPrice;
    }
    //This will get the bulk price of the item




    public int getBulkQuantity() {
        return bulkQuantity;
    }
    //This will get the bulk quantity of the program




    public double priceFor(int quantity) {
        if (bulkQuantity > 0 && quantity >= bulkQuantity) {
            return (quantity / bulkQuantity) * bulkPrice + (quantity % bulkQuantity) * price;
        } else {
            return quantity * price;
        }
    }   
    //This will check to see if the bulk quantity is above 0, so then items that did not get initlized will not crash
    //The program since their values could be set to 0, and that the  quantity is greater than of equal to bulk wuantiyt
    //Because if the user does buy the amount of bulk needed, that means that they just need to go over to get the 
    //actual discount
    //After this we use integre division, which will return a whole inetger making it easy, and then finding 
    //the remainder if the quantity is not equal to the bulk quantity then we will be able to calculate the price
    //Of the remaining items that do not apply to the bulk quantity




    public String toString() {
        if (bulkQuantity > 0) {
            return name + ", $" + String.format("%.2f", price) + 
                   " (" + bulkQuantity + " for $" + String.format("%.2f", bulkPrice) + ")";
        } else {
            return name + ", $" + String.format("%.2f", price);
        }
    }




}
