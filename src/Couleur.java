package inf2120.s243.g20;

public class Couleur {

    int rouge;
    int bleu;
    int vert;

    public Couleur(int rouge, int bleu, int vert) {
        this.rouge = rouge;
        this.bleu = bleu;
        this.vert = vert;
    }

    public void setRouge(int rouge) {
        if (rouge > 0 && rouge < 256) {
            this.rouge = rouge;
        }
    }
    public void setBleu(int bleu) {
        if(bleu > 0 && bleu < 256) {
            this.bleu = bleu;
        }
    }

    public void setVert(int vert) {
        if (vert > 0 && vert < 256){
            this.vert = vert;
        }
    }

    public int getRouge() {
        return rouge;
    }

    public int getBleu() {
        return bleu;
    }

    public int getVert() {
        return vert;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Couleur{" +
                "rouge=" + rouge +
                ", bleu=" + bleu +
                ", vert=" + vert +
                '}';
    }
}
