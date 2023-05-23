package test.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void test(){
        Assertions.assertEquals(2,2,"2 не равно 2");
    }
}
