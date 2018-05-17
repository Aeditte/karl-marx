import java.util.UUID;
import exception.InvalidCodeException;
package domain;

public abstract class Compte {

    private long code;
    private static int nbComptes;
    protected double solde;

    public void Compte() {

    }

    public long getCode() {
        return code;
    }

    public void setCode(int code) {
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
        if (montant > this.solde) {
            throw new InvalidCodeException();
        }

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
