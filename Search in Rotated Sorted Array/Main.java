// public class Main {
// 	public static int Searchin(int arr[],int target) {
// 		int n = arr.length;
// 		for(int i=0; i<n; i++) {
// 			if(arr[i]==target) {
// 				return i;
// 			}
// 		}
// 		return -1;
// 	} public static void main(String[] args) { 
// // 		int arr[] = {4,5,6,7,0,1,2}; 
//         int arr[] = {1};
//         int target = 3;
//         System.out.println(Searchin(arr,target));
//     }
// }
// ✅ Yes Muhammad, technically yeh code sahi hai — lekin ek important baat hai.
// Tumhara code bilkul theek tarah se target value ko linear search se array mein check karta hai. Aur agar mil jaye to uska index return karta hai — bilkul same expected behavior jaise problem demand karti hai.
// 🔍 Lekin LeetCode mein is problem ka original challenge ye hota hai ke:
// - Array sorted aur rotated hota hai
// - Aapko binary search ka use karke optimized solution likhna hota hai
// - Time complexity ideally O(log n) honi chahiye — jab ke tumhara code abhi O(n) hai
// 🧠 In short:
// - ✅ Tumhara current code conceptually correct hai
// - ⚠️ LeetCode standard ke according optimized nahi hai
// - ✅ Interview ke basic understanding ke liye fine hai
// - 🧪 But agar tum isay binary search based bana sako to zyada powerful impression hoga

//                                                 or

// Bilkul Muhammad! Ye raha LeetCode optimized solution for “Search in Rotated Sorted Array” using binary search — jo O(log n) complexity maintain karta hai:

public class Main{
    public static int Searchin(int nums[],int target){
        int left = 0, right=nums.length -1;
        while(left <= right){
            int mid = left+(right-left);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target < nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    } 
    public static void main(String[] args){
      int []nums = {4,5,6,7,0,1,2};
      int target = 6;
      System.out.println(Searchin(nums,target));
  }
}