package com.VB2020.Interpreter;

// не терминальное выражение
public class SignMinus implements MathExpression {
    MathExpression left, right;

    public SignMinus(MathExpression left, MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() - right.interpret();
    }
}
