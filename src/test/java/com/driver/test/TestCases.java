package com.driver.test;

import com.driver.A;
import com.driver.B;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public void testMethodOverriding() {
        B obj = new B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }
}
