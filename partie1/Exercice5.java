package partie1;
import java.util.Scanner;
public class Exercice5 {
	static class Calcul {
		public static int racineCarree(int x) {
			if (x<0) {
				throw new IllegalArgumentException("Impossible de calculer la racine d'un nombre negatif");	
			}
			return (int) Math.sqrt(x);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("entreu un nombre");
			int x= sc.nextInt();
			
			int resultat = Calcul.racineCarree(x);
			System.out.println("le resultat de la racine carree est:" +resultat);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
