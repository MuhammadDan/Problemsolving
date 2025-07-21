public class Main
{
    public static void Kadane(int arr[]){
        int MS = Integer.MIN_VALUE;
        int CS=0;
        for(int i=0;i<arr.length;i++){
            CS=CS+arr[i];
            if(CS<0){
                CS=0;
            }
            MS=Math.max(CS,MS);
        }
        System.out.println("The Max sum is: "+MS);
    }
	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		Kadane(arr);
	}
}