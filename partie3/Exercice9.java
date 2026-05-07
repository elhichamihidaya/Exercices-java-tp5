package partie3;

class Vehicule<T> {
    T vitesse;
    public Vehicule(T vitesse) {
        this.vitesse = vitesse;
    }

    public void afficher() {
        System.out.println("Vitesse : " + vitesse);
    }
}
class Voiture<T> extends Vehicule<T> {
    public Voiture(T vitesse) {
        super(vitesse);
    }
}
public class Exercice9 {
    public static void main(String[] args) {
        Voiture<Integer> v =new Voiture<>(180);
        v.afficher();
    }
}