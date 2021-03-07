package com.VB2020.Interpreter;

public class SignDevide implements MathExpression {
    MathExpression left, right;

    public SignDevide(MathExpression left, MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret()
    {
        if (right.interpret() != 0) {

            return left.interpret() / right.interpret();
        }
        else throw new ArithmeticException("do not devide by zero!");
    }
}
