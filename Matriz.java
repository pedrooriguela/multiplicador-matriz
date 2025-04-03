import java.util.Scanner;

class Matriz {

    public static Scanner sc = new Scanner(System.in);

    public static double[][] lematriz(int numLinhas, int numColunas) {
        double[][] m = new double[numLinhas][numColunas];
        for(int i=0; i<numLinhas;i++){
            for(int j=0; j<numColunas;j++){
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }

    public static void exibeMatriz(double[][] M) {
        int numlinhas = M.length;
        int numcolunas = M[0].length;

        for(int i = 0; i < numlinhas; i++){
            for(int j = 0; j<numcolunas; j++){
                System.out.println(M[i][j]);
            }
        }

    }

    public static double[][] matmult(double[][] A, double[][] B) {
        int numlinhas = A.length;
        int numcolunas = B[0].length;
        int n = A[0].length;
        double[][] C = new double[numlinhas][numcolunas];

        for(int i = 0; i< numlinhas; i++){
            for(int j = 0; j<numcolunas; j++){
                for (int k = 0; k<n; k++)
                C[i][j] += A[i][k]*B[k][j];
            }
        }
        return C;
    }


    public static void main(String[] args) {
        // le da linha de comando duas matrizes A e B

        if (args.length < 4) {
            System.out.println("use java matriz numlinhasA numcolunasA numlinhasB numcolunasB");
            return;
        }

        int numlinhasA = Integer.parseInt(args[0]);
        int numColunasA = Integer.parseInt(args[1]);
        int numlinhasB = Integer.parseInt(args[2]);
        int numColunasB = Integer.parseInt(args[3]);

        double[][] A = lematriz(numlinhasA, numColunasA);
        double[][] B = lematriz(numlinhasB, numColunasB);

        double[][] C = matmult(A, B);

        exibeMatriz(C);


    }
}