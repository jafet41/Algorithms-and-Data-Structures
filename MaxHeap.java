public class MaxHeap {
	private final int[] maxHeap;

	public MaxHeap(int[] input){
		this.maxHeap=buildMaxHeap(input);
	}

	public int[] getMaxHeap(){
		return this.maxHeap;
	}
	//---------------------------------Build MaxHeap Method----------------------------------------
	public int[] buildMaxHeap(int[] array){
		int len=array.length;
		int[] maxHeap= new int[len];
		int half=(int)(len/2);
		half-=1;
		for(int i=half; i>=0; i--){
			maxHeap=MaxHeap.maxHeapify(array, i, len);
		}
		return maxHeap;
	}
	//----------------------------------Max-Heapify Method-----------------------------------------
	public static int[] maxHeapify(int[] array,int  i, int len){
		int left=2*i+1;
		int right=2*i+2;

		//Base case => reaching a leaf
		if (left>len || right>len) return array;

		//Get largest
		int largest=i;
		if (left<	len && array[left]>array[i]) largest=left;
		else largest=i;
		if (right<len && array[right]>array[largest]) largest=right;
		
		//Check for later swap
		if (largest!=i){
			//Swap
			int tmp= array[largest];
			array[largest]=array[i];
			array[i]=tmp;
			//Recursion
			MaxHeap.maxHeapify(array,largest,len);
		}
		return array;
	}
	//---------------------------------------------------------------------------------------------
	//---------------------------------------HeapSort----------------------------------------------
	//---------------------------------------------------------------------------------------------
	public int[] heapSort(){

		//Use own Max-Heap
		int len=getMaxHeap().length;		
		int[] sorted=new int[len];
		sorted=getMaxHeap();

		while( len>0 ){
			//Get Max Element
			int tmp=sorted[0];
			//Swap
			sorted[0]=sorted[len-1];
			sorted[len-1]=tmp;
			//Discard nth element
			len--;
			//Correct Max Heap property
			sorted=MaxHeap.maxHeapify(sorted, 0, len);
		}
		return sorted;
	}
}