public class NodeBST{
	private NodeBST parent=null;
	private NodeBST left=null;
	private NodeBST right=null;
	private int key;

	public NodeBST(){
	}

	public NodeBST(NodeBST parent, NodeBST left, NodeBST right, int key){
		this.parent=parent;
		this.left=left;
		this.right=right;
		this.key=key;ß
	}
	
}