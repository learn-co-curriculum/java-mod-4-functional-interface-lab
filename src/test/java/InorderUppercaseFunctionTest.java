import org.junit.jupiter.api.Test;

class InorderUppercaseFunctionTest {
    @Test
    void apply() {
        ConcatStringFunction function = new InorderUppercaseFunction();
        String[] veggies = {"Cucumber", "asparAGUS"};
        assertEquals(function.apply(veggies), "CUCUMBERASPARAGUS");
    }

}
