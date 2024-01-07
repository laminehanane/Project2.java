package Project2;

public class RegistringClass {
    /*Create Registration Class in which you would have variables such as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class, the user should be able to call methods
    and in each method separately pass values to set users email, username and
    password.
            Requirements:
            ● Valid email consider to be only yahoo
            ● Valid userName and password cannot be empty and should be of
    length larger than 6 characters. Also valid passwords cannot contain userName.*/
    private String email;
    private String userName;
    private String password;

    public RegistringClass(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    void printInfo(){
        System.out.println("Enter your email:"+email+" enter your username: "+userName+" enter your password: "+password);
    }
    void email(){
        if (email.isEmpty()){
            System.out.println("error");
        }
    }
    void password(){
        if (password.length()<6){
            System.out.println("you need more then 6 characters in ur password");
        }
    }
    void username(){
        if (userName.isEmpty()){
            System.out.println("ERROR");
        }
    }

    public String getEmail() {
        System.out.println(email+"@yahoo.com");

        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
class RegistringClassTester{
    public static void main(String[] args) {
        RegistringClass r=new RegistringClass("","","");
        r.email();
        r.password();
        r.printInfo();
        r.getEmail();
        r.setEmail("yannis2023");
        r.printInfo();
        r.getEmail();
        r.getUserName();
        System.out.println(r.getUserName());
        r.getPassword();
        System.out.println(r.getPassword());
        r.setPassword("0000000000");
        r.setUserName("lamine");
        r.printInfo();

    }
}