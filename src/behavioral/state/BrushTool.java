package src.behavioral.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("BrushTool: Mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("BrushTool: Mouse up");
    }
}
