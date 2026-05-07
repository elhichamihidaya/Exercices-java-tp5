package partie1;

public class Exercice2 {
	static class Calcul {
		public static void afficherLongueur(String s) {
            if (s == null) {
                System.out.println("la chaine est nulle");
            } else {
                System.out.println("la longueur: " + s.length());
            }
        }
		public static void afficherLongueurAvecException(String s) {
            try {
                System.out.println("la longueur: " + s.length());
            } catch (NullPointerException e) {
                System.out.println("Erreur: la chaîne nulle");
            }
        }
	}
	public static void main(String[] args) {
		String texte1="bonne journee";
		String texte2=null;
		
		System.out.println("Sans exception on a:");
		Calcul.afficherLongueur(texte1);
        Calcul.afficherLongueur(texte2);

        System.out.println("Avec try/catch on a:");
        Calcul.afficherLongueurAvecException(texte1);
        Calcul.afficherLongueurAvecException(texte2);
	}
}
