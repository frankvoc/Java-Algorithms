public class SLLNode {
    public Object info;
    public SLLNode next;
    public SLLNode(){
        next = null;
    }
    public SLLNode(Object elObject){
        info = elObject; next = null;
    }
    public SLLNode(Object elObject, SLLNode ptrNode){
        info = elObject; next=ptrNode;
    }
}
