package pum.expression.operation.unary;

import pum.expression.Expression;

public abstract class UnaryOperation extends Expression {

    protected Expression exp;

    protected UnaryOperation(int n, Expression exp) {
        super(n);
        this.exp = exp;
        exp.parent = this;
    }

    @Override
    public String GetType() {
        return exp.GetType();
    }
}
