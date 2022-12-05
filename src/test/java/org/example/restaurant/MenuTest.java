package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @DisplayName("메뉴판을 생성한다.")
    @Test
    void create() throws Exception {
        assertDoesNotThrow(() -> {
            new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        });
    }

    @DisplayName("메뉴를 고른다.")
    @Test
    void choose() throws Exception {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        MenuItem chooseMenuItem = menu.choose("돈까스");

        assertEquals(new MenuItem("돈까스", 5000), chooseMenuItem);
    }

    @DisplayName("메뉴판에 없는 메뉴를 고르면 IllegalArgumentException 예외가 발생한다.")
    @Test
    void unknown_menu() throws Exception {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            menu.choose("돈까스123");
        });

        assertEquals("잘못된 음식이름입니다.", ex.getMessage());

    }
}