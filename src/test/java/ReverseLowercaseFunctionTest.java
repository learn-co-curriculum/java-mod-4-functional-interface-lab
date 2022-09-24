import org.junit.jupiter.api.Test;

class ReverseLowercaseFunctionTest {
    @Test
    void apply() {
        ConcatStringFunction function = new ReverseLowercaseFunction();
        String[] veggies = {"Cucumber", "asparAGUS"};
        assertEquals(function.apply(veggies), "asparaguscucumber");
    }
}
