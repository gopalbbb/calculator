package matrix;


public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3},
                {4,5,6}
        };
        int b[][]={
                {7,8},
                {9,10},
                {11,12}
        };

        //define array[2][2]
        int r[][]=new int[2][2];

        int sum=0;

//for number of row [2]
        for(int i=0;i<2;i++) {
            //number of column [2]
            for (int j = 0; j < 2; j++) {
                //for multiply
                for (int k = 0; k < 3; k++) {
                    //for multiple a and b
                    sum = sum + a[i][k] * b[k][j];
                }
                r[i][j] = sum;
                sum = 0;
            }
        }
       //for print using for loop
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(r[i][j]+" ");}
            System.out.println();
            }

        }


    }

