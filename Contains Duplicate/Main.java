public class Main
{
    public static boolean Duplicatearr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int arr[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(Duplicatearr(arr));
	}
}

// Time complexity: Brute Force (O(n^2))