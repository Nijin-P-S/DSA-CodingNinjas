/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
using recursion.
 */

package RecursionProblems;

public class GeometricSum {
    public static double findGeometricSum(int k){
        // Write your code here
        if(k<1)
            return 1;
        double val = findGeometricSum(k-1);
        return 1/(Math.pow(2,k))+val;
    }
}
