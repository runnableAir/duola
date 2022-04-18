package air.demo;

/**
 * expression standard interface
 */
public interface Expression {
    /**
     * An expression could be a consist of expression with operators, but also a single number
     * Usually, the value of an expression is the result of the value of expressions operated
     * within it, or the single number presented.
     *
     * @return the value of this expression
     */
    int getValue();

    String getText();
}
