package inf2120.s243.g20;
public class TaxeSimple {

    java.lang.String nomProduit ="";
    double prixProduit = 0.0;


    public TaxeSimple(java.lang.String nomProduit, double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public double prix() {
        return prixProduit+0.5*prixProduit;
    }
}
