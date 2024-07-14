package online.shop.gorychev.homeworkspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public void addSomething(@RequestParam("something") Integer[] something) {
        cartService.addSomething(Arrays.asList(something));
    }

    @GetMapping("/get")
    public List<Integer> getSomething() {
        return cartService.getSomething();
    }
}
