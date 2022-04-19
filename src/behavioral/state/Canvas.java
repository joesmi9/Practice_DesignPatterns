package src.behavioral.state;

public class Canvas {
    /**
     * This class mimics the functionality of a canvas where selecting which tool
     * you're using changes what gets put on the canvas (for example Microsoft Paint)
     */

    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
