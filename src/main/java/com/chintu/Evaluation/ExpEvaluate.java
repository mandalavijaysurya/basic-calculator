package com.chintu.Evaluation;

import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class ExpEvaluate {
    private String expression;

    public ExpEvaluate() {
    }


    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String evaluate() {
        return Double.toString(evaluateExpression(expression));
    }

    public double evaluateExpression(String expression) {
        String postfix = infixToPostfix(expression);
        return evaluatePostfix(postfix);
    }

    private String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> operatorStack = new ArrayDeque<>();

        Map<Character, Integer> precedence = new HashMap<>();
        precedence.put('(', 1);
        precedence.put('+', 2);
        precedence.put('-', 2);
        precedence.put('*', 3);
        precedence.put('/', 3);

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // Pop '('
            } else {
                while (!operatorStack.isEmpty() && precedence.get(operatorStack.peek()) >= precedence.get(c)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    private double evaluatePostfix(String postfix) {
        Deque<Double> operandStack = new ArrayDeque<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                operandStack.push(Double.parseDouble(Character.toString(c)));
            } else {
                double operand2 = operandStack.pop();
                double operand1 = operandStack.pop();
                switch (c) {
                    case '+' -> operandStack.push(operand1 + operand2);
                    case '-' -> operandStack.push(operand1 - operand2);
                    case '*' -> operandStack.push(operand1 * operand2);
                    case '/' -> operandStack.push(operand1 / operand2);
                }
            }
        }

        return operandStack.pop();
    }
}
