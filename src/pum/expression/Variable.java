package pum.expression;

import pum.tree.AbstractTree;

public class Variable extends Expression {

    public String name;

    public Variable(int n, String name) {
        super(n);
        this.name = name;
    }

    @Override
    public void Verify() {
        if(!ContainsVariable(name)) throw new RuntimeException("Unknown variable : " + name + "\n");
        else this.type = GetVariable(name).type;
    }

    @Override
    public String ToFASM() {
        Variable v = GetVariable(name);
        return "mov eax, [" + v.name + "]\n";
    }

    @Override
    public String GetType() {
        return type;
    }
}
