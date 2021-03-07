package com.VB2020.Interpreter;

// терминальное выражение - само число
public class Number implements MathExpression {

    private double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }
}
