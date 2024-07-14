package online.shop.gorychev.homeworkspringboot;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> somethingNew = new ArrayList<>();
    public void addSomething(List<Integer> something) {
        somethingNew.addAll(something);
    }

    public List<Integer> getSomething() {
        return somethingNew;
    }
}
