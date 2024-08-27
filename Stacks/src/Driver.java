public class Driver {
    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.push(new Integer(10));
        stack.push(new Integer(5));
        stack.push(new Integer(7));
        stack.push(new Integer(11));
        stack.push(new Integer(14));
        System.out.println(((Integer)stack.topEl()).toString());
    }
}
