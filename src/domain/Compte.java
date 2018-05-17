package domain;

import exception.SoldeInsuffisantException;
import exception.VirementInsufisantException;

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

    public void verser(double montant) throws VirementInsufisantException {
        if (montant <= 0 ) throw new VirementInsufisantException( this );
        solde += montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde ) throw new SoldeInsuffisantException( this );
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
