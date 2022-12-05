package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookingTest {

    @DisplayName("메뉴아이템을 받아서 요리를 생성한다.")
    @Test
    void cook() throws Exception {
        Cooking cooking = new Cooking();
        Cook result = cooking.cook(new MenuItem("돈까스", 5000));

        assertEquals(new Cook("돈까스", 5000), result);
    }

}