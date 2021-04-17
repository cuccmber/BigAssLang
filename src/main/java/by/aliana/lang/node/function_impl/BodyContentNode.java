package by.aliana.lang.node.function_impl;

import by.aliana.lang.node.ASTNode;
import by.aliana.lang.node.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

public class BodyContentNode extends ASTNode {

    public List<StatementNode> statementNodes = new ArrayList<>();
}
