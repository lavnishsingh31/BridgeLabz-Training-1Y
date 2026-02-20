package com.gla.methods.level3;

class MatrixAdvanced {

    public static double determinant2x2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    public static double[][] inverse2x2(double[][] m){
        double det=determinant2x2(m);
        double[][] inv=new double[2][2];
        inv[0][0]= m[1][1]/det;
        inv[0][1]=-m[0][1]/det;
        inv[1][0]=-m[1][0]/det;
        inv[1][1]= m[0][0]/det;
        return inv;
    }

    public static double[][] transpose(double[][] m){
        double[][] t=new double[m[0].length][m.length];
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i]=m[i][j];
        return t;
    }
}

