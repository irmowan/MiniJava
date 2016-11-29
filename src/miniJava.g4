grammar miniJava;

r       : 'hello' ID ;         // match keyword hello followed by an identifier
WS      : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

// Keywords
BOOLEAN : 'boolean';
CLASS   : 'class';
ELSE    : 'else';
EXTENDS : 'extends';
FLASE   : 'false';
IF      : 'if';
INT     : 'int';
LENGTH  : 'length';
MAIN    : 'main';
NEW     : 'new';
PUBLIC  : 'public';
RETURN  : 'return';
STATIC  : 'static';
STRING  : 'string';
THIS    : 'this';
TRUE    : 'true';
VOID    : 'void';
WHILE   : 'while';

// Operators
ASSIGN  : '=';
GT      : '>';
LT      : '<';
GE      : '>=';
LE      : '<=';
PLUS    : '+';
MINUS   : '-';
BANG    : '!';
AND     : '&&';
OR      : '||';

// Separators
L_PAREN : '(';
R_PAREN : ')';
L_BRACK : '[';
R_BRACK : ']';
L_BRACE : '{';
R_BRACE : '}';
COMMA   : ',';
DOT     : '.';
SEMI    : ';';

// Identifier
U_LETTER: [A-Z];
L_LETTER: [a-z];
LETTER  : U_LETTER | L_LETTER;
DIGIT   : [0-9];
ID      : LETTER (LETTER | DIGIT)*;

