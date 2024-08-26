public class SLList {
    protected SLLNode headNode = null;
    public SLList(){
    }
    public boolean isEmpty(){
        return headNode == null;
    }
    public Object firsObject(){
        return headNode.info;
    }
    public void printAll(java.io.PrintStream outStream){
        for(SLLNode tempNode = headNode;tempNode !=null; tempNode = tempNode.next)
            outStream.println(tempNode.info);
    }
    public void add(Object elObject){
        headNode = new SLLNode(elObject,headNode);
    }
    public Object findObject(Object elObject){
        SLLNode tempNode = headNode;
        for(; tempNode != null && !elObject.equals(tempNode.info); tempNode = tempNode.next);
        if(tempNode == null)
            return null;
        else return tempNode.info;
    }
    public Object delHead(){
        Object elObject = headNode.info;
        headNode = headNode.next;
        return elObject;
    }
    public void delete(Object elObject){
        if(headNode != null)
            if(elObject.equals(headNode.info))
                headNode = headNode.next;
            else{
                SLLNode prNode = headNode,tempNode = headNode.next;
                for( ; tempNode != null && !(tempNode.info.equals(elObject));
                    prNode = prNode.next, tempNode = tempNode.next);
                if(tempNode != null)
                    prNode.next = tempNode.next;
            }
    }

}
