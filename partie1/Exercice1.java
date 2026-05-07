package partie1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercice1 {
	static class Calcul{
		public static int division(int a, int b) {
			if(b==0) {
				throw new ArithmeticException("Division par zéro interdite");
			}
			return a/b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entrer a:");
			int a = sc.nextInt();
			
			System.out.println("Entrer b:");
			int b = sc.nextInt();
			
			int resultat= Calcul.division(a, b);
			System.out.println("Résultat: " + resultat);
			
		} catch (InputMismatchException e) {
			System.out.println("Erreur: faut entrer des entiers correctes");
		} catch (Exception e) {
        System.out.println("Erreur de saisie !");
        }
	}
}
