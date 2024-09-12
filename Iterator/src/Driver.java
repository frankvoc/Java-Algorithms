public class Driver {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu2 dinnerMenu2 = new DinnerMenu2();
        Waitress alice = new Waitress(pancakeHouseMenu, dinnerMenu2);
        alice.printMenu();
    }
}
