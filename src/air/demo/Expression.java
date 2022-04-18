package air.demo;

import java.util.List;

public class Expression {
    private List<Expression> sonExpress;
    private int level;
    private List<Operator> ops;

    public List<Expression> getSonExpress() {
        return sonExpress;
    }
}
