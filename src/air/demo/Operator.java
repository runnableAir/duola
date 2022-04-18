package air.demo;

public interface Operator extends Comparable<Operator> {
    Expression operator(Expression... e);
}
