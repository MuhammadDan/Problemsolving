public class Main
{
    public static void Pairsnumber(int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int curr = i;
            for (int j=curr+1;j<arr.length;j++){
                System.out.print("("+arr[curr]+","+arr[j]+")"+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+count);
    }
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		Pairsnumber(arr);
	}
}
// is code ki time complexity O(nsquare) bcz of nested loop.
// gdbonline compiler