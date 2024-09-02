public class Driver {
    public static void main(String[] args) {
        StackOfSounds stackOfSounds = new StackOfSounds();
        //creating and pushing
        stackOfSounds.push(new Sound("1. Ding",15));
        stackOfSounds.push(new Sound("2. Gong", 5));
        stackOfSounds.push(new Sound("3. Boom", 20));
        stackOfSounds.push(new Sound("4. Buzz", 2));
        stackOfSounds.push(new Sound("5. Bang", 25));
        Sound preTopEl = stackOfSounds.peek();
        if(preTopEl != null){
            System.out.println("Pre pop top element: " + preTopEl);
        }
        //popping 2 of them
        stackOfSounds.pop();
        stackOfSounds.pop();

        //printing the new top element
        Sound topEl = stackOfSounds.peek();
        if(topEl != null){
            System.out.println("New Top Element: " + topEl);
        }
    }
}
