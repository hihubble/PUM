package pum.tree;

import pum.expression.Variable;
import pum.struct.VariableManager;

import java.util.LinkedList;

public class InstructionList extends AbstractTree {

    protected LinkedList<AbstractTree> instructions;

    public VariableManager vmanager;

    public InstructionList(int n)
    {
        super(n);
        instructions = new LinkedList<>();
        vmanager = new VariableManager();
    }

    public void AddInstruction(AbstractTree ins)
    {
        instructions.add(ins);
        ins.parent = this;
    }

    @Override
    public void Verify() {
        for(AbstractTree ins : instructions) ins.Verify();
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder(1024);

        for(AbstractTree ab : instructions) sb.append(ab.ToFASM() + "\n");

        return sb.toString();
    }

    @Override
    public boolean ContainsVariable(String name) {
        return vmanager.ContainsVariable(name);
    }

    @Override
    public void AddVariable(Variable var) {
        vmanager.Add(var);
    }

    @Override
    public Variable GetVariable(String name) {
        return vmanager.Get(name);
    }
}
