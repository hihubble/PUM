package pum.tree;

import pum.expression.Variable;

public abstract class AbstractTree
{
    protected int line_num;

    public AbstractTree parent;

    protected AbstractTree(int n)
    {
        line_num = n;
    }

    public int GetLineNumber()
    {
        return line_num;
    }

    public abstract void Verify();

    public abstract String ToFASM();

    public void AddVariable(Variable var)
    {
        parent.AddVariable(var);
    }

    public boolean ContainsVariable(String name)
    {
        return parent.ContainsVariable(name);
    }

    public Variable GetVariable(String name)
    {
        return parent.GetVariable(name);
    }
}
