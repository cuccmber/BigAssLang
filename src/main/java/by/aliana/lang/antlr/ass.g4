grammar ass;

prog: (func NEWLINE)+ ;

//TYPE
type: INT | FLOAT | BOOL;
arrayType: LEFT_SQUARE_BRACKET type RIGHT_SQUARE_BRACKET ;
genericType: type | arrayType ;

//NAME
varName: LOWERCASE (LOWERCASE | UPPERCASE | ZERO | NATURAL)* ;

//LITERAL
literal: intValue | floatValue | boolValue ;
digitLiteral: intValue | floatValue ;

//VALUE
intValue: ZERO | MINUS? NATURAL+ (ZERO | NATURAL)* ;
unsignedIntValue: ZERO | NATURAL+ (ZERO | NATURAL)* ;
floatValue: MINUS? (ZERO | NATURAL (ZERO | NATURAL)*) POINT (ZERO | NATURAL)+ ;
boolValue: AYE | GTFO;

//ARRAY
getElement: LEFT_SQUARE_BRACKET unsignedIntValue RIGHT_SQUARE_BRACKET varName ;
arrayElementValue: literal | varName | getElement | funcCall | array;
array: LEFT_CURVY_BRACKET
       arrayElementValue
       (COMMA arrayElementValue)*
       RIGHT_CURVY_BRACKET ;

//DECLARATION
declare: genericType varName ;

//ASSIGNMENT
varAssignment: varName ASSIGN expression ;
declarationAssignment: declare ASSIGN expression ;
arrayElementAssignment: getElement ASSIGN expression ;

varAssignmentToArray: varName ASSIGN array ;
declarationAssignmentToArray: declare ASSIGN array ;
arrayElementAssignmentToArray: getElement ASSIGN array ;

assign: varAssignment | declarationAssignment | arrayElementAssignment
        | varAssignmentToArray | declarationAssignmentToArray
        | arrayElementAssignmentToArray ;

//CAST
castExpression: LEFT_ROUND_BRACKET type RIGHT_ROUND_BRACKET ;

varCast: varName ASSIGN castExpression expression ;
declarationCast: declare ASSIGN castExpression expression ;
arrayElementCast: getElement ASSIGN castExpression expression ;

cast: varCast | declarationCast | arrayElementCast ;

//STATEMENT
statement:
           ( declare
           | assign
           | cast
           | ifClause
           | funcCall
           )
          ;

//BODY CONTENT
bodyContent: (statement NEWLINE)* ;

//FUNCTION
signature: varName LEFT_ROUND_BRACKET attribute* RIGHT_ROUND_BRACKET ;
attribute: (declare COMMA)* declare ;
drop: DROP expression ;

func:
     FUNKK genericType? signature NEWLINE
     DOLLAR_SIGN NEWLINE
     bodyContent
     (drop NEWLINE)?
     DOLLAR_SIGN
    ;

funcCallAttribute: varName | literal | getElement | funcCall | array ;
funcCall: varName LEFT_ROUND_BRACKET
          ((funcCallAttribute COMMA)* funcCallAttribute)?
          RIGHT_ROUND_BRACKET ;

//EXPRESSIONS
arithmeticUnit: varName | literal | getElement | funcCall ;
unaryMinusUnit: varName | digitLiteral | getElement ;

expression:   LEFT_ROUND_BRACKET expression RIGHT_ROUND_BRACKET  #logicExpressionWithBrackets
            | MINUS unaryMinusUnit                               #unaryMinusExpression
            | INVERSION expression                               #inversionLogicExpression
            | expression (DIVISION | MULTIPLICATION) expression  #divisionMultiplicationExpression
            | expression (PLUS | MINUS) expression               #plusMinusExpression
            | expression (EQUAL | GREATER | GREATER_OR_EQUAL |
             LESS | LESS_OR_EQUAL | NOT_EQUAL) expression        #comparisonExpression
            | expression LOGICAL_AND expression                  #andLogicExpression
            | expression LOGICAL_OR expression                   #orLogicExpression
            | arithmeticUnit                                     #arithmeticExpression
            ;

//IF-ELIF-ELSE STATEMENT
ifBlock: IF expression NEWLINE
         DOLLAR_SIGN NEWLINE
         bodyContent
         DOLLAR_SIGN
         ;
elifBlock: NEWLINE ELSE ifBlock ;
elseBlock: NEWLINE ELSE NEWLINE
           DOLLAR_SIGN NEWLINE
           bodyContent
           DOLLAR_SIGN
           ;
ifClause: ifBlock (elifBlock)* (elseBlock)? ;


INT: 'INT' ;
FLOAT: 'FLOAT' ;
BOOL: 'BOOL' ;
ASSIGN: '=' ;
PLUS: '+' ;
MULTIPLICATION: '*' ;
DIVISION: '/' ;
MINUS : '-' ;
POINT : '.' ;
COMMA : ',' ;
LEFT_SQUARE_BRACKET: '[' ;
RIGHT_SQUARE_BRACKET: ']' ;
LEFT_ROUND_BRACKET: '(' ;
RIGHT_ROUND_BRACKET: ')' ;
LEFT_CURVY_BRACKET: '{' ;
RIGHT_CURVY_BRACKET: '}' ;
DOLLAR_SIGN: '$' ;
FUNKK: 'FUNKK' ;
DROP: 'DROP' ;
LOWERCASE : [a-z] ;
UPPERCASE : [A-Z] ;
ZERO : '0' ;
NATURAL : [1-9] ;
DIGIT: [0-9];
WS : [ \t]+ -> skip;
NEWLINE : [\n] ;
AYE: 'AYE' ;
GTFO: 'GTFO' ;
IF: 'IF' ;
ELSE: 'ELSE' ;
EQUAL:  '==' ;
GREATER: '>' ;
LESS: '<' ;
GREATER_OR_EQUAL: '>=' ;
LESS_OR_EQUAL: '<=' ;
NOT_EQUAL: '!=' ;
LOGICAL_AND: '&&' ;
LOGICAL_OR: '||' ;
INVERSION: '!' ;
