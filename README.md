# Functional Interface Lab

## Instruction
NOTE: The junit test classes won't compile until after you've completed tasks 1-3.

### TASK #1:

Create a new functional interface named `ConcatStringFunction`.

The interface should declare an abstract method named `apply` that takes a string array as a parameter and returns a string.

```java
String apply(String[] strings);
```

Make sure to use the `@FunctionalInterface` annotation to force the compiler to check for a single abstract method.

### TASK #2:

Create a new class `InorderUppercaseFunction` that implements the `ConcatStringFunction` interface.

Override the `apply` method to concatenate and uppercase the parameter's array of strings :

```java
return String.join("", strings).toUpperCase();
```

### TASK #3:

Create a new class `ReverseLowercaseFunction` that implements the `ConcatStringFunction` interface.

Override the `apply` method to reverse the order of the array contents, then concatenate and lowercase
the strings in the array.

```java
Collections.reverse(Arrays.asList(strings));
return String.join("", strings).toLowerCase();
```

Add the necessary imports for `java.util.Collections` and `java.util.Arrays`.

### Task #4:

Update the main method to test your function classes on an example array.

We can declare the variable `ConcatStringFunction function` and then
assign the variable to new instances of `InorderUppercaseFunction` and `ReverseLowercaseFunction` since
both classes implement the interface.

If your code does not compile, check that the classes do in fact implement the interface.

```java
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"banana", "Grape", "SMOOTHIE"};
        ConcatStringFunction function;

        function = new InorderUppercaseFunction();
        System.out.println(function.apply(fruits)); //BANANAGRAPESMOOTHIE

        function = new ReverseLowercaseFunction();
        System.out.println(function.apply(fruits)); //smoothiegrapebanana
    }
}
```

Run the program and confirm the output:

```text
BANANAGRAPESMOOTHIE
smoothiegrapebanana
```

### Task #5:

Run the 3 Junit test classes in the test/java folder to confirm your implementation.

- `ConcatStringFunctionTest` : Tests interface`ConcatStringFunction` annotated with `@FunctionalInterface`.
- `InorderUppercaseFunctionTest` : Tests method  `InorderUppercaseFunction.apply()`.
- `ReverseLowercaseFunctionTest` : Tests method  `ReverseLowercaseFunction.apply()`.