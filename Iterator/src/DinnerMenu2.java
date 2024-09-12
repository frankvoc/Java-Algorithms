public class DinnerMenu2  {
    static final int MAX_ITEMS = 6;
    int numOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu2(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Facon Bacon with lettuce and tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce and tomato", false, 2.99);

        addItem("Soup of the Day", "Soup with Potato Salad", false,3.29);

        addItem("Hotdog", "A hotdog with relish and onions", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numOfItems >= MAX_ITEMS){
            System.err.println("Sorry menu is full!");
        }
        else{
            menuItems[numOfItems] = menuItem;
            numOfItems = numOfItems + 1;
        }
    }
    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}

