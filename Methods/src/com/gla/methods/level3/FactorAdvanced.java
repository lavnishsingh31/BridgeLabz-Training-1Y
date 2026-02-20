package com.gla.methods.level3;

class FactorsAdvanced {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                arr[index++] = i;

        return arr;
    }

    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int n : arr) p *= n;
        return p;
    }

    public static double cubeProduct(int[] arr) {
        double p = 1;
        for (int n : arr)
            p *= Math.pow(n, 3);
        return p;
    }
}
