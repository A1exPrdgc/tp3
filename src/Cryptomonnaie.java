public class Cryptomonnaie{
    private String nom;
    private double valeurDeJeton; // Imaginons en euros

    public Cryptomonnaie(String nom, double valeurDeJeton){
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }

    public String getNom() {
        return nom;
    }

    public double getValeurDeJeton() {
        return valeurDeJeton;
    }

    @Override
    public String toString() {
        return String.format("%5s",nom) + ":" + String.format("%10.1f",valeurDeJeton);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> c6edda5aafaab3e76b46ae2ec30a26e6c9e06639
