public interface ICredentialsManagerService {
    String generatePassword();
    String generateEmailAddress(String fname, String lname, String deptCode);
    void showCredentials();
}
