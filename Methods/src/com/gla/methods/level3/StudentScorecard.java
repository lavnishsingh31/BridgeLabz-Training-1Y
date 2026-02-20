package com.gla.methods.level3;

class StudentScorecard {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for(int i=0;i<students;i++)
            for(int j=0;j<3;j++)
                marks[i][j]=(int)(Math.random()*90)+10;
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] result=new double[marks.length][3];
        for(int i=0;i<marks.length;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(avg*100)/100.0;
            result[i][2]=Math.round(percent*100)/100.0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] marks=generateMarks(5);
        double[][] result=calculateResults(marks);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]
                    +"\t"+result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
        }
    }
}

