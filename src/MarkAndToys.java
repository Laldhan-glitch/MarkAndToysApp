import java.util.Arrays;

//@author Laldhan
//This java application calculates the total number of toys you can buy given prices of the toys and the total budget
public class MarkAndToys {
    public static void main(String[] args) {
        //There are total of 6 toys which is shown in the following array
        int[] prices = {10, 12, 14, 3, 5, 6};
        //Your maximum budget is 30
        int maxBudget = 30;

        int result = maxNumberOfToysCalculator(prices, maxBudget);
        System.out.println(result);

    }

    public static int maxNumberOfToysCalculator(int[] prices, int maxBudget) {
        //use Java's sort function to arrange the price
        Arrays.sort(prices);
        int maxNumberOfToys = 0;
        //This loop will
        if (prices.length == 0 || maxBudget == 0) return maxNumberOfToys;
        //This loop will total the price from the smallest price and when the total price is greater than the budget the loop is terminated.
        for (int i = 0; i < prices.length; i++) {
            maxBudget -= prices[i];
            if (maxBudget < 0) return maxNumberOfToys;
            maxNumberOfToys++;
        }
        return maxNumberOfToys;
    }
}
