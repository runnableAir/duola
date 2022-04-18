package air.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BaseExpression implements Expression {
    private List<BaseExpression> sonExpress;
    private List<Operator> ops;
    private final String expr;

    public BaseExpression(String expr) {
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String getText() {
        return null;
    }

    public List<BaseExpression> getSonExpress() {
        if (!sonExpress.isEmpty()) {
            return sonExpress;
        }
        // parsing
        Deque<BaseExpression> stackExpr = new ArrayDeque<>();
        Deque<Operator> stackOpr = new ArrayDeque<>();
        int n = expr.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                String exprStr = sb.toString();

            }
        }
        return sonExpress;
    }
}
