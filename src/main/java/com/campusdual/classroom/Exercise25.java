package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> pila = new Stack<>();
        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");

        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (stack.empty() == false) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> newPila = createStack();
        printAndEmptyStack(newPila);
        System.out.println("==============");
        printAndEmptyStack(newPila);
    }
}
