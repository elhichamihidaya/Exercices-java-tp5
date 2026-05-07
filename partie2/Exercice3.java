package partie2;

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
class MontantInvalideException extends Exception {
    public MontantInvalideException(String message) {
        super(message);
    }
}
public class Exercice3 {
    static class Compte {
        double solde;
        public Compte(double solde) {
        	this.solde=solde;
        }
        public void retirer(double montant) throws SoldeInsuffisantException,MontantInvalideException {
            if (montant <= 0) {
                throw new MontantInvalideException(
                        "Montant invalide");
            }
            if (montant > solde) {
                throw new SoldeInsuffisantException(
                        "Solde insuffisant");
            }
            solde -= montant;
            System.out.println("le solde apres retrait:"+solde);
        }
    }
    public static void main(String[] args) {
        Compte c = new Compte(5000);
        try {
            c.retirer(-700);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}