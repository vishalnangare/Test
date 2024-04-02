package com;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int n = 6;
        int X = 13;
        int[] arr = {1, 4, 45, 6, 10, 8};

        // Sort the array
        Arrays.sort(arr);

        boolean found = false;

        // Iterate through all possible triplets
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == X) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    break;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No triplet found with sum " + X);
        }
    }
}
