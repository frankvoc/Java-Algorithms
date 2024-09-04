public class VerticalScrollBarDecorator  extends WindowDecorator{
    public VerticalScrollBarDecorator(Window decoratedWindow){
        super(decoratedWindow);
    }
    public void draw(){
        decoratedWindow.draw();
        drawVerticalScrollBar();
    }
    private void drawVerticalScrollBar(){
        System.out.println("Adding a Vertical Scroll bar!");
    }
    public String getDescription(){
        return decoratedWindow.getDescription() + " with a vertical scroll bar";
    }
}

