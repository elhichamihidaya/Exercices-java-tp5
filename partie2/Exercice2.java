package partie2;

class MontantInvalideException extends Exception {
    public MontantInvalideException(String message) {
        super(message);
    }
}
public class Exercice2 {
    static class Compte {
        public void retirer(double montant) throws MontantInvalideException {
            if (montant <= 0) {
                throw new MontantInvalideException("Montant invalide");
            }
            System.out.println("Retrait acceptee");
        }
    }
    public static void main(String[] args) {
        Compte c = new Compte();
        try {
            c.retirer(-10);
        } catch (MontantInvalideException e) {

            System.out.println(e.getMessage());
        }
    }
}