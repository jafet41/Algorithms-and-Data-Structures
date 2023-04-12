import java.util.*;

public class DriverBst{
	public static void main(String[] args) {
	//-------------------Insert Input---------------------------
	//System.out.println("Ingresa el tamaño N de tu Arbol y enseguida los nodos: ");
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();

    BinarySearchTree myTree=new BinarySearchTree();

  
    myTree.insert(myTree.getRoot(),49);
    myTree.insert(myTree.getRoot(),79);
    myTree.insert(myTree.getRoot(),46);
    myTree.insert(myTree.getRoot(),41);
    myTree.insert(myTree.getRoot(),64);
    myTree.insert(myTree.getRoot(),83);
    myTree.insert(myTree.getRoot(),833);
    myTree.insert(myTree.getRoot(),-10);
    myTree.insert(myTree.getRoot(),400);
    myTree.insert(myTree.getRoot(),-29);
    myTree.insert(myTree.getRoot(),0);
    myTree.insert(myTree.getRoot(),-999);
    myTree.insert(myTree.getRoot(),500);
    myTree.insert(myTree.getRoot(),250);


	System.out.println("-----------------------------In Order Traversal---------------------------------");
	myTree.inOrderTraversal( myTree.getRoot() );
	}
}