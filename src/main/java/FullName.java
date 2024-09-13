public class FullName {
    private String firstName;
    private String lastName;
    private String builerSystem;

    public FullName(String firstName, String lastName, String builerSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.builerSystem = builerSystem;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBuilerSystem() {
        return builerSystem;
    }
}
