public class Main{
    public static void countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        countsort(arr);
    }
}

// counting sort wahn use hotai hai jin numbers ko hum sort karna chatai hai
// woh zyda barai nahi hotai hai.

Count Sort ek non-comparison based sorting algorithm hai jo tab best kaam karta hai jab tumhare paas limited range ke integer values hon. Chalo step-by-step samjhte hain Roman Urdu mein:

---

### 🧠 Count Sort ka Idea

Count Sort numbers ko directly unki frequency ke basis pe sort karta hai — yani har number kitni dafa aya hai, usko count karke final sorted array banata hai.

---

### 📊 Step-by-Step Breakdown

1. **Range Identify karo**  
   Sabse pehle array ka max aur min value find karo taake hum ek counting array bana saken.

2. **Counting Array banao**  
   Ek array banao jisme har index represent karega ek number, aur uski value hogi us number ki frequency.

3. **Count karo**  
   Original array ke har element ko dekho aur uski frequency counting array mein update karo.

4. **Cumulative Count (optional)**  
   Agar tum stable sort chahte ho (original order preserve ho same values ka), to cumulative count calculate karo.

5. **Sorted Array banao**  
   Counting array ke basis pe original array ko sorted form mein reconstruct karo.

---

### 🧪 Example

```javascript
let arr = [4, 2, 2, 8, 3, 3, 1];
```

1. Max value = 8  
2. Counting array size = 9 (0 se 8 tak)

```javascript
count = [0, 1, 2, 2, 1, 0, 0, 0, 1]
```

3. Ab sorted array banta hai:

```javascript
sorted = [1, 2, 2, 3, 3, 4, 8]
```

---

### ⚡️ Pros & Cons

**✅ Advantages:**
- Bahut fast hota hai jab range chhoti ho.
- Time complexity: **O(n + k)** (n = elements, k = range)

**❌ Disadvantages:**
- Sirf integers ke liye kaam karta hai.
- Agar range bohot badi ho to memory waste hoti hai.

---

Agar chaho to mein tumhare liye ek custom `countSort` function bhi likh sakta ho JavaScript mein, aur explain bhi kar sakta ho Roman Urdu mein. Bolo to shuru karun?
