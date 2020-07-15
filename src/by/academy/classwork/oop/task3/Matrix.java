package by.academy.classwork.oop.task3;

public class Matrix {
    private int lines;
    private int columns;
    private float mtrx[][];

    public Matrix() {
        super();
    }

    public Matrix(int lines, int columns) {
        super();
        this.lines = lines;
        this.columns = columns;
        this.mtrx = new float[lines][columns];
    }

    public void setMtrx(float[][] mtrx) {
        this.mtrx = mtrx;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public float[][] getMtrx() {
        return mtrx;
    }

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }

    public float[][] add(float mtrx[][]) {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                mtrx[i][j] = (float) (-100 + Math.random() * 202);
            }
        }
        print(mtrx);
        return mtrx;
    }

    public void print(float mtrx[][]) {
        System.out.println("\nМатрица");
        int mLines=mtrx.length;
        int mColumns=mtrx[0].length;
        for (int i = 0; i < mLines; i++) {
            for (int j = 0; j < mColumns; j++) {
                System.out.printf("%.3f ", mtrx[i][j]);
            }
            System.out.println();
        }
    }

    public void sumMatrix(float mtrx1[][], float mtrx2[][]) {
        int m1Columns = mtrx1[0].length;
        int m2Columns = mtrx2[0].length;
        int m1Lines=mtrx1.length;
        int m2Lines=mtrx2.length;
        if((m1Columns==m2Columns)&&(m1Lines==m2Lines)){
            float mtrx[][] = new float[m1Lines][m1Columns];
            for (int i = 0; i < m1Lines; i++) {
                for (int j = 0; j < m1Columns; j++) {
                    mtrx[i][j] = mtrx1[i][j] + mtrx2[i][j];
                }
            }
            print(mtrx);
        }
        else {
            System.out.println("Невозможно сложить эти маттрицы!");
        }
    }

    public void increase(float mtrx[][], int num) {
        int mLines=mtrx.length;
        int mColumns=mtrx[0].length;
        for (int i = 0; i < mLines; i++) {
            for (int j = 0; j < mColumns; j++) {
                mtrx[i][j] *= num;
            }
        }
        print(mtrx);
    }

    public void increase(float mtrx1[][], float mtrx2[][]) {
        int m1columns = mtrx1[0].length;
        int m2lines = mtrx2.length;
        if (m1columns != m2lines) {
            System.out.println("Невозможно перемножить матрицы!");
        } else {
            int m11lines = mtrx1.length;
            int m22columns = mtrx2[0].length;
            float mtrx[][] = new float[m11lines][m22columns];
            for (int i = 0; i < m11lines; i++) {
                for (int j = 0; j < m22columns; j++) {
                    for (int n = 0; n < m1columns; n++) {
                        mtrx[i][j] += mtrx1[i][n] * mtrx2[n][j];
                    }
                }
            }
            print(mtrx);
        }
    }
}