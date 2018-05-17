package domain;

import exception.SoldeInsuffisantException;

public class CompteSImple extends Compte {
    private Integer decouvert;

    public CompteSImple(Integer decouvert) {
        this.decouvert = decouvert;
    }

    public void setDecouvert(Integer decouvert) {
        this.decouvert = decouvert;
    }

    public Integer getDecouvert() {
        return decouvert;
    }

    @Override
    public void retirer(double montant) throws SoldeInsuffisantException {
        super.retirer(montant);
    }
}
