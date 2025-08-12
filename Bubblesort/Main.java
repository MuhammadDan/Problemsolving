public class Main
{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-turn-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i =0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		int arr[] = {5,4,1,3,2};
		bubblesort(arr);
	}
}
// time complexity O(n^2)