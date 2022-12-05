package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuItemTest {

    @DisplayName("메뉴 아이템을 생성한다.")
    @Test
    void create() throws Exception {
        assertDoesNotThrow(() -> {
            new MenuItem("돈까스", 5000);
        });
    }
}