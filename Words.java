import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
    // Задача №1
        String[] arrWords = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEE", "FFFF", "GGGG", "HHHH", "AAAA", "BBBB", "CCCC", "DDDD", "EEEE"};

        List<String> newList = new ArrayList<>();

        for (String s : arrWords) {
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }

        System.out.println(newList);

    //Задача №2

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add (new Person("Ivanov", 12345));
        phoneDirectory.add (new Person("Ivanov", 2345687));
        phoneDirectory.add (new Person("Petrov", 5243562));
        phoneDirectory.add (new Person("Sidorov", 32763576));

        List<Integer> list = phoneDirectory.get("Ivanov");
        System.out.println(list);




    }




}
