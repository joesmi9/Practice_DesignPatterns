package src.behavioral.strategy;

public class HighContrastFilter implements Filter {
    @Override
    public void filter(String fileName) {
        System.out.println("Filtering high contrast");
    }
}
