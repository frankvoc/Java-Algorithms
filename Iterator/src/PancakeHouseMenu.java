import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("KBs Pancake Breakfast", "Pancakes with eggs and toast", true, 2.99);
        addItem("Regular pancake breakfast", "Pancakes with scrambled eggs, sausage", false, 2.99);
        addItem("Blueberry pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffle", "Waffles, with your choice of fruit", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
