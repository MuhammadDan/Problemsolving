public class Main
{
    public static int BuyingAndSellStock(int price[]){
        int Maxprofit = 0;
        int buyingprice = Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(buyingprice < price[i]){
                int profit = price[i] - buyingprice;
                Maxprofit = Math.max(profit,Maxprofit);
            }else{
                buyingprice = price[i];
            }
        }
        return Maxprofit;
        
    }
	public static void main(String[] args) {
		int price[]={7,1,5,6,3,4};
		System.out.println(BuyingAndSellStock(price));
	}
}
// profit = sellingprice - buying price
// mujhai buying price ko minimum or selling price ko maximum karni ki koshish karni hai.
// mujhai check karna hai kai 