package com.tnsif.wrapperclass;

public class Wrapperclass {
    public static void main(String[] args) {
        // Example 1: Autoboxing and Unboxing
        Integer wrapperInt = 12; // Autoboxing (int -> Integer)
        int primitiveInt = wrapperInt; // Unboxing (Integer -> int)
        System.out.println("Primitive int: " + primitiveInt);

        // Example 2: Converting String to Wrapper Object
        String str = "112";
        Integer wrapperIntFromStr = Integer.parseInt(str); // String -> int -> Integer
        System.out.println("Wrapper Integer from String: " + wrapperIntFromStr);

        // Example 3: Using Wrapper Class Methods
        Double wrapperDouble = 11.45;
        System.out.println("Double value: " + wrapperDouble);
        System.out.println("Double value as int: " + wrapperDouble.intValue());
        System.out.println("Double value as string: " + wrapperDouble.toString());
    }
}