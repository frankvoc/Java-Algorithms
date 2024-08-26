public class Driver {
    public static void main(String[] args) {
        SLList genericLL = new SLList();
        genericLL.add(Integer.valueOf(53));
        genericLL.add(Integer.valueOf(13));
        genericLL.add(Integer.valueOf(55));
        genericLL.add(Integer.valueOf(513));
        genericLL.add(String.valueOf("Hello"));
        genericLL.printAll(System.out);
        
    }
}

