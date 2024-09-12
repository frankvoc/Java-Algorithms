import java.util.ArrayList;
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu2 dinnerMenu2;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu2 dinnerMenu2){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu2 = dinnerMenu2;
    }
    public void printMenu() {
        if (pancakeHouseMenu != null) {
            Iterator pancakeIterator = pancakeHouseMenu.createIterator();
            System.out.println("MENU\n------\nPANCAKE HOUSE MENU");
            printMenu(pancakeIterator);
        }

        if (dinnerMenu2 != null) {
            Iterator dinnerIterator = dinnerMenu2.createIterator();
            System.out.println("\nMENU\n------\nDINNER MENU");
            printMenu(dinnerIterator);
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}