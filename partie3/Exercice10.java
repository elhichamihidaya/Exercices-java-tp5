package partie3;

class Repository<T> {
    public void save(T obj) {
        System.out.println("Objet sauvegardé : "+ obj);
    }
}

class User {
    String nom;
    public User(String nom) {
        this.nom = nom;
    }
    public String toString() {
        return nom;
    }
}
class UserRepository extends Repository<User> {
}
public class Exercice10 {
    public static void main(String[] args) {
        User user = new User("Hidaya");
        UserRepository ur = new UserRepository();
        ur.save(user);
    }
}