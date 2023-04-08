import java.util.*;

public class DriverHeapSort{
	
	public static void main(String[] args) {

	//-------------------Insert Input---------------------------
	System.out.println("Ingresa tu arreglo[t]:");
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] input= new int[t];

    //Fills input
	for(int i=0; i<t; i++){
	    String s =sc.next();
	    input[i] =Integer.parseInt(s);
	}
	//----------------------------------------------------------
	MaxHeap myMaxHeap=new MaxHeap(input);
	int[] maxHeap1=myMaxHeap.getMaxHeap();

	//------------------MaxHeap Output--------------------------
	System.out.println("OUTPUT (MAX-HEAP): ");
	System.out.println(Arrays.toString(maxHeap1));
	//----------------------------------------------------------
	int[] finalSorted=new int[input.length];
	finalSorted=myMaxHeap.heapSort();

	//Final Output----------------------------------------------
	System.out.println("OUTPUT (SORTED ARRAY): ");
	System.out.println(Arrays.toString(finalSorted));
	}
}