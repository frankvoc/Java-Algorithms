public class IntSLLNode {
    public int info;
    public IntSLLNode next;
    public IntSLLNode(int i){
        this(i,null);
    }
    public IntSLLNode(int i, IntSLLNode n){
        info = i;
        next = n;
    }
    public static void main(String[] args) {
        System.out.println("Connecting int nodes");
        IntSLLNode p = new IntSLLNode(10);
        System.out.println(p.info);
        p.next = new IntSLLNode(8);
        System.out.println(p.next.info);
        p.next.next = new IntSLLNode(50);
        System.out.println(p.next.next.info);
        p.next.next.next = new IntSLLNode(13);
        System.out.println(p.next.next.next.info);
        p.next.next.next.next = new IntSLLNode(-12);
        System.out.println(p.next.next.next.next.info);
    }
}
