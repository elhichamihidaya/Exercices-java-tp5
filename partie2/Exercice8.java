package partie2;

class ChampObligatoireException extends Exception {
    public ChampObligatoireException(String message) {
        super(message);
    }
}
public class Exercice8 {
    static class Formulaire {
        public void validerFormulaire(String nom, String email)throws ChampObligatoireException {
            if (nom.isEmpty()|| email.isEmpty()) {
                throw new ChampObligatoireException("Champ obligatoire vide");
            }
            System.out.println("Formulaire valide");
        }
    }
    public static void main(String[] args) {
        Formulaire f = new Formulaire();
        try {
            f.validerFormulaire("" , "");
        } catch (ChampObligatoireException e) {
            System.out.println(e.getMessage());
        }
    }
}
