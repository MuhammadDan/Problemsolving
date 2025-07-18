public class Main
{
    public static void Subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		Subarray(arr);
	}
}
// subarray means continious ho yani aik array ho 1,2,3,4,5 ager mai bolo 1,2,3 to yai subarray hoa likn 
// ager mai bolo 1,2,4 to yai subarray nahi hoa kyu kai 4 lagatar nahi ata pehlai 3 ata hai phir 4
// 2,3,4 -->subarray 3,4,5--->subarray 1,2,3--->subarray 

// Sum of each max aray
public class Main
{
    public static void subarray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
             for (int j=i;j<arr.length;j++){
                 int end=j;
                  for(int k=start;k<=end;k++){
                      System.out.print(arr[k]+" ");
                      sum =sum+arr[k];
                  }
                  System.out.println();
             }
             System.out.println();
             System.out.println("Total sum: "+sum);
             sum=0;
             System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        subarray(arr);
    }
}
// sum of each max array
public class Main
{
    public static void subarray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
             for (int j=i;j<arr.length;j++){
                 int end=j;
                  for(int k=start;k<=end;k++){
                      System.out.print(arr[k]+" ");
                  }
                  sum =sum+arr[j];
                  System.out.println();
             }
             System.out.println();
             System.out.println("Total sum: "+sum);
             sum=0;
             System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        subarray(arr);
    }
}
// compile in onlinegdb