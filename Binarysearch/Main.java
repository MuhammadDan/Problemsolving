public class Main
{
    public static int BinarySearch(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6,7,8,9,10};
	    int key=25;
		System.out.println(BinarySearch(arr,key));
	}
}
// iski time complexity nikalnai kai lyai loop dekhtai hai 
// log2n
// gdb compiler mai chalana yai code