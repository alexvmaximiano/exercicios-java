package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o número de colunas: ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the number to search: ");
		int numberSearch = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numberSearch) {
					System.out.println("Position: " + i + " " + j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz.length-1) {
						System.out.println("Rigth: " + matriz[i][j + 1]);						
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i + 1][j]);						
					}
				}
			}
		}

		sc.close();

	}

}
