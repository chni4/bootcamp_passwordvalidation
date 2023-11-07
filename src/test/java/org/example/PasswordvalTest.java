package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordvalTest {

    @Test
    void If_Length_under_8_checkPasswordLength() {
        String pw = "Test123";
        boolean actual = Passwordval.checkPasswordLength(pw);
        assertFalse(actual);
    }

    @Test
    void If_Password_Ziffer_checkPasswordZiffern() {
        String pw = "Password";
        boolean actual = Passwordval.checkPasswordZiffern(pw);
        assertFalse(actual);
    }

    @Test
    void check_if_PasswordGrossKlein() {
        String pw = "password";
        boolean actual = Passwordval.checkPasswordZiffern(pw);
        assertFalse(actual);
    }




}
