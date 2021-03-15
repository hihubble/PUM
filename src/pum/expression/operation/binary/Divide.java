package pum.expression.operation.binary;

import pum.expression.Expression;

public class Divide extends BinaryOperation{
    public Divide(int n, Expression l, Expression r) {
        super(n, l, r);
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder();
        sb.append("push ebx\n");
        sb.append(right.ToFASM());
        sb.append("mov ebx, eax\n");
        sb.append(left.ToFASM());
        sb.append("mov edx, 0\n");
        sb.append("div ebx\n");
        sb.append("pop ebx\n");
        return sb.toString();
    }
}
