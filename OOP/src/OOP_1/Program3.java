package OOP_1;

public class Program3 {
    public static void main(String[] args){
        double [][]mArr = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        Matrix m = new Matrix(mArr, 2, 3);
        m.print();

        double [][]m2Arr = {{1.2, 1.6, 8.8}, {10.1, 11.2, -1.1}};
        Matrix m2 = new Matrix(m2Arr, 2, 3);
        m2.print();
        System.out.println("Сложим наши матрицы");
        m.plusMatrix(m2);
        m.print();

        System.out.println("Изменим элементы в матрицах");
        m.setValue(1, 2, 7.9);
        m2.setValue(1, 2, -0.9);
        m.print();
        m2.print();

        System.out.println("Перемножим изменённые матрицы");
        m.multipleMatrix(m2);
        m.print();

        System.out.println("Умножим нашу матрицу на 2");
        m.multipleNumber(2.0);
        m.print();
    }
}

 class Matrix {
    public int rows, columns;
    public double [][]arr;

    Matrix(double[][]arr, int rows, int columns){
        this.arr = arr;
        this.rows = rows;
        this.columns = columns;
    }

     public void setValue(int i, int j, double value) {
         arr[i][j] = value;
     }

    public void plusMatrix(Matrix b) {
        for (int i = 0; i < rows; i++) {
            double s;
            for (int j = 0; j < columns; j++) {
                s = b.arr[i][j] + arr[i][j];
                arr[i][j] = s;
            }

        }
    }

    public void multipleNumber(double k) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = k * arr[i][j];
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void multipleMatrix(Matrix b) {
        double s;
        double[][] f = new double[b.rows][b.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < b.columns; j++) {
                s = 0;
                for (int k = 0; k < b.rows; k++) {
                    s = s + arr[i][k] * b.arr[k][j];
                }
                f[i][j] = s;
            }
        }
        arr = f;
    }
}















