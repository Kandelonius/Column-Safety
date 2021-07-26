package sollersjava.oops;

public class LoginUser {
    public static void main(String[] args) {
        User user = new User();
        String username = user.getUserName();
        String password = user.getPassword();

    }
    public boolean validateUser() {
        if(true) {
            String username = null;
            String password = null;
            return true;
        }
        return false;
    }
    public boolean checkValidUserOrNot() {
        boolean authenitcated = false;
        boolean validated = validateUser();
        if(validated) {
            // database call to check if details are correct or not
            if(authenitcated) {
                redirect();
                return true;
            } else {
                System.out.println("Not authenticated");
            }
        } else {
            System.out.println("Invalid User details");
        }
        return false;
    }
    public void redirect() {
        // redirect to a location
    }
}
