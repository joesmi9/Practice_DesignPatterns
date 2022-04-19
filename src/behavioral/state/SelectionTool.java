package src.behavioral.state;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection tool: Mouse Down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Selection tool: Mouse Up");
    }
}
