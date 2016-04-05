package RelevantKnowledge;

public class BinarySearch {

	public static void main(String[] args) {
		int key = 33;
		int[] arr = {1,22,33,44,88,90,180,200,300};
		BinarySearch bs = new BinarySearch();
		int result = bs.BinarySearchFunction(key, arr);
        System.out.println(result);
	}
	//create a function use binary search and return a Integer 
	public int BinarySearchFunction(int key,int[] arr){
		
		int end = arr.length;
		int begin = 0;
		int mid = (int)((end+begin)/2);
		/*
		if(arr[mid]>key){
			end = (int)(end/2);
			mid = (int)((end+begin)/2);
		}
		if(arr[mid]<key){
			begin = mid;
			mid = (int)((end+begin)/2);
		}*/
		//do this until arr[mid] = key
		
		if(arr[mid]==key){
			return mid;
		}else if(arr[mid]>key){
			do{
				
			}while(arr[mid]!=key);
		}else if(arr[mid]<key){
			do{
				
			}while(arr[mid]!=key);
		}
		
		
			
		
		
		
		
		return mid;
	}

}
