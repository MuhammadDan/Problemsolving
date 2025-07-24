public class Main
{
    public static int TappingRainwater(int building[]){
        int n = building.length;
        // calculate left maxarray
        int leftmax[] = new int[n];
        leftmax[0] = building[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(building[i], leftmax[i-1]);
        }
        // calculate right maxarray
        int rightmax[] = new int[n];
        rightmax[n-1] = building[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(building[i],rightmax[i+1]);
        }
        // loop
        int trapping = 0;
        for(int i=0;i<n;i++){
            // waterlevel = min(leftmax boundary,rightmax boundary)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
             // trapping water = waterlevel - height
            trapping +=waterlevel - building[i];
        }
        return trapping;
    }
	public static void main(String[] args) {
		int building[] = {4,2,0,6,3,2,5};
		System.out.println(TappingRainwater(building));
	}
}


// 