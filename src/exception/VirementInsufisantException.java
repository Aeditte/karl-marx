package exception;

import domain.Compte;

public class VirementInsufisantException extends Exception {
    private Compte compte;

    public VirementInsufisantException(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String getMessage() {
        String sb =
                new String("Le virement doit-être positif.");

        return sb;
    }
}
