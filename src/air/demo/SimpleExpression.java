package air.demo;

public class SimpleExpression implements Expression{
    private final int value;

    public SimpleExpression(String intValue) {
        this(Integer.parseInt(intValue));
    }

    public SimpleExpression(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
