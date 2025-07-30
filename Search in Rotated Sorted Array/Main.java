public class Main {
	public static int Searchin(int arr[],int target) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	} public static void main(String[] args) { 
// 		int arr[] = {4,5,6,7,0,1,2}; 
        int arr[] = {1};
        int target = 3;
        System.out.println(Searchin(arr,target));
    }
}
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


