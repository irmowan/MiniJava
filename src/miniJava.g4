grammar MiniJava;

prog    : mainClass (classDec)* EOF;

// parser rules
mainClass: 'class' ID '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' ID ')' '{' statement '}' '}';
classDec : 'class' ID (EXTENDS ID)? '{' (varDec)* (methodDec)* '}';
varDec   : type ID ';';
methodDec: PUBLIC type ID '(' (type ID (',' type ID)*)? ')' '{' (varDec)* (statement)* RETURN expr ';' '}';
type    : INT '[' ']'
        | BOOLEAN
        | INT
        | ID
        ;
statement: '{' (statement)* '}'
         | IF '(' expr ')' statement ELSE statement
         | WHILE '(' expr ')' statement
         | 'System.out.println' '(' expr ')' ';'
         | ID '=' expr ';'
         | ID '[' expr ']' '=' expr ';'
         ;
expr    : expr ('&&' | '<' | '+' | '-' | '*') expr
        | expr '[' expr ']'
        | expr '.' LENGTH
        | expr '.' ID '(' (expr (',' expr)*)? ')'
        | INT_VAL
        | TRUE
        | FALSE
        | ID
        | THIS
        | NEW INT '[' expr ']'
        | NEW ID '(' ')'
        | '!' expr
        | '(' expr ')'
        ;

// Keywords
BOOLEAN : 'boolean';
CLASS   : 'class';
ELSE    : 'else';
EXTENDS : 'extends';
FALSE   : 'false';
IF      : 'if';
INT     : 'int';
LENGTH  : 'length';
MAIN    : 'main';
NEW     : 'new';
PUBLIC  : 'public';
RETURN  : 'return';
STATIC  : 'static';
STRING  : 'String';
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
ID      : LETTER (LETTER | DIGIT)*;
INT_VAL : SIGN? ('0' | [1-9] DIGIT*);
LETTER  : [a-zA-Z_];
DIGIT   : [0-9];
SIGN    : [+-];

// whitespaces and comments
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
