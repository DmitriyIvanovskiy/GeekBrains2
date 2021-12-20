import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public List<Integer> get(String searchLastName) {
        List<Integer> phones = new ArrayList<>();
        for (Person person: personList) {
            if (person.getLastName().equals(searchLastName)) {
                phones.add(person.getNumber());
            }
        }
        return phones;
    }

}
