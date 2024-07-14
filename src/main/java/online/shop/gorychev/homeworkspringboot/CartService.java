package online.shop.gorychev.homeworkspringboot;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class CartService {
    private final Cart cart = new Cart();
    public void addSomething(List<Integer> something) {
        cart.addSomething(something);
    }

    public List<Integer> getSomething() {
        return cart.getSomething();
    }
}
