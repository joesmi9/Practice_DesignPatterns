package src.behavioral.strategy;

public class ImageStorage {
    /**
     * Imagine we're building out a file storage app
     * where images can be compressed in a certain format,
     * and a filter can be applied.
     */

    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter){
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        compressor.compress(fileName);
        filter.filter(fileName);

        // Compression Algorithm: JPEG, PNG, ...
        // Image filter: B&W, High Contrast, ...
    }
}
