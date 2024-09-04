public class DecoratorDriver {
    public static void main(String[] args) {
        Window simpleWindow = new SimpleWindow();
        Window horizontalScrollBar = new HorizontalScrollBarDecorator(simpleWindow);
        Window newDecoratedWindow = new VerticalScrollBarDecorator(horizontalScrollBar);

        newDecoratedWindow.draw();
        System.out.println("Window Desc: " + newDecoratedWindow.getDescription());
    }
}
