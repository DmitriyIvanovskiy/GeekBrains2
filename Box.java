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
        return boxFruit.get(0).getWeight() * boxFruit.size();
    }

    public boolean compare (Box box) {
        return getWeight() == box.getWeight();
    }

    public void addAllFruits (Box box){
        List<Fruit> fruits = box.getBoxFruit();
        if (boxFruit.getClass().equals(fruits.getClass())){
            fruits.addAll(fruits.size(), getBoxFruit());
        }
    }
}
