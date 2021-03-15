package pum.expression.operation.binary;

import pum.expression.Expression;

public class Substract extends BinaryOperation{

    public Substract(int n, Expression l, Expression r) {
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
        sb.append("mov ebx, eax\n");
        sb.append(left.ToFASM());
        sb.append("sub eax, ebx\n");
        sb.append("pop ebx\n");
        return sb.toString();
    }
}
