package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @DisplayName("메뉴판을 보고 요리를 주문한다.")
    @Test
    void order() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));

        Customer customer = new Customer();
        Cook cook = customer.order("돈까스", menu, new Cooking());

        assertEquals(new Cook("돈까스", 5000), cook);
    }
}