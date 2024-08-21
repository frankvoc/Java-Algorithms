public class Driver {
    public static void main(String[] args) {
        SLList genericLL = new SLList();
        genericLL.add(Integer.valueOf(5));
        genericLL.add(Integer.valueOf(3));
        genericLL.add(Integer.valueOf(10));
        genericLL.add(Integer.valueOf(-12));
        genericLL.printAll(System.out);
        
    }
}
