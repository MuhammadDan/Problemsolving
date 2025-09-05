//                                                               1st way
public class Main {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - 1 - i) { // to avoid double counting the center element in odd-sized matrices
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }
}
//                                                               2nd way
public class Main{
    public static void diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            sum+=matrix[i][matrix.length-1-i];
        }
        System.out.println("Diagonal sum is: "+sum);
    }
    public static void Main(String[] args){
        int matrix [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(matrix);
        }
    }
    //                                                              3rd way
public class Main{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int matrix [][]= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Diagonal sum is: "+diagonalSum(matrix));
        }
    }