public class HorizontalScrollBarDecorator extends WindowDecorator{
    public HorizontalScrollBarDecorator(Window decoratedWindow){
        super(decoratedWindow);
    }
    public void draw(){
        super.draw();
        drawHorizontalScrollBar();
    }
    private void drawHorizontalScrollBar(){
        System.out.println("Adding a Horizontal Scroll bar!");
    }
    public String getDescription(){
        return super.getDescription() + " with a horizontal scroll bar";
    }
}
