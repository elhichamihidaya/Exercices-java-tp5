package partie2;
class PaiementRefuseException extends Exception {
    public PaiementRefuseException(String message) {
        super(message);
    }
}

class CarteExpireeException extends Exception {
    public CarteExpireeException(String message) {
        super(message);
    }
}
public class Exercice9 {
    static class Paiement {
        boolean carteExpiree = true;
        public void payer(double montant)throws PaiementRefuseException,CarteExpireeException {
            if (montant > 5000) {
                throw new PaiementRefuseException("Paiement refuse");
            }
            if (carteExpiree) {
                throw new CarteExpireeException("Carte expirée");
            }
            System.out.println("Paiement accepte");
        }
    }
    public static void main(String[] args) {
        Paiement p = new Paiement();
        try {
            p.payer(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}