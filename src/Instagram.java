public class Instagram {
    private  String firstName;
    private  String lastName;
    private  int age;
    private  String emaill;
    private  int password;
    public Instagram(){

    }
    public Instagram(String firstName, String lastName, int age, String emaill, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emaill = emaill;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName +
                "  lastName: " + lastName +
                "  age: " + age +
                "  emaill: " + emaill +
                "  password: " + password;
    }
}
