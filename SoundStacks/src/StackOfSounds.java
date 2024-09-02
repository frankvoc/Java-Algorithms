import java.util.Stack;
public class StackOfSounds {
    private Stack<Sound> stack;
    public StackOfSounds(){
        stack = new Stack<>();
    }
    public void push (Sound sound){
        stack.push(sound);
    }
    public Sound pop(){
        if(isEmpty())
        throw new java.util.EmptyStackException();
    return stack.removeLast();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public Sound peek(){
        if(!stack.isEmpty()){
            return stack.peek();
        }else{
            return null;
        }
    }
}
