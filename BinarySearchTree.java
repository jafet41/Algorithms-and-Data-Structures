public class BinarySearchTree {
	private NodeBST root;
	public BinarySearchTree(){
		this.root=new NodeBST();
	}
	public NodeBST getRoot(){
		return this.root;
	}
	//-------------------------In Order Traversal------------------------------
	public void inOrderTraversal(NodeBST node){

		if(root==null) {
			System.out.println("The tree is empty");
			return;	
		}

		NodeBST current=node;
		if (current==null) {
			return;
		}

		//Visit Left if exists
		if(current.getLeft()!=null)  inOrderTraversal( current.getLeft() ); 
		//Print Node
		System.out.println( current.getKey() );
		//Visit Right if exists
		if(current.getRight()!=null) inOrderTraversal( current.getRight() ); 
	
	}


	//------------------------------Insert Method------------------------------	
	public void insert(NodeBST currentRoot,int newKey){
		Integer valueK;
		if (currentRoot!=null) {
			valueK=currentRoot.getKey();
		}else{
			valueK=null;
		}
		//Root case
		if(valueK==null){
			currentRoot.setKey(newKey);
			return;
		}
		//Left
		if ( newKey<currentRoot.getKey() && currentRoot.getLeft()==null ) {
			NodeBST newL=new NodeBST(newKey);
			newL.setParent(currentRoot);
			currentRoot.setLeft( newL );
			return;
		}else if ( newKey<currentRoot.getKey() && currentRoot.getLeft()!=null ) {
			insert(currentRoot.getLeft(),newKey);
		}

		//Right
		if ( newKey>currentRoot.getKey() && currentRoot.getRight()==null ) {
			NodeBST newR=new NodeBST(newKey);
			newR.setParent(currentRoot);
			currentRoot.setRight( newR );
			return;
		}else if ( newKey>currentRoot.getKey() && currentRoot.getRight()!=null ) {
			insert(currentRoot.getRight(),newKey);
		}	

	}

}
