package com.VB2020.Interpreter;

// хранит состояние обьекта или программы
public class Context {
    MathExpression submit(String expression)
    {
        // идем справа налево по мат. выражению
        int position = expression.length() - 1; // последний символ в выражении
        while (position > 0)
        {
            if (Character.isDigit(expression.charAt(position))) // если это число
            {
                position --; // тогда двигаемся дальше налево
                // до тех пор пока мы не встретим знак - или +
            }
            else {
                 // дошли до знака
                 // и применяем рекурсивно все тоже самое для левого выражения

                 MathExpression left = submit(expression.substring(0, position));
                 MathExpression right = new Number(Double.parseDouble(expression.substring(position + 1)));
                 char sign = expression.charAt(position);
                 switch (sign)
                 {
                     case '-': return new SignMinus(left, right);
                     case '+': return new SignPlus(left, right);
                     case '*': return new SignMultiply(left, right);
                     case '/': return new SignDevide(left, right);

                 }
            }
        }
        double result = Double.parseDouble(expression);
        return new Number(result);
    }
}
