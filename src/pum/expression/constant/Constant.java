package pum.expression.constant;

import pum.expression.Expression;

public class Constant extends Expression {

    private String value;

    public Constant(int n, String val, String type) {
        super(n);
        value = val;
        this.type = type;
    }

    @Override
    public void Verify() {
    }

    @Override
    public String ToFASM() {
        return "mov eax, " + value + "\n";
    }

    @Override
    public String GetType() {
        return type;
    }
}
