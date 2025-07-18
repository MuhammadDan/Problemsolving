public class Main
{
    public static void Maxsubarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                
            }
            if(maxsum<=currsum){
            maxsum=currsum;
        }
        }
        System.out.println("The Maximum sum is: "+maxsum);
    }
	public static void main(String[] args) {
	    int arr[]={1,-2,6,-1,3};
	    Maxsubarray(arr);
	}
}

// iski time complexity O(n kipower 3) hai jo bhut bad hai likn yai sab sai easy solution tha is question ko solve karnai kai lyai
// is sawal ko solve karnai kai lyai aik or way hai prefix sum approach jis ki timecomplexity bhi behtar hogi.
