import java.util.*;
public class Main
{
    public static void largestnumber(int matrix[][],int n,int m){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest values of 2d matrix: "+largest);
    }
    public static void smallestnumber(int matrix[][],int n,int m){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(smallest>matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest values of 2d matrix: "+smallest);
    }
	public static void main(String[] args) {
		int matrix [][] = new int [3][3];
		int n = matrix.length, m=matrix[0].length;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		largestnumber(matrix,n,m);
		smallestnumber(matrix,n,m);
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
