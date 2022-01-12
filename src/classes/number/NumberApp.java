package classes.number;

public class NumberApp {
    public static void main(String[] args) {
        Integer intNumber = 10;

        Long longNumber = intNumber.longValue();
        Double doubleNumber = intNumber.doubleValue();
        Short shortNumber = doubleNumber.shortValue();

        String exampleInt = "1000";
        Integer objectInt = Integer.valueOf(exampleInt); // Object (non-primitive) Integer
        int primitiveInt = Integer.parseInt(exampleInt); // Primitive Integer

        String exampleDouble = "100.2";
        Double objectDouble = Double.valueOf(exampleDouble);

        System.out.println(objectInt);
        System.out.println(primitiveInt);
        System.out.println(objectDouble);
    }
}
