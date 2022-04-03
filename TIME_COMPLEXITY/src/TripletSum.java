/*
You have been given a random integer array/list(ARR) and a number X.
Find and return the triplet(s) in the array/list which sum to X.
 */

package TIME_COMPLEXITY.src;

import java.util.Arrays;

public class TripletSum {
    public static int tripletSum(int[] arr, int num){
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets=0;

        for(int i=0;i<n;i++){
            int pairSumFor = num-arr[i];
            int numPairs=pairSum(arr, (i+1), (n-1), pairSumFor);

            numTriplets+=numPairs;
        }
        return numTriplets;
    }

    private static int pairSum(int[] arr, int startIndex, int endIndex, int num){

        int numPair=0;

        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num)
                startIndex++;
            else if (arr[startIndex]+arr[endIndex]>num)
                endIndex--;
            else{
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];

                if(elementAtStart == elementAtEnd){
                    int totalElementsFromStartToEnd = (endIndex-startIndex)+1;
                    numPair+= (totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);

                    return numPair;
                }

                int tempStartIndex = startIndex+1;
                int tempEndIndex = endIndex-1;

                while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart)
                    tempStartIndex++;

                while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==elementAtEnd)
                    tempEndIndex--;

                int totalElementsFromStart = (tempStartIndex-startIndex);
                int totalElementsFromEnd = (endIndex-tempEndIndex);

                numPair+=(totalElementsFromStart*totalElementsFromEnd);

                startIndex =tempStartIndex;
                endIndex =tempEndIndex;

            }
        }

        return numPair;
    }
}
