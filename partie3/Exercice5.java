package partie3;

public class Exercice5 {
    static class Boite<T> {
        T valeur;
        public Boite(T valeur) {
            this.valeur = valeur;
        }
        public void afficher() {
            System.out.println("Valeur : " + valeur);
        }
    }
    public static void main(String[] args) {
        Boite<String> b1 =new Boite<>("Hello");
        b1.afficher();
        Boite<Integer> b2 =new Boite<>(90);
        b2.afficher();
    }
}
