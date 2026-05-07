package partie1;
import java.util.Scanner;

public class Exercice4 {
	static class Conversion{
		public static int convertir(String s) {
			try {
				return Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Erreur: conversion impossible");
                return 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrer une chaîne: ");
        String input = sc.nextLine();
        
        int resultat= Conversion.convertir(input);
        System.out.println("Résultat: " + resultat);
	}
}
