package composepc;

public class Dimension {
    private int width;
    private int height;
    private int depth;

    public Dimension(int width, int height, int depth){
        setWidth(width);
        setHeight(height);
        setDepth(depth);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return " width: " + width +
                "in, height: " + height +
                "in, depth: " + depth +"in";
    }
}
