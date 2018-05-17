package domain;

public class CompteEpargne extends Compte {

    private Double taux;

    public CompteEpargne(Double taux) {
        this.taux = taux;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

}


