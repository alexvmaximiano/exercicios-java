package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		int qtdAlunos = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<qtdAlunos; i++) {
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.println("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Digite o quarto: ");
			int room = sc.nextInt();			
			vect[room] = new Rooms(name, email, room);
			sc.nextLine();
		}
		
		for (int i =0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println("Room: " + vect[i].getRoom() + " Name: " + vect[i].getName() + " E-mail: " + vect[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
