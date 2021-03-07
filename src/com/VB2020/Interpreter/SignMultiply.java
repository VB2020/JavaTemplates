package com.VB2020.Interpreter;

public class SignMultiply implements MathExpression {

    MathExpression left, right;

    public SignMultiply(MathExpression left, MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}
