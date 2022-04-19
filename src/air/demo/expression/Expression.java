package air.demo.expression;

import java.util.function.IntSupplier;

/**
 * expression standard interface
 */
public interface Expression extends IntSupplier {
    /**
     * An expression could be a consist of expression with operators, but also a single number
     * Usually, the value of an expression is the result of the value of expressions operated
     * within it, or the single number presented.
     *
     * @return the integer value of this expression
     */
    int getAsInt();

    /**
     * Expression must be associated with the text telling itself.
     *
     * @return the text represented by this expression
     */
    String getText();
}
