public class Person {

    private String firstname;
    private String lastname;
    private String gender;
    private String hint;



    public Person(String firstname, String lastname, String gender, String hint) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.hint = hint;

    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHint() {
        return hint;
    }

    public String getGender() {
        return gender;
    }
}
