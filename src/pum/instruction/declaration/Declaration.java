package pum.instruction.declaration;

import pum.expression.Variable;
import pum.instruction.Instruction;
import pum.struct.TypeManager;
import pum.tree.AbstractTree;

public class Declaration extends Instruction {

    private Variable var;

    public Declaration(int n, Variable var, String type) {
        super(n);
        this.var = var;
        this.var.parent = this;
        this.var.type = type;
    }

    @Override
    public void Verify() {
        if (ContainsVariable(var.name))
            throw new RuntimeException("Variable " + var.name + " already defined (type : " + GetVariable(var.name).type + ")");
        else AddVariable(var);
    }

    public String GetName() {
        return var.name;
    }

    public String GetType() {
        return var.type;
    }

    public Variable GetVar() {
        return var;
    }

    @Override
    public String ToFASM() {
        return "local " + var.name + ":" + TypeManager.Instance().GetC("Type", GetType()) + " ?\n";
    }
}
