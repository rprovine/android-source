package com.bloc.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bloc.test.Test;

public class Loops extends Object {

	public static void main(String [] args) {
		boolean[] someBools = {true, false, true, true, false, true, false, false};
		boolean temp = false;

		// Starts here
        int i = 0;
        int length = someBools.length - 1;

        while(i < length) {
            temp = someBools[length];
            someBools[length] = someBools[i];
            someBools[i] = temp;
            length--;
            i++;
        }

		// Ends here

		/*
		 * ASSIGNMENT:
		 * Replace the operations above with a while loop
		 */

		if (Test.testBools(someBools)) {
			System.out.print("Your booleans are in proper order!\n");
		} else {
			System.out.print("Something in the while loop…\n");
			System.exit(0);
		}

		int[] numArray = new int[someBools.length];
		// This is known as an in-line conditional
		// learn more here: http://www.cafeaulait.org/course/week2/43.html

		// Starts here
        for (int n = 0; n < someBools.length; n++) {
            numArray[n] = !someBools[n] ? 1 : 0;

        }

		// Ends here

		/*
		 * ASSIGNMENT:
		 * Replace the operations above with a for loop
		 */

		if (Test.testInts(numArray)) {
			System.out.print("And you nailed the number array!\n");
		} else {
			System.out.print("Issue with the numbers…\n");
		}
	}
}
