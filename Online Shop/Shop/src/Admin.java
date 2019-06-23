public class Admin extends User {

    private String adminName;

    public Admin(int userID, String loginStatus, String email, String password, String regDate, String adminName) {
                super(userID, loginStatus, email, password, regDate);
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                '}';
    }
    /*
    public boolean updateCatalog(){
        ...some code...
    }
     */
}
