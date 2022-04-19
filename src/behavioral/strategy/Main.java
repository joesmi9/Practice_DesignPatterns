package src.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        var imageStore = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter() );
        imageStore.store("a");

        var imageStore1 = new ImageStorage(new PNGCompressor(), new HighContrastFilter() );
        imageStore1.store("b");
    }
}
