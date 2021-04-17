package by.aliana.lang.node.prog;

import by.aliana.lang.node.function_impl.FuncImplNode;
import by.aliana.lang.node.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode {

    public List<FuncImplNode> funcNodes = new ArrayList<>();
}
