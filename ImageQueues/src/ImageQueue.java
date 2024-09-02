import java.util.LinkedList;
import java.util.Queue;
public class ImageQueue {
    private Queue<Image> q;
    public ImageQueue(){
        q = new LinkedList<>();
    }
    public void enqueue(Image img){
        q.add(img);
    }
    public Image dequeue(){
        return  q.remove();
    }
    public Image peek(){
        return q.peek();
    }
}
