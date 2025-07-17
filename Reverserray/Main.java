public class Main
{
    public static void reversenumber(int arr[]){
        int first=0,last=arr.length-1;
        while(first<=last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
	public static void main(String[] args) {
		int arr []={2,4,6,8,10,12};
		reversenumber(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
// Reverse array ka aik or mehod bhi hota likn is method sai isliyai kiya kyu kai iska time complexity O(n/2) or O(n) and space complexity
// O(1) hai
//oonline gdbcompiler pai chalao