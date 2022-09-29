# Functional Interface Lab

## Instruction
NOTE: The junit test classes won't compile until tasks 1-3 are completed.

### TASK #1:

Create a new functional interface named `ConcatStringFunction`.

The interface should declare an abstract method named `apply` that takes a string array
as a parameter and returns a string.

```java
String apply(String[] strings);
```

Use the `@FunctionalInterface` annotation to force the compiler to check for a single abstract method.

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

Update the main method to test the function classes on an example array.

The variable `function` can be
assigned to instances of `InorderUppercaseFunction` and `ReverseLowercaseFunction` since
both classes implement the `ConcatStringFunction` interface.

If the code does not compile, check that the classes implement the interface.

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

- `ConcatStringFunctionTest` : Tests that interface`ConcatStringFunction` is annotated with `@FunctionalInterface`.
- `InorderUppercaseFunctionTest` : Tests the method  `InorderUppercaseFunction.apply()`.
- `ReverseLowercaseFunctionTest` : Tests the method  `ReverseLowercaseFunction.apply()`.