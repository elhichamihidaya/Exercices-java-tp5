package partie3;

public class Exercice1 {
    static class Boite<T> {
        T contenu;
        public void setContenu(T contenu) {
            this.contenu = contenu;
        }

        public T getContenu() {
            return contenu;
        }
    }

    public static void main(String[] args) {

        Boite<String> b1 = new Boite<>();
        b1.setContenu("Hello");

        System.out.println(b1.getContenu());

        Boite<Integer> b2 = new Boite<>();
        b2.setContenu(15);

        System.out.println(b2.getContenu());
    }
}