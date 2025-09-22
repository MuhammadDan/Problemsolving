public class Main{
    public static boolean isPallendrome(String str){
        for (int i=0;i<str.length;i++){
            int n = str.length;
            if(str.charAt(i) !== str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void Main(String[] args){
        String str = "racecar";
        System.out.print(isPallendrome(str));
    }
}
// time complexity: O(n)