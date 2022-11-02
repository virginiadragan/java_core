package poo_basic.modifiers;

public class Matrix {
    private double[] oneArr;
    private double[][] twoArr;
    private String arrType;

    public Matrix (double arr[]) {
        oneArr = arr;
        arrType = "one";
    }

    public Matrix (double arr[][]) {
        twoArr = arr;
        arrType = "two";
    }

    public void printOneElm (int idx) {
        System.out.println(oneArr[idx]);
    }

    public void printOneElm (int x, int y) {
        System.out.println(twoArr[x][y]);
    }

    public void printOneRow (int row) {
        for (int i = 0; i < twoArr[0].length; i++) {
            System.out.print(twoArr[row][i] + " ");
        }
    }

    public void printOneColumn (int col) {
        for (int i = 0; i < twoArr.length; i++) {
            System.out.println(twoArr[i][col]);
        }
    }

    public static void sum (double[] arr1, double[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        double newArr[] = new double[Math.min(n1, n2)];
        for (int i = 0; i < Math.min(n1, n2); i++) {
            newArr[i] = arr1[i] + arr2[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void sum (double[][] arr1, double[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        double newArr[][] = new double[Math.min(r1, r2)][Math.min(c1, c2)];
        for (int i = 0; i < Math.min(r1, r2); i++) {
            for (int j = 0; j < Math.min(c1, c2); j++)
                newArr[i][j] = arr1[i][j] + arr2[i][j];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiply (double[] arr) {
        int n1 = arr.length;
        int n2 = oneArr.length;
        double newArr[] = new double[Math.min(n1, n2)];
        for (int i = 0; i < Math.min(n1, n2); i++) {
            newArr[i] = arr[i] * oneArr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public void multiply (double[][] arr) {
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = twoArr.length;
        int c2 = twoArr[0].length;
        double newArr[][] = new double[Math.min(r1, r2)][Math.min(c1, c2)];
        for (int i = 0; i < Math.min(r1, r2); i++) {
            for (int j = 0; j < Math.min(c1, c2); j++)
            newArr[i][j] = arr[i][j] * twoArr[i][j];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
