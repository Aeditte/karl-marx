package exception;

import domain.Compte;

public class SoldeInsuffisantException extends Exception {

    private Compte compte;

    public SoldeInsuffisantException(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String getMessage() {
        String sb =
                new String("Le solde de votre compte ne vous permet pas de retirer le montant demandé");

        return sb;
    }
}
