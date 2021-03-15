package pum.expression.operation.binary;

import pum.expression.Expression;

public abstract class BinaryOperation extends Expression {

    protected Expression left, right;

    protected BinaryOperation(int n, Expression l, Expression r) {
        super(n);
        left = l;
        l.parent = this;
        right = r;
        r.parent = this;
    }

    @Override
    public String GetType() {
        return left.GetType();
    }
}
