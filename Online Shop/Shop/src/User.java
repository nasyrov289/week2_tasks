public abstract class User {
    private int userID;
    private String loginStatus;
    private String email;
    private String password;

    public User(int userID, String loginStatus, String email, String password) {
        this.userID = userID;
        this.loginStatus = loginStatus;
        this.email = email;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", loginStatus='" + loginStatus + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password +
                '}';
    }
    /*
    public boolean verifyLogin(){
        ...some code...
    }
     */
}
