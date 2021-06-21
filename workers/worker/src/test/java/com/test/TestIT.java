package com.test;

import com.test.utils.ClassWithStaticMethod;
import org.junit.Test;

// If rename without *IT then it will pass correct
public class TestIT {

    @Test
    public void test() {
        ClassWithStaticMethod.execute();
    }
}
