public class Person {

    private String LastName;
    private int number;

    public Person(String lastName, int number) {
        LastName = lastName;
        this.number = number;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
