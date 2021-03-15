package pum.expression.operation.binary;

import pum.expression.Expression;
import pum.expression.Variable;
import pum.instruction.declaration.Declaration;

public class Affectation extends BinaryOperation {


    public Affectation(int n, Expression l, Expression r) {
        super(n, l, r);
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder();
        if(left instanceof Variable)
        {
            Variable v = (Variable)left;
            sb.append(right.ToFASM());
            sb.append("mov [" + v.name + "], eax\n");
        }
        return sb.toString();
    }
}
