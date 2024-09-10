public class IntBST {
    protected IntBSTNode root;
    public IntBST(){
        root = null;
    }
    protected void visit(IntBSTNode p){
        System.out.println(p.key + " ");
    }
    public void inset(int el){
        IntBSTNode p = root;
        IntBSTNode prev = null;
        while(p != null){
            prev = p;
            if(p.key < el)
                p = p.right;
            else 
            p = p.left;
        }
        if(root == null)
            root = new IntBSTNode(el);
        else if (prev.key < el)
            prev.right = new IntBSTNode(el);
        else prev.left = new IntBSTNode(el);
    }
    public IntBSTNode search(IntBSTNode p, int el){
        while (p != null)
            if (el == p.key)
                return p;
            else if (el < p.key)
                p = p.left;
            else p = p.right;
        return null;
    }
    public static void main(String[] args) {
        IntBST myTree = new IntBST();

        myTree.inset(13);
        myTree.inset(10);
        myTree.inset(2);
        myTree.inset(12);
        myTree.inset(25);
        myTree.inset(20);
        myTree.inset(31);
        myTree.inset(29);
        System.out.println(myTree.search(myTree.root, 2).key);

    }
}
