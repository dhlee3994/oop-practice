package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 비밀번호 검증기
 * 비밀번호는 8~12자
 * 그 외에는 IllegalArgumentException 예외 발생
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호 길이는 최소 8자이상 최대 12자이하")
    @Test
    void valid_length_password() throws Exception {
        assertDoesNotThrow(() -> PasswordValidator.validate("12345678"));

    }

    @DisplayName("비밀번호 길이가 8자미만 혹은 12자 초과인 경우 IllegalArgumentException 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"0123456", "0123456789abc"})
    void invalid_length_password(String password) throws Exception {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate(password);
        });

        assertEquals("비밀번호는 최소 8자 이상 12자 이하여야 합니다.", ex.getMessage());
    }
}
