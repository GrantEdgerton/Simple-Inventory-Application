public class Catalog {
    private Item[] items;
    private int itemCount = 0;
    private String name;
    //This is the catalog class, we have three traits, and array of items that will be cinitlized through the constrcutor
    //we have an item count so then we can keep track of how many items have been added to our catalog
    //and so then we will be able to then allow the user to chose what item they would like to chose
    //usinng the item number
    //and we have a string for the name, in case you would like to make multipile catalogs




    public Catalog(String name, int size) {
        this.name = name;
        this.items = new Item[size];
    }
    //here is our constructor for our program, this will get the name and the size that we will make our catalog
    //you need to pass an int and a string when creating a new catalog object




    public void add(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        }else{
            System.out.println("The Catalog is full!");
        }

    }
    //This is the add feature, it is where we will be able to add items to the catalog
    //we start off the make sure that the item count it not greater than the length of our catalog so then
    //we do not try to add anything to the catalog if it is not full and we will ensure that the user will know



    public int size() {
        return itemCount;
    }

    //This will return the current size of the catalog in case the user wants to know how many more slots
    //It has to add items to it

   public Item get(int index) {
       if (index >= 0 && index < itemCount) {
         return items[index];
      }
      return null; 
   }
   //This function will return back an item that we would like to add to our cart.

    public String getName() {
        return name;
    }
    //This function will return the name of our catalog to the user if called
}
