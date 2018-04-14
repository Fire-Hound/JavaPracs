class Slip6b
{
    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3},{1,3,3},{1,3,3}};
        int [][] matrix2 = {{1,2,3},{1,3,3},{1,3,3}};
        int [][] matrix3 = new int [3][3];
        for(int row=0; row<3; row++)
        {
            for(int col=0; col<3; col++)
            {
                int sum=0;
                for(int k=0; k<3; k++)
                {
                    sum += matrix1[k][col] * matrix2[row][k];
                }
                matrix3[row][col] = sum;
            }
        }

        for(int row=0; row<3; row++)
        {
            for(int col=0; col<3; col++)
            {
                System.out.print(matrix3[row][col] + " ");
            }
            System.out.println();
        }
    }
}