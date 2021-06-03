class Matrix{

    public static void main(String[] args) {
       // https://leetcode.com/problems/set-matrix-zeroes/

        //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        
        // setZeroesWithExtraSpace(matrix);
        setZeroesWithOutExtraSpace(matrix);
        
        int m = matrix.length;
        int n = (matrix.length != 0 ) ? matrix[0].length : 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            
    }

    
    public static void setZeroesWithExtraSpace(int[][] matrix) {
        //https://leetcode.com/problems/set-matrix-zeroes/
        //Apprach 1
        // Using additional space
        int m = matrix.length;
        int n = (matrix.length != 0 ) ? matrix[0].length : 0;
        boolean[] col = new boolean[m];
        boolean[] row = new boolean[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                  col[i] = true;
                  row[j] = true;
                }
            }
        }
        
       
        for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                if(  col[i] ||  row[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroesWithOutExtraSpace(int[][] matrix) {
        // //Apprach 2
        // Optimal Solution
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean  isCol = false;
        
        boolean  isRow = false;
        
        for(int i=0;i<m;i++){
            
            if(matrix[i][0] == 0) isCol = true;
                       
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(i == 0) isRow = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }
        
               
        if(isRow){
            for(int i=0;i<n;i++) matrix[0][i] = 0;
        }
        
        if(isCol){
            for(int i=0;i<m;i++) matrix[i][0] = 0;
        }
    }

    public static void print(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}