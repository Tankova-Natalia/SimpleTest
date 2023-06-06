package steps;


import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class Steps {
    @Step("Проверить, что {x} равно 2")
    public static void step(int x) {
        Assertions.assertEquals(2,x,x +" не равно 2");
    }
}
