package pum.instruction.builtinfunction;

import pum.expression.Expression;
import pum.instruction.Instruction;
import pum.struct.TypeManager;

public class Print extends Instruction
{
    private Expression e;

    public Print(int n, Expression e) {
        super(n);
        e.parent = this;
        this.e = e;
    }

    @Override
    public void Verify() {
        e.Verify();
        if(e.GetType() == null) throw new RuntimeException("Cannot print variable without type");
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder();
        sb.append(e.ToFASM());
        sb.append("stdcall print, '" + TypeManager.Instance().GetC("PrintFormat", e.GetType()) + "', eax\n");
        return sb.toString();
    }
}
