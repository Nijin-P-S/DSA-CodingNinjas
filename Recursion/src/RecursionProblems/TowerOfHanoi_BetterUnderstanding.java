package RecursionProblems;

import java.util.Scanner;

public class TowerOfHanoi_BetterUnderstanding {

    public static void towerOfHanoi(int disks, char source, char helper, char destination){
        if(disks==1){
            System.out.println("Moved the "+disks+"th disk from "+source+" tp "+destination);
            return;
        }
        towerOfHanoi(disks-1, source, destination, helper);
        System.out.println("Moved the "+disks+"th disk from "+source+" to "+destination);
        towerOfHanoi(disks-1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }
}
