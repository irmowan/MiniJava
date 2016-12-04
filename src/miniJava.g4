grammar MiniJava;

prog    : mainClass (classDec)* EOF;

// parser rules
mainClass: 'class' ID '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' ID ')' '{' statement '}' '}';
classDec : 'class' ID (EXTENDS ID)? '{' (varDec)* (methodDec)* '}';
varDec   : type ID ';';
methodDec: PUBLIC type ID '(' (type ID (',' type ID)*)? ')' '{' (varDec)* (statement)* RETURN expr ';' '}';
type    : INT '[' ']'       #IntArrayType
        | BOOLEAN           #BooleanType
        | INT               #IntType
        | ID                #CustomType
        ;
statement: '{' (statement)* '}'                         #BraceStatement
         | IF '(' expr ')' statement ELSE statement     #IfStatement
         | WHILE '(' expr ')' statement                 #WhileStatement
         | 'System.out.println' '(' expr ')' ';'        #PrintStatement
         | ID '=' expr ';'                              #AssignStatement
         | ID '[' expr ']' '=' expr ';'                 #AssignArrayStatement
         ;
expr    : expr ('&&' | '<' | '+' | '-' | '*') expr      #OperateExpr
        | expr '[' expr ']'                             #IndexExpr
        | expr '.' LENGTH                               #LenghExpr
        | expr '.' ID '(' (expr (',' expr)*)? ')'       #CallExpr
        | INT_VAL                   #IntExpr
        | TRUE                      #TrueExpr
        | FALSE                     #FalseExpr
        | ID                        #IDExpr
        | THIS                      #ThisExpr
        | NEW INT '[' expr ']'      #NewIntArrayExpr
        | NEW ID '(' ')'            #NewClassInstanceExpr
        | '!' expr                  #ComplementationExpr
        | '(' expr ')'              #ParenthesisExpr
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
INT_VAL : ('0' | [1-9] DIGIT*);
fragment
LETTER  : [a-zA-Z_];
fragment
DIGIT   : [0-9];

// whitespaces and comments
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
