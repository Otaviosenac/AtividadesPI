package Desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float caverna,lago,ruinas,montanhas;
		char caminho;
		System.out.println("\nEscolha o qual caminho seguir: ");
		
		System.out.println("\nCaminhos");
		System.out.println("1 -- Caverna");
		System.out.println("2 -- Lago");
		System.out.println("3 -- Ruínas");
		System.out.println("4 -- montanhas");
		System.out.println("\nEntre com a sua opção: ");
		caminho =  leia.next().charAt(0);
		
		switch(caminho) {
		case '1':
			System.out.println("\nVocê entrou na caverna e encontrou um dragão adormecido!");
			break;
			
		case '2':
			System.out.println("\nVocê ")
			
		}
	}

}
