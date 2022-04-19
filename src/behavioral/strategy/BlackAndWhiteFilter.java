package src.behavioral.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Filtering black and white");
    }
}
