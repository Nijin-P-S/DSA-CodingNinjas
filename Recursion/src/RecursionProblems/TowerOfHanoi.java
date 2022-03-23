/*
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary).
The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
 */
package RecursionProblems;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if(disks<1)
        {
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println(source+" "+destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }
}
