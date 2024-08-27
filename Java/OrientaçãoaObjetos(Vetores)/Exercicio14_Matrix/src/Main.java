import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas da matrix: ");
        int l = sc.nextInt();
        System.out.print("Agora, digite o numero de colunas: ");
        int c = sc.nextInt();

        int[][] matrix = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Digite o %dº numero da %d linha: ", j+1, i+1);
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("\nDigite o numero que deseja encontrar na matrix: ");
        int n = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == n){
                    System.out.printf("\nPOSIÇÃO %d, %d:", i, j);
                    if(j != 0){
                        System.out.printf("\nNUMERO A ESQUERDA: %d", matrix[i][j-1]);
                    }
                    if(j != c-1){
                        System.out.printf("\nNUMERO A DIREITA: %d", matrix[i][j+1]);
                    }
                    if (i != 0){
                        System.out.printf("\nNUMERO ACIMA: %d", matrix[i-1][j]);
                    }
                    if(i != l-1){
                        System.out.printf("\nNUMERO ABAIXO: %d\n", matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}