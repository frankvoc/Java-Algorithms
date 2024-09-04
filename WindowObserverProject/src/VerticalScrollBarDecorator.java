public class VerticalScrollBarDecorator  extends WindowDecorator{
    public VerticalScrollBarDecorator(Window decoratedWindow){
        super(decoratedWindow);
    }
    public void draw(){
        super.draw();
        drawVerticalScrollBar();
    }
    private void drawVerticalScrollBar(){
        System.out.println("Adding a Vertical Scroll bar!");
    }
    public String getDescription(){
        return super.getDescription() + " with a vertical scroll bar";
    }
}

