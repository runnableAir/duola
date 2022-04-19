package air.demo.expression;

import air.demo.operator.Operator;


public abstract class AbstractExpression implements Expression {

    /**
     * 将一个子表达式添加到当前表达式中
     * @param e 子表达式
     * @param relation 决定子表达式与当前表达式的运算关系
     */
    public abstract void add(AbstractExpression e, Operator relation);
}
