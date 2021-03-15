package pum.expression.operation.binary;

import pum.expression.Expression;

public class Add extends BinaryOperation{
    public Add(int n, Expression l, Expression r) {
        super(n, l, r);
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder();
        sb.append("push edx\n");
        sb.append(right.ToFASM());
        sb.append("mov edx, eax\n");
        sb.append(left.ToFASM());
        sb.append("add eax, edx\n");
        sb.append("pop edx\n");
        return sb.toString();
    }
}
