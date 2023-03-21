package LightBoard;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                lights[r][c] = Math.random() > 0.4;
            }
        }
    }

    public int colLights(int col) {
        int c = 0;

        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                c++;
            }
        }

        return c;
    }

    public boolean evaluateLight(int row, int col) {
        if (lights[row][col] && colLights(col) % 2 == 0) {
            return false;
        } else if (!lights[row][col] && colLights(col) % 3 == 0) {
            return true;
        } else {
            return lights[row][col];
        }
    }

    public String toString() {
        String o = "";

        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                o += lights[r][c] + "\t";
            }
            o += "\n";
        }

        return o;
    }
}
