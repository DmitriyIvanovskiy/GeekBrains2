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

        System.out.println(boxOne.getWeight());
        System.out.println(boxTwo.getWeight());


        boxOne.addAllFruits(boxTwo);

        System.out.println(boxOne.getWeight());
        System.out.println(boxTwo.getWeight());

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
