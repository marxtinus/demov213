package inf2120.s243.g20;

public class NonTaxable {

    java.lang.String nomProduit ="";
    double prixProduit = 0.0;


    public NonTaxable(java.lang.String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public double prix() {
        return prixProduit;
    }
}
