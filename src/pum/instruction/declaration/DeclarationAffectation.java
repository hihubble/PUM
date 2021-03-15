package pum.instruction.declaration;

import pum.expression.Expression;
import pum.expression.Variable;
import pum.instruction.Instruction;
import pum.tree.AbstractTree;

public class DeclarationAffectation extends Instruction {

    Declaration declaration;
    Expression expression;

    public DeclarationAffectation(int n, AbstractTree decl, Expression exp) {
        super(n);
        declaration = (Declaration)decl;
        declaration.parent = this;
        expression = exp;
        expression.parent = this;
    }

    @Override
    public void Verify() {
        declaration.Verify();
        expression.Verify();
        if(!declaration.GetType().equals(expression.GetType())) throw new RuntimeException("Cannot assign '" + expression + "' into variable of type '" + declaration.GetType() +"'");
    }

    @Override
    public String ToFASM() {
        return declaration.ToFASM() + expression.ToFASM();
    }
}
