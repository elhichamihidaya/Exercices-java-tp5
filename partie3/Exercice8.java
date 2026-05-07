package partie3;

class Animal<T> {
    T nom;
    public Animal(T nom) {
        this.nom = nom;
    }
    
    public void afficher() {
        System.out.println("Nom : " + nom);
    }
}
class Chien extends Animal<String> {
    public Chien(String nom) {
        super(nom);
    }
}
public class Exercice8 {
    public static void main(String[] args) {
        Chien c = new Chien("Bella");
        c.afficher();
    }
}