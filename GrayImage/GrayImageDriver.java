package GrayImage;

public class GrayImageDriver {
    public static void main(String[] args) {
        int[][] image = new int[4][5];

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[0].length; col++) {
                image[row][col] = (int) (Math.random() * 256);
            }
        }

        GrayImage grayImage = new GrayImage(image);
        System.out.println(grayImage);
        System.out.println("Gray image has " + grayImage.countWhitePixels() + " white pixel(s).\n");

        grayImage.processImage();
        System.out.println(grayImage);
    }
}
