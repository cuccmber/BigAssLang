package tree;

import node.ASTNode;

public class AST {
    private ASTNode root;

    public AST(ASTNode root){
        this.root = root;
    }

//    public void traverseAST(ASTNode root){
//        System.out.println(root.getName());
//        if(root.getChildren().size() != 0)
//            for(ASTNode child : root.getChildren())
//                traverseAST(child);
//    }
}
