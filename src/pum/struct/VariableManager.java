package pum.struct;

import pum.expression.Variable;

import java.util.HashMap;

public class VariableManager {

    private HashMap<String, Variable> variables;

    public VariableManager()
    {
        variables = new HashMap<>(8);
    }

    public boolean ContainsVariable(String varname)
    {
        return variables.containsKey(varname);
    }

    public void Add(Variable var)
    {
        variables.put(var.name, var);
    }

    public Variable Get(String name)
    {
        return variables.get(name);
    }

}
