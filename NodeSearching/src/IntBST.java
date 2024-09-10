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
    public void breadthFirst(){
        IntBSTNode p = root;
        Queue queue = new Queue();
        if (p != null){
            queue.enqueue(p);
            while (!queue.isEmpty()){
                p = (IntBSTNode) queue.dequeue();
                visit(p);
                if(p.left != null)
                    queue.enqueue(p.left);
                if(p.right != null)
                    queue.enqueue(p.right);
            }
        }
    }
    public void inOrder(IntBSTNode p){
        if(p != null){
            inOrder(p.left);
            visit(p);
            inOrder(p.right);
        }
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

        myTree.breadthFirst();

        //myTree.inOrder(myTree.root);

        //System.out.println(myTree.search(myTree.root, 2).key);

    }
}
