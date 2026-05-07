package partie1;
import java.util.Scanner;

public class Exercice8 {
	static class Calcul{
		public static void verifierAge(int age) throws Exception {
			if (age < 18) {
				throw new Exception("Age inferieur a 18");
			}
			System.out.println("Age valide");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("entrer votre age:");
			int age= sc.nextInt();
			
			Calcul.verifierAge(age);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
