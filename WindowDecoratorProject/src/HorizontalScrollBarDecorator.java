public class HorizontalScrollBarDecorator extends WindowDecorator{
    public HorizontalScrollBarDecorator(Window decoratedWindow){
        super(decoratedWindow);
    }
    public void draw(){
        decoratedWindow.draw();
        drawHorizontalScrollBar();
    }
    private void drawHorizontalScrollBar(){
        System.out.println("Adding a Horizontal Scroll bar!");
    }
    public String getDescription(){
        return decoratedWindow.getDescription() + " with a horizontal scroll bar";
    }
}
