package air.demo.expression;

import air.demo.operator.Operator;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleExpression extends AbstractExpression {
    Deque<Expression> expr;
    Deque<Operator> opr;

    public SimpleExpression() {
        expr = new ArrayDeque<>();
        opr = new ArrayDeque<>();
    }

    public SimpleExpression(String exprString) {
        this();
        // 解析传入的exprString
        int n = exprString.length();
        int l, r;
        l = r = n - 1;
        while (l >= 0) {

            while (l >= 0) {
                char c = exprString.charAt(l);
                if (!Character.isDigit(c)) {
                    break;
                }
                --l;
            }
            int numericItem = 0;
            while (r < l) {
                int b = exprString.charAt(r) - '0';
                numericItem = numericItem * 10 + b;
                --r;
            }
        }

    }

    @Override
    public void add(AbstractExpression e, Operator relation) {

    }

    @Override
    public int getAsInt() {
        return 0;
    }

    @Override
    public String getText() {
        return null;
    }
}
