package domain;

import java.util.UUID;

public abstract class Compte {

    private String code;
    private static int nbComptes;
    protected double solde;

    public void Compte() {
        nbComptes++;
        String code = UUID.randomUUID().toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    private void geneId() {

    }

    private void verser(double montant) {
        this.solde += montant;
    }

    private void retirer(double montant) {
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
