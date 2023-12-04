/**
 * SellandBuyStock
 */
public class SellandBuyStock {

    static int maxProfit(int[] a)
    {
        int maxprofit=0;
        int minsofar=a[0];
        for(int i=0;i<a.length;i++)
        {
            minsofar=Math.min(minsofar,a[i]);
            int profit=a[i]-minsofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int a[]={5,2,6,1,4};
        System.out.println(maxProfit(a));
    }
}