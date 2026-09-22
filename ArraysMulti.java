import java.util.Scanner;
import java.util.Arrays;

public class ArraysMulti {
static Scanner scan = new Scanner(System.in);

    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        if ((rowIndex >= 0 && rowIndex < matrix.length) && (colIndex >= 0 && colIndex < matrix[0].length)) {
            int element = matrix[rowIndex][colIndex];
            return element;
        } else {
            return -1;
        }
        
       
    }

    public static void printSum(int[][] enteros) {

        for (int i = 0; i < enteros.length; i++) {
            int sum = 0;
            for (int j = 0; i < enteros[i].length; j++) {
                sum += enteros[i][j];
            }
            System.out.println("Row " + i + "sum: " + sum);
        }
    }

    public static int[] processMatrix(int[][] enteros) {
        int total = 0;
        int maximo = enteros[0][0];
        int pares = 0;

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j ++) {
                total += enteros[i][j];
                
                if (enteros[i][j] > maximo) {
                    maximo = enteros[i][j];
                }

                if (enteros[i][j] % 2 == 0) {
                    pares += 1;
                }
            }
        }

        return new int[] {total, maximo, pares};
    }

    public static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i ++) {
            for (int j = 0; j < matrix1.length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        int[][] newArr = new int[matrix1.length][matrix1[0].length];

        if (operator.equals("add")) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    newArr[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    newArr[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }

        return newArr;
    }

    public static int[][] createJaggedArray(int n) {
        int[][] irregular = new int[n][];

        for (int i = 0; i < irregular.length; i++) {
            irregular[i] = new int[i + 1];
            for (int j = 0; j < irregular[i].length; j++) {
                irregular[i][j] = (i + 1) * (j + 1);
            }
        }

        return irregular;
    }

    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        if (numStudents == 0 || subjectsPerStudent.length == 0) {
            return new int[0][];
        }

        int[][] juajua = new int[numStudents][];

        for (int i = 0; i < juajua.length; i++) {
            juajua[i] = new int[subjectsPerStudent[i]];
            for (int j = 0; j < subjectsPerStudent[i]; j++) {
                juajua[i][j] = (i + 1) * 10 + (j + i);
            }
        }

        return juajua;
    }

    public static void arr3D(int depth, int rows, int cols) {
        int[][][] array3D = new int[depth][rows][cols];

        for (int d = 0; d < depth; d++) {
            System.out.println("Depth " + d + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    array3D[d][r][c] = (d + 1) * (r + 1) * (c + 1);
                    System.out.print(array3D[d][r][c] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void create3DGameBoard(int levels, int rows, int cols) {
        int[][][] tri = new int[levels][rows][cols];

        for (int l = 0; l < levels; l++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    tri[l][r][c] = (l + 1) + (r + 1) + (c + 1);

                    if ((l == 0 || l == levels - 1) || (r == 0 || l == rows - 1) || (c == 0 || c == cols - 1)) {
                        tri[l][r][c] *= 10;
                    }
                }
            }
        }
    }

    public static void printPatterns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Main Diagonal: " + arr[i][i]);
            System.out.println("Anti-Diagonal: " + arr[i][arr.length -1 - i]);
            System.out.println("Border: " + arr[i][arr.length - 1]);
        }
    }

    public static void arrayOperations(int[][] arr) {
        int[] arr1D = new int[arr.length];
        int sum = 0;
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
                rowSum += arr[i][j];

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            arr1D[i] = rowSum;
        }

        System.out.println("Sum: " + sum + "\nMaximun: " + 12 + "\nRow Sums: " + Arrays.toString(arr1D));
    }

    public static void main(String[] args) {
        // Un array 2D es un arreglo de arreglos, que forma una cuadricula o una estructura similar a una matriz
        // Es como una tabla con filas y columnas, donde cada celda puede contener un valor.
        // Son utiles para representar datos que tienen relacion bidimensional, como un tablero de ajedrex, plano de asientos
        // O un juego basado en cuadriculas

        // La sintaxis es:
        // data_type[][] arrayName = new dataType[numberOfRows][numberOfColumns];
        // Por ejemplo:

        // int[][] matrix = new int[3][4];

        // Tambien con valores directamente
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // int rows = matrix2.length;
        // int cols = matrix2[0].length;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(matrix2[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // int element = matrix2[1][2];

        // System.out.println(element);

        // Antes de acceder a un elemento es buena practica comprobar si los indices son validos

        // if ((rowIndex >= 0 && rowIndex < matrix2.length) && (colIndex >= 0 && colIndex < matrix2[0].length)) {
        //     int ele = matrix2[rowIndex][colIndex];
        //     System.out.println(ele);
        // }

        // System.out.println(getElement(matrix2, 2, 2));

        // printSum(matrix2);

        processMatrix(matrix2);

        // Para sumar o restar dos matrices, deben tener las mismas dimensiones
        // La operacion se realiza elemento a elemento, sumas o restas los elementos correspondientes de cada matriz

        // Un arreglo 3D puede visualizarse como una coleccion de arreglos 2D apilados uno sobre otro
        // Se accede a cada elemento de un array 3D mediante 3 indices: uno para la profundidad, uno para la fila y otro para columnas

        // int[][][] cubo = new int[2][3][4];

        arr3D(2, 3, 4);

        // Recorrido diagonal: matrix[i][i]
        // Recorrido antidiagonal: matrix[i][size - 1 - i]
        // Recorrido del borde: matrix[i][size - 1]
    }
}
