package partie2;

class StockInsuffisantException extends Exception {
    public StockInsuffisantException(String message) {
        super(message);
    }
}
public class Exercice6 {
    static class Produit {
        int stock = 19;
        public void retirerDuStock(int quantite)throws StockInsuffisantException {
            if (quantite > stock) {
                throw new StockInsuffisantException("Stock insuffisant");
            }
            stock -= quantite;
            System.out.println("Retrait effectue");
        }
    }
    public static void main(String[] args) {
        Produit p = new Produit();
        try {
            p.retirerDuStock(40);
        } catch (StockInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}
