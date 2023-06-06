package test.simple;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import steps.Steps;

public class Tests {
    @Test
    @Feature("Проверка")
    public void test(){
        Steps.step(2);
    }
}
