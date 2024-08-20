public class Driver {

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        SLList genericLL = new SLList();
        genericLL.add(new Integer(5));
        genericLL.add(new Integer(3));
        genericLL.add(new Integer(10));
        genericLL.printAll(System.out);
        
    }
}
