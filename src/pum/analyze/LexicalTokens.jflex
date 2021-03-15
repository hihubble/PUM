package pum.analyze ;

import java_cup.runtime.*;
      
%%
   
%class LexicalAnalyzer
%public

%line
%column
    
%type Symbol
%eofval{
        return symbol(LexicalCodes.EOF) ;
%eofval}

%cup

%{

  private StringBuilder string ;

  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }
%}

idf = [A-Za-z_][A-Za-z_0-9]*

cstI = [0-9]+
cstF = [0-9]*\.[0-9]+
cstStr = ["]{char}*["]

eol = \r|\n
space = {eol}  | [ \t\f]

char = [^\r\n]
comment = "//" {char}* {eol}?

%%

"int"                   { return symbol(LexicalCodes.INT); }
"float"                 { return symbol(LexicalCodes.FLOAT); }

"Print"                 { return symbol(LexicalCodes.PRINT); }
"PrintL"                { return symbol(LexicalCodes.PRINTL); }

"="                     { return symbol(LexicalCodes.EQUAL); }
"+"                     { return symbol(LexicalCodes.PLUS); }
"-"                     { return symbol(LexicalCodes.MINUS); }
"*"                     { return symbol(LexicalCodes.TIMES); }
"/"                     { return symbol(LexicalCodes.DIVIDE); }

"<"                     { return symbol(LexicalCodes.LT); }
"<="                    { return symbol(LexicalCodes.LET); }
">"                     { return symbol(LexicalCodes.GT); }
">="                    { return symbol(LexicalCodes.GET); }
"=="                    { return symbol(LexicalCodes.DEGAL); }
"!="                    { return symbol(LexicalCodes.DIFFEGAL); }

"&&"                    { return symbol(LexicalCodes.LAND); }
"||"                    { return symbol(LexicalCodes.LOR); }

"{"                     { return symbol(LexicalCodes.ACCLEFT); }
"}"                     { return symbol(LexicalCodes.ACCRIGHT); }

"("                     { return symbol(LexicalCodes.PARLEFT); }
")"                     { return symbol(LexicalCodes.PARRIGHT); }

";"                     { return symbol(LexicalCodes.SEMI); }

{cstF}                  { return symbol(LexicalCodes.CSTFLOAT, yytext()); }
{cstI}                  { return symbol(LexicalCodes.CSTINT, yytext()); }

{idf}      	            { return symbol(LexicalCodes.IDF, yytext()); }

{comment}               { }

{space}                 { }

.                       { throw new RuntimeException("" + yyline + ":" + yycolumn + yytext()); }
