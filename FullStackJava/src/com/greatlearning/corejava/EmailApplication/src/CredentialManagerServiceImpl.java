import java.util.InputMismatchException;

public class CredentialManagerServiceImpl implements ICredentialsManagerService{

    /**
     * @return
     */
    final String emailSuffix = ".greatlearning.com";

    String findDeptName(int deptCode) {
        String deptName;
        switch (deptCode) {
            case 1: deptName = "cs";
            break;
            case 2: deptName = "ec";
            break;
            case 3: deptName = "bt";
            break;
            case 4: deptName = "mech";
            break;
            default:
                throw new InputMismatchException("Unknown department provided");
        }
        return deptName;
    }
    @Override
    public String generatePassword() {
        return null;
    }

    /**
     * @param fname
     * @param lname
     * @param deptCode
     * @return
     */
    @Override
    public String generateEmailAddress(String fname, String lname, int deptCode) {
        fname = fname.replaceAll("\\s", "");
        lname = lname.replaceAll("\\s", "");
        return fname.toLowerCase() + "." + lname.toLowerCase() + "@" + findDeptName(deptCode) + emailSuffix;
    }

    /**
     *
     */
    @Override
    public void showCredentials() {

    }
}
