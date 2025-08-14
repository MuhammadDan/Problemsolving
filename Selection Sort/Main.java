public class Main
{
    public static void  insertionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int prevalue = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[prevalue]>arr[j]){
                    prevalue = j;
                }
            }
            int temp = arr[prevalue];
            arr[prevalue] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		int arr[]={5,4,1,3,2};
		insertionsort(arr);
		printArr(arr);
	}
}
// time complexity: BigO(n^2)