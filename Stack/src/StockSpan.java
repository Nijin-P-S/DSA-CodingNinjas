/*
Afzal has been working with an organization called 'Money Traders' for the past few years.
The organization is into the money trading business. His manager assigned him a task.
For a given array/list of stock's prices for N days, find the stock's span for each day.
The span of the stock's price today is defined as the maximum number of consecutive days
(starting from today and going backwards) for which the price of the stock was less than today's price.
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85],
 then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
 */
import java.util.Stack;
package Stack.src;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        int result[] = new int[price.length];

        for(int i=0;i<price.length;i++){
            int span=1;
            if(stack.isEmpty()){
                stack.push(price[i]);
                result[i]=1;
            }
            else{
                while(!stack.isEmpty()){
                    int temp = stack.pop();
                    helper.push(temp);
                    if(temp>=price[i])
                        break;
                    else
                        span+=1;
                }
                while(!helper.isEmpty()){
                    stack.push(helper.pop());
                }
                result[i]=span;
                stack.push(price[i]);
            }
        }
        return result;
    }
}
