grammar ass;

prog:
    NEWLINE*
    (func NEWLINE+)+
    ;

//TYPE
type: INT | FLOAT | BOOL ;
arrayType: LEFT_SQUARE_BRACKET type RIGHT_SQUARE_BRACKET;

//NAME
varName: LOWERCASE (LOWERCASE | UPPERCASE | ZERO | NATURAL)* ;

//VALUE
value: intValue | floatValue | boolValue ;
arrayElement: value | varName | getElement | funcCall | array;
array: LEFT_CURVY_BRACKET
       arrayElement
       (COMMA arrayElement)*
       RIGHT_CURVY_BRACKET ;

intValue: ZERO | MINUS? NATURAL+ (ZERO | NATURAL)* ;
unsignedIntValue: ZERO | NATURAL+ (ZERO | NATURAL)* ;
floatValue: MINUS? (ZERO | NATURAL (ZERO | NATURAL)*) POINT (ZERO | NATURAL)+;
boolValue: AYE | GTFO;

getElement: LEFT_SQUARE_BRACKET unsignedIntValue RIGHT_SQUARE_BRACKET varName ;

//DECLARATION
declare: (type | arrayType) varName
        ;

//ASSIGNMENT
assignmentLeftPart: declare | varName | getElement ;
assignmentRightPart: value | varName | getElement | arithmeticExpression | array | funcCall ;
assign: assignmentLeftPart ASSIGN (cast)? assignmentRightPart ;

//CASTING
cast: LEFT_ROUND_BRACKET (type) RIGHT_ROUND_BRACKET ;

//STATEMENT
statement:
     ( declare
     | assign
     | ifClause
     | funcCall
     )
     NEWLINE+
    ;

//BODY CONTENT
bodyContent: statement* ;

//FUNCTION
signature: varName LEFT_ROUND_BRACKET attribute* RIGHT_ROUND_BRACKET ;
attribute: (declare COMMA)* declare;
drop: DROP ((varName | value | array | comparisonLogicalStatementWithBrackets | arithmeticExpression | funcCall))? ;

func:
     FUNKK ((type | arrayType))? signature NEWLINE
     DOLLAR_SIGN NEWLINE
     bodyContent
     (drop NEWLINE)?
     DOLLAR_SIGN
    ;

funcCallAttribute: varName | value | getElement | funcCall | array ;
funcCall: varName LEFT_ROUND_BRACKET ((funcCallAttribute COMMA)* funcCallAttribute)? RIGHT_ROUND_BRACKET
    ;

//IF-ELIF-ELSE STATEMENT
comparisonOperator: EQUAL | GREATER | GREATER_OR_EQUAL | LESS | LESS_OR_EQUAL | NOT_EQUAL ;
logicalComparisonOperator: LOGICAL_AND | LOGICAL_OR ;
comparisonAtom: varName | value | getElement | signature | arithmeticExpression | funcCall ;
comparisonStatement: comparisonAtom (comparisonOperator comparisonAtom)? ;
comparisonLogicalStatement: comparisonStatement (logicalComparisonOperator comparisonStatement)* ;
comparisonLogicalStatementWithBrackets: LEFT_ROUND_BRACKET (comparisonLogicalStatement | comparisonLogicalStatementWithBrackets)
 (logicalComparisonOperator (comparisonLogicalStatement | comparisonLogicalStatementWithBrackets))*  RIGHT_ROUND_BRACKET ;

ifBlock: IF comparisonLogicalStatementWithBrackets NEWLINE
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

//ARITHMETICS
arithmeticOperator: PLUS | MINUS | MULTIPLY | DIVISION ;
arithmeticAtom: (varName | value | getElement | arithmeticAtomWithBrackets) (arithmeticOperator (varName | value | getElement | arithmeticAtomWithBrackets))+;
arithmeticAtomWithBrackets: LEFT_ROUND_BRACKET arithmeticAtom+  RIGHT_ROUND_BRACKET;
arithmeticExpression: (arithmeticAtomWithBrackets | arithmeticAtom) (arithmeticOperator (arithmeticAtom | arithmeticAtomWithBrackets))*;

//LEXEMAS
INT: 'INT' ;
FLOAT: 'FLOAT' ;
BOOL: 'BOOL' ;
ASSIGN: '=' ;
PLUS: '+' ;
MULTIPLY: '*' ;
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
LOWERCASE : [a-z] ;
UPPERCASE : [A-Z] ;
ZERO : '0' ;
NATURAL : [1-9] ;
DIGIT: [0-9];
WS : [ \t]+ -> skip;
NEWLINE : [\n\r] ;
AYE: 'AYE' ;
GTFO: 'GTFO' ;
DOLLAR_SIGN: '$' ;
FUNKK: 'FUNKK' ;
DROP: 'DROP' ;
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
