// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        CredentialManagerServiceImpl c = new CredentialManagerServiceImpl();
        String s = c.generateEmailAddress("Pranav Kumar", "Ojha", 4);
        System.out.println("Email: " + s);
        s = c.generatePassword();
        System.out.println("Password: " + s);
    }
}