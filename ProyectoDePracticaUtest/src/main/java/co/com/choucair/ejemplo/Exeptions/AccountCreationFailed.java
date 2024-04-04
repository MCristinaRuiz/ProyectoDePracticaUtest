package co.com.choucair.ejemplo.Exeptions;

public class AccountCreationFailed extends AssertionError {

    public AccountCreationFailed() {

        super("The account creation process failed");
    }
}
