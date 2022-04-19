package air.demo.expression;

public class NumberExpression implements Expression {
    private final int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int getAsInt() {
        return value;
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
