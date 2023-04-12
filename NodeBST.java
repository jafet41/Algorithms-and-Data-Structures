public class NodeBST{
	private NodeBST parent;
	private NodeBST left;
	private NodeBST right;
	private Integer key;
	//-----Constructor for Empty Node-------
	public NodeBST(){
		this.key=null;
		this.parent=null;
		this.left=null;
		this.right=null;
	}
	//----Constructor for Node with Key-----
	public NodeBST(Integer key){
		this.key=key;
		this.parent=null;
		this.left=null;
		this.right=null;
	}
	//----------------Getters---------------
	public NodeBST getParent(){
		return this.parent;
	}
	public NodeBST getLeft(){
		return this.left;
	}
	public NodeBST getRight(){
		return this.right;
	}
	public Integer getKey(){
		return this.key;
	}
	//----------------Setters---------------
	public void setParent(NodeBST parent){
		this.parent=parent;
	}
	public void setLeft(NodeBST left){
		this.left=left;
	}
	public void setRight(NodeBST right){
		this.right=right;
	}
	public void setKey(Integer key){
		this.key=key;
	}

	//--------------------------Find Value Method------------------------------
	//
	//-------------------------------------------------------------------------
	//-----------------------Find Minimum Value Method-------------------------
	//
	//-------------------------------------------------------------------------	
}
