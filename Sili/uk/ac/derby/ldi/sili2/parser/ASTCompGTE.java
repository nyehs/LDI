/* Generated By:JJTree: Do not edit this line. ASTCompGTE.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.sili2.interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.sili2.parser;

public
class ASTCompGTE extends SimpleNode {
  public ASTCompGTE(int id) {
    super(id);
  }

  public ASTCompGTE(Sili p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SiliVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=22f79eac5a45adc1ddda22fbfc5a6175 (do not edit this line) */
