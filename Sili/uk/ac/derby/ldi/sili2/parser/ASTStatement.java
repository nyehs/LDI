/* Generated By:JJTree: Do not edit this line. ASTStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.sili2.interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.sili2.parser;

public
class ASTStatement extends SimpleNode {
  public ASTStatement(int id) {
    super(id);
  }

  public ASTStatement(Sili p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SiliVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=0a6f95d4137529b6e48534856fc8f793 (do not edit this line) */
