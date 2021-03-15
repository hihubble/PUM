
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Mar 13 16:03:04 CET 2021
//----------------------------------------------------

package pum.analyze;

import java_cup.runtime.*;
import pum.instruction.declaration.Declaration;
import pum.instruction.declaration.DeclarationAffectation;
import pum.tree.*;
import pum.expression.*;
import pum.expression.constant.*;
import pum.expression.operation.binary.*;
import pum.expression.operation.unary.*;
import pum.instruction.builtinfunction.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Mar 13 16:03:04 CET 2021
  */
public class SyntaxicAnalyzer extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SyntaxicAnalyzer() {super();}

  /** Constructor which sets the default scanner. */
  public SyntaxicAnalyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SyntaxicAnalyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\004\000\002\004\006" +
    "\000\002\004\004\000\002\004\004\000\002\005\004\000" +
    "\002\005\004\000\002\007\005\000\002\007\005\000\002" +
    "\007\005\000\002\007\005\000\002\007\005\000\002\007" +
    "\005\000\002\007\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\006\006\000\002\006\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\022\005\001\002\000\004\002\061\001" +
    "\002\000\004\005\006\001\002\000\024\007\007\010\024" +
    "\016\011\020\017\021\022\022\010\023\012\024\015\025" +
    "\014\001\002\000\004\022\060\001\002\000\020\004\uffee" +
    "\011\uffee\012\uffee\013\uffee\014\uffee\015\uffee\017\uffee\001" +
    "\002\000\014\016\011\022\010\023\012\024\015\025\014" +
    "\001\002\000\020\004\ufff1\011\ufff1\012\ufff1\013\ufff1\014" +
    "\ufff1\015\ufff1\017\ufff1\001\002\000\026\006\ufffe\007\ufffe" +
    "\010\ufffe\016\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe\024" +
    "\ufffe\025\ufffe\001\002\000\020\004\uffef\011\uffef\012\uffef" +
    "\013\uffef\014\uffef\015\uffef\017\uffef\001\002\000\020\004" +
    "\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\017\ufff0" +
    "\001\002\000\006\004\053\011\052\001\002\000\004\016" +
    "\047\001\002\000\026\006\046\007\007\010\024\016\011" +
    "\020\017\021\022\022\010\023\012\024\015\025\014\001" +
    "\002\000\004\004\044\001\002\000\004\016\041\001\002" +
    "\000\016\004\030\011\027\012\026\013\031\014\033\015" +
    "\032\001\002\000\004\022\025\001\002\000\006\004\ufff8" +
    "\011\ufff8\001\002\000\014\016\011\022\010\023\012\024" +
    "\015\025\014\001\002\000\014\016\011\022\010\023\012" +
    "\024\015\025\014\001\002\000\026\006\ufffa\007\ufffa\010" +
    "\ufffa\016\ufffa\020\ufffa\021\ufffa\022\ufffa\023\ufffa\024\ufffa" +
    "\025\ufffa\001\002\000\014\016\011\022\010\023\012\024" +
    "\015\025\014\001\002\000\014\016\011\022\010\023\012" +
    "\024\015\025\014\001\002\000\014\016\011\022\010\023" +
    "\012\024\015\025\014\001\002\000\020\004\ufff3\011\ufff3" +
    "\012\ufff3\013\ufff3\014\ufff3\015\ufff3\017\ufff3\001\002\000" +
    "\020\004\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\017\ufff2\001\002\000\020\004\ufff4\011\ufff4\012\ufff4\013" +
    "\ufff4\014\033\015\032\017\ufff4\001\002\000\020\004\ufff6" +
    "\011\ufff6\012\026\013\031\014\033\015\032\017\ufff6\001" +
    "\002\000\020\004\ufff5\011\ufff5\012\ufff5\013\ufff5\014\033" +
    "\015\032\017\ufff5\001\002\000\014\016\011\022\010\023" +
    "\012\024\015\025\014\001\002\000\016\011\027\012\026" +
    "\013\031\014\033\015\032\017\043\001\002\000\004\004" +
    "\uffec\001\002\000\026\006\ufffb\007\ufffb\010\ufffb\016\ufffb" +
    "\020\ufffb\021\ufffb\022\ufffb\023\ufffb\024\ufffb\025\ufffb\001" +
    "\002\000\026\006\uffff\007\uffff\010\uffff\016\uffff\020\uffff" +
    "\021\uffff\022\uffff\023\uffff\024\uffff\025\uffff\001\002\000" +
    "\004\002\000\001\002\000\014\016\011\022\010\023\012" +
    "\024\015\025\014\001\002\000\016\011\027\012\026\013" +
    "\031\014\033\015\032\017\051\001\002\000\004\004\uffed" +
    "\001\002\000\014\016\011\022\010\023\012\024\015\025" +
    "\014\001\002\000\026\006\ufffd\007\ufffd\010\ufffd\016\ufffd" +
    "\020\ufffd\021\ufffd\022\ufffd\023\ufffd\024\ufffd\025\ufffd\001" +
    "\002\000\016\004\055\011\027\012\026\013\031\014\033" +
    "\015\032\001\002\000\026\006\ufffc\007\ufffc\010\ufffc\016" +
    "\ufffc\020\ufffc\021\ufffc\022\ufffc\023\ufffc\024\ufffc\025\ufffc" +
    "\001\002\000\016\011\027\012\026\013\031\014\033\015" +
    "\032\017\057\001\002\000\020\004\ufff7\011\ufff7\012\ufff7" +
    "\013\ufff7\014\ufff7\015\ufff7\017\ufff7\001\002\000\006\004" +
    "\ufff9\011\ufff9\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\003\017\004\012\005\015\006\020" +
    "\007\022\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\055\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\004\044\005\015\006\020\007\022" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\037" +
    "\001\001\000\004\007\036\001\001\000\002\001\001\000" +
    "\004\007\035\001\001\000\004\007\034\001\001\000\004" +
    "\007\033\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\041\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SyntaxicAnalyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SyntaxicAnalyzer$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SyntaxicAnalyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public void report_error(String message, Object info) {

        StringBuffer m = new StringBuffer() ;

        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

            if (s.left >= 0) {
                m.append("\tligne : " + (s.left + 1)) ;
                if (s.right >= 0)
                    m.append(" colonne : " + (s.right+1)) ;
            }
            else {
                m.append("Error") ;
            }

        }
        throw new RuntimeException("" + m) ;
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SyntaxicAnalyzer$actions {


             
  private final SyntaxicAnalyzer parser;

  /** Constructor */
  CUP$SyntaxicAnalyzer$actions(SyntaxicAnalyzer parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SyntaxicAnalyzer$do_action(
    int                        CUP$SyntaxicAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$SyntaxicAnalyzer$parser,
    java.util.Stack            CUP$SyntaxicAnalyzer$stack,
    int                        CUP$SyntaxicAnalyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SyntaxicAnalyzer$result;

      /* select the action based on the action number */
      switch (CUP$SyntaxicAnalyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // FUNCTION ::= PRINTL PARLEFT EXP PARRIGHT 
            {
              AbstractTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = new PrintL(eleft + 1, e); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("FUNCTION",4, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // FUNCTION ::= PRINT PARLEFT EXP PARRIGHT 
            {
              AbstractTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = new Print(eleft + 1, e); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("FUNCTION",4, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXP ::= IDF 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Variable(ileft + 1, i); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXP ::= CSTSTR 
            {
              Expression RESULT =null;
		int cstrleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int cstrright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String cstr = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Constant(cstrleft + 1, cstr, "string"); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXP ::= CSTFLOAT 
            {
              Expression RESULT =null;
		int cfleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int cfright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String cf = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Constant(cfleft + 1, cf, "float"); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXP ::= CSTINT 
            {
              Expression RESULT =null;
		int cileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int ciright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String ci = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Constant(cileft + 1, ci, "int"); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXP ::= EXP DIVIDE EXP 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Divide(lleft + 1, l, r); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXP ::= EXP TIMES EXP 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Multiply(lleft + 1, l, r); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXP ::= EXP MINUS EXP 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Substract(lleft + 1, l, r); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXP ::= EXP PLUS EXP 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Add(lleft + 1, l, r); 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXP ::= EXP EQUAL EXP 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Affectation(lleft + 1, l, r) ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // EXP ::= PARLEFT EXP PARRIGHT 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = e ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECL ::= FLOAT IDF 
            {
              AbstractTree RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Symbol t = (Symbol)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Declaration(tleft + 1, new Variable(ileft + 1, i), "float") ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("DECL",3, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECL ::= INT IDF 
            {
              AbstractTree RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Symbol t = (Symbol)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 RESULT = new Declaration(tleft + 1, new Variable(ileft + 1, i), "int") ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("DECL",3, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INST ::= EXP SEMI 
            {
              AbstractTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = e; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("INST",2, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INST ::= FUNCTION SEMI 
            {
              AbstractTree RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		AbstractTree f = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = f; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("INST",2, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INST ::= DECL EQUAL EXP SEMI 
            {
              AbstractTree RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).right;
		AbstractTree d = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = new DeclarationAffectation(dleft + 1, d, new Affectation(eleft + 1, ((Declaration)d).GetVar(), e)) ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("INST",2, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INST ::= DECL SEMI 
            {
              AbstractTree RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		AbstractTree d = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = d ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("INST",2, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LINST ::= INST 
            {
              AbstractTree RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		AbstractTree i = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 InstructionList il = new InstructionList(ileft + 1) ;
                   il.AddInstruction(i) ;
                   RESULT = il ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("LINST",1, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LINST ::= LINST INST 
            {
              AbstractTree RESULT =null;
		int lileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int liright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		AbstractTree li = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()).right;
		AbstractTree i = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.peek()).value;
		 ((InstructionList)li).AddInstruction(i) ;
                    RESULT = li; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("LINST",1, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROG ::= IDF ACCLEFT LINST ACCRIGHT 
            {
              AbstractTree RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)).value;
		int lileft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int liright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		AbstractTree li = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		 RESULT = new Program(ileft + 1, i, li) ; 
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("PROG",0, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-3)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxicAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROG EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).right;
		AbstractTree start_val = (AbstractTree)((java_cup.runtime.Symbol) CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)).value;
		RESULT = start_val;
              CUP$SyntaxicAnalyzer$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.elementAt(CUP$SyntaxicAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxicAnalyzer$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SyntaxicAnalyzer$parser.done_parsing();
          return CUP$SyntaxicAnalyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

