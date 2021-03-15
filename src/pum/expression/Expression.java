package pum.expression;

import pum.tree.AbstractTree;

public abstract class Expression extends AbstractTree {

    public String type;

    protected Expression(int n) {
        super(n);
    }

    public abstract String GetType();
}
