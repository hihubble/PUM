package pum.expression.operation.unary;

import pum.expression.Expression;

public class Increment extends UnaryOperation {
    public Increment(int n, Expression exp) {
        super(n, exp);
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        return "( increment " +  exp.ToFASM() + ")";
    }
}
