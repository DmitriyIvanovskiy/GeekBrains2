import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Данные для задачи 2:


        List<Fruit> applesOne = new ArrayList<>();
        applesOne.add(new Apple());
        applesOne.add(new Apple());
        applesOne.add(new Apple());
        Box boxOne = new Box(applesOne);

        List<Fruit> applesTwo = new ArrayList<>();
        applesTwo.add(new Apple());
        applesTwo.add(new Apple());
        applesTwo.add(new Apple());
        Box boxTwo = new Box(applesTwo);

        List<Fruit> orangeOne = new ArrayList<>();
        orangeOne.add(new Orange());
        orangeOne.add(new Orange());
        orangeOne.add(new Orange());
        orangeOne.add(new Orange());
        Box boxThree = new Box(orangeOne);

        System.out.println(boxOne.getWeight());
        System.out.println(boxTwo.getWeight());
        System.out.println(boxThree.getWeight());

        System.out.println(boxOne.compare(boxTwo));
        System.out.println(boxTwo.compare(boxThree));
        System.out.println(boxOne.compare(boxThree));

        System.out.println(boxOne.addAllFruits(boxTwo));
        System.out.println(boxTwo.addAllFruits(boxThree));
        System.out.println(boxOne.addAllFruits(boxTwo));

        System.out.println(boxOne.getWeight());
        System.out.println(boxTwo.getWeight());
        System.out.println(boxThree.getWeight());

        System.out.println(boxOne.compare(boxTwo));
        System.out.println(boxTwo.compare(boxThree));
        System.out.println(boxOne.compare(boxThree));


        //Данные для задачи 1:
        String [] array = {"1", "2", "3", "4"};
        revers(array, 0, 3);
        System.out.println(Arrays.toString (array) );
    }

    public static <T> void revers (T[] array, int a, int b) {
        T o = array [a];
        array[a] = array [b];
        array[b] = o;
    }
}
