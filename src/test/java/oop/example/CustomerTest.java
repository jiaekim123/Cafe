package oop.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Barista barista;
    private Menu menu;
    private Customer customer;

    @BeforeEach
    public void init(){
        Map<String, Recipe> recipeMap = new HashMap<>();
        recipeMap.put("americano", new Recipe(Arrays.asList("물", "에스프레소")));
        this.barista = new Barista(recipeMap);
        this.menu = new Menu(Arrays.asList(new MenuItem("americano", 4500)));
        this.customer = new Customer();
    }

    @Test
    @DisplayName("고객이 아메리카노를 주문하는 경우 주문에 성공한다.")
    void orderAmericano(){
        Optional<Coffee> optionalCoffee = customer.order("americano", menu, barista);
        assertTrue(optionalCoffee.isPresent());
        if (optionalCoffee.isPresent()) {
            System.out.println("오 여기 커피 맛있는데?");
        } else {
            System.out.println("아니 아메리카노도 없어요? 이 카페는 대체 뭐야?");
        }
    }

    @Test
    @DisplayName("고객이 카페라떼를 주문하는 경우 주문이 실패한다.")
    void orderCafeLatte(){
        Optional<Coffee> optionalCoffee = customer.order("cafeLatte", menu, barista);
        assertFalse(optionalCoffee.isPresent());
        if (optionalCoffee.isPresent()) {
            System.out.println("오 여기 커피 맛있는데?");
        } else {
            System.out.println("아니 카페라떼도 없어요? 이 카페는 대체 뭐야?");
        }
    }
}