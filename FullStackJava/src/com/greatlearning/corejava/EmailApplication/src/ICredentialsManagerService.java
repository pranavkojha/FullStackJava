public interface ICredentialsManagerService {
    String generatePassword();
    String generateEmailAddress(String fname, String lname, int deptCode);
    void showCredentials();
}
