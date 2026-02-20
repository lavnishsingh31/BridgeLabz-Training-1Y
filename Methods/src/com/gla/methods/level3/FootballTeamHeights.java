package com.gla.methods.level3;

class FootballTeamHeights {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr)
            min = Math.min(min, n);
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            max = Math.max(max, n);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Shortest: " + findMin(heights));
        System.out.println("Tallest: " + findMax(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}

