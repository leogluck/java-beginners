package lesson6.constructor;

public class ConstructorExample {
    int length;
    int width;
    int height;

    public ConstructorExample() {
    }

    public ConstructorExample(int figureLength, int figureWidth, int figureHeight) {
        length = figureLength;
        width = figureWidth;
        height = figureHeight;
    }

    public int getVolume() {
        return length * width * height;
    }
}
