package GrayImage;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayImage(int[][] pixelValues) {
        this.pixelValues = pixelValues;
    }

    public int countWhitePixels() {
        int c = 0;

        for (int row = 0; row < this.pixelValues.length; row++) {
            for (int col = 0; col < this.pixelValues[0].length; col++) {
                if (pixelValues[row][col] == WHITE) {
                    c++;
                }
            }
        }

        return c;
    }

    public void processImage() {
        for (int row = 0; row < this.pixelValues.length; row++) {
            for (int col = 0; col < this.pixelValues[0].length; col++) {
                if (row + 2 < this.pixelValues.length && col + 2 < this.pixelValues[0].length) {
                    int val = this.pixelValues[row][col] - this.pixelValues[row + 2][col + 2];
                    if (val < BLACK) {
                        this.pixelValues[row][col] = BLACK;
                    } else {
                        this.pixelValues[row][col] = val;
                    }
                }
            }
        }
    }

    public String toString() {
        String o = "";

        for (int row = 0; row < this.pixelValues.length; row++) {
            for (int col = 0; col < this.pixelValues[0].length; col++) {
                o += this.pixelValues[row][col] + "\t";
            }
            o += "\n";
        }

        return o;
    }
}
