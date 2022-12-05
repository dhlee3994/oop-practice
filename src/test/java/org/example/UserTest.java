package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void init_password() throws Exception {
        User user = new User();
        user.initPassword(() -> "12345678");

        assertNotNull(user.getPassword());
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않음")
    @Test
    void fail_init_password() throws Exception {
        User user = new User();

        user.initPassword(() -> "1234567");

        assertNull(user.getPassword());
    }

}