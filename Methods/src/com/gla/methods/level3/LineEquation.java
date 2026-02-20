package com.gla.methods.level3;

import java.util.Scanner;

class LineEquation {

    public static double findDistance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] findLine(int x1,int y1,int x2,int y2) {
        double m = (double)(y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt(), y1=sc.nextInt();
        int x2=sc.nextInt(), y2=sc.nextInt();

        System.out.println("Distance: "+findDistance(x1,y1,x2,y2));
        double[] line=findLine(x1,y1,x2,y2);
        System.out.println("Equation: y = "+line[0]+"x + "+line[1]);
    }
}

