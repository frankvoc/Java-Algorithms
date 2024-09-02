public class Driver {
    public static void main(String[] args) {
        ImageQueue imgQ = new ImageQueue();
        //create and enqueue 5 images
        imgQ.enqueue(new Image("1: Mona Lisa", "1920x1080"));
        imgQ.enqueue(new Image("2: Ocean", "2160x1440"));  
        imgQ.enqueue(new Image("3: Mountain", "1280x720"));
        imgQ.enqueue(new Image("4: Dog", "3840x2160"));
        imgQ.enqueue(new Image("5: Family", "1920x1080"));
        Image preD = imgQ.peek();
        System.out.println("Pre dequeued first element is: " + preD);
        imgQ.dequeue();
        imgQ.dequeue();
        Image postD = imgQ.peek();
        System.out.println("Post dequeued fist element is now: " + postD); 
        }
    }

