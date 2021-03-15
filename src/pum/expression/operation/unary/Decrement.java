package pum.expression.operation.unary;

import pum.expression.Expression;

public class Decrement extends UnaryOperation {

    public Decrement(int n, Expression exp) {
        super(n, exp);
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        return "( decrement " +  exp.ToFASM() + ")";
    }
}
