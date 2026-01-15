class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int zero[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    zero[i][j]=-1;
                }
            }
        }
    for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(zero[i][j]==-1){
                    for(int k=0;k<row;k++){
                        matrix[k][j]=0;
                    }
                    for(int l=0;l<column;l++){
                        matrix[i][l]=0;
                    }
                }
            }
        }    
       
    }
}