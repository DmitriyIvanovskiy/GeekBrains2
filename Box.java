import java.util.List;

public class Box {
    private List<Fruit> boxFruit;

    public Box(List<Fruit> boxFruit) {
        this.boxFruit = boxFruit;
    }

    public List<Fruit> getBoxFruit() {
        return boxFruit;
    }

    public double getWeight() {
        int count = boxFruit.size();
        double weight = 0;

        if (count > 0) {
            weight = boxFruit.get(0).getWeight();
        }
        return count * weight;

    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }

    public String addAllFruits(Box box) {
        List<Fruit> fruits = box.getBoxFruit();
        if (boxFruit.size() != 0 && fruits.size() != 0) {
            if (boxFruit.get(0).getClass().equals(fruits.get(0).getClass())) {
                fruits.addAll(fruits.size(), getBoxFruit());
                boxFruit.clear();
            } else {
                return "Рвзные типы фруктов";
            }
        } else {
            return "Пустая коробка";
        }
        return "Фрукты переложили";
    }
}
