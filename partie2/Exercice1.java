package partie2;

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String msg) {
        super(msg);
    }
}
public class Exercice1 {
    static class CompteBancaire {
        int code;
        double solde;
        
        public CompteBancaire(int code, double solde) {
            this.code = code;
            this.solde = solde;
        }
        public void retirer(double montant) throws SoldeInsuffisantException {
            if (montant > solde) {
                throw new SoldeInsuffisantException("Solde insuffisant");
            }
            solde -= montant;
            System.out.println("le solde apres retrait:"+solde);
        }

        public void verser(double montant) {

            solde += montant;
            System.out.println("le solde apres versement:"+solde);
        }
    }
    public static void main(String[] args) {

        CompteBancaire c = new CompteBancaire(1, 90000);
        try {
            c.retirer(5600);
            c.verser(7000);

        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}
