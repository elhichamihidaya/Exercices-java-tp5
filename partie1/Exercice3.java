package partie1;
import java.util.Scanner;

public class Exercice3 {
	static class Tableau{
		public static void accesAvecIf(int[] tab, int i) {
            if (i >= 0 && i < tab.length) {
                System.out.println("Valeur: " + tab[i]);
            } else {
                System.out.println("Index invalide");
            }
        }
		public static void accesAvecTry(int[] tab, int i) {
			try {
				System.out.println("Valeur: " + tab[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur: index hors limites");
			}
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] tab= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.print("Entrer le i: ");
        int i = sc.nextInt();
        
        System.out.println("Avec If:");
        Tableau.accesAvecIf(tab, i);
        
        System.out.println("Avec Try/Catch:");
        Tableau.accesAvecTry(tab, i);
	}
}
