public abstract class WindowDecorator implements Window{
    //decorate the window here
    protected Window decoratedWindow;
    public WindowDecorator(Window decoratedWindow){
        this.decoratedWindow = decoratedWindow;
    }
    public void draw(){
        //the draw call is now to the window being decorated
        decoratedWindow.draw();
    }
    public String getDescription(){
        return decoratedWindow.getDescription(); //now delegated to desc call
    }
}
