package air.demo.operator;

import air.demo.expression.Expression;

import java.util.function.UnaryOperator;

/**
 * an operation on expressions will return a new expression
 */
public interface Operator extends UnaryOperator<Expression>, Comparable<Operator> {

}
