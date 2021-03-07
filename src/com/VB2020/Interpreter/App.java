package com.VB2020.Interpreter;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        MathExpression mathExpression = context.submit("-10-2+1");
        System.out.println(mathExpression.interpret());
    }
}
