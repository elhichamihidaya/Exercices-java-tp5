package partie2;

class QuotaDepasseException extends Exception {
    public QuotaDepasseException(String message) {
        super(message);
    }
}
public class Exercice7 {
    static class Telechargement {
        public void telechargerFichier(double taille) throws QuotaDepasseException {
            double limite = 100;
            if (taille > limite) {
                throw new QuotaDepasseException("Quota depasse");
            }
            System.out.println("Téléchargement autorisé");
        }
    }
    public static void main(String[] args) {
        Telechargement t = new Telechargement();
        try {
            t.telechargerFichier(200);
        } catch (QuotaDepasseException e) {
            System.out.println(e.getMessage());
        }
    }
}
