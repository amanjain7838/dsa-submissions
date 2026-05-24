class Solution {
    public static List<List<String>> solveNQueens(int n) {
        //your code goes here
        int[] upperDiagonal = new int[2*n-1];
        for(int i =0; i<upperDiagonal.length; i++)
            upperDiagonal[i]=0;
        int[] lowerDiagonal = new int[2*n-1];
        for(int i =0; i<lowerDiagonal.length; i++)
            lowerDiagonal[i]=0;
        int[] left = new int[n];

        List<List<String>> board = new ArrayList<List<String>>();
        for(int i =0; i<n; i++){
            List<String> row = new ArrayList<>();
            for(int j=0; j<n; j++){
                row.add(".");
            }
            board.add(row);
        }
        List<List<String>> answer = new ArrayList<List<String>>();

        solve(0, board, upperDiagonal, lowerDiagonal, left, answer, n);
        return answer;
    }

    public static void solve(int col,  List<List<String>> board, int[] upperDiagonal, int[] lowerDiagonal, int[] left,  List<List<String>> answer, int n){

        if(col == n){
            String[] str = new String[n];
            int i=0;
            for(List<String> row : board) {
                StringBuilder sb = new StringBuilder();
                for(String s : row){
                    sb.append(s);
                }
                str[i++]=sb.toString();
            }
            answer.add(Arrays.asList(str));
            return;
        }

        for(int row = 0; row<n; row++){
            if(left[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                board.get(row).set(col, "Q");
                left[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1, board, upperDiagonal, lowerDiagonal, left, answer, n);
                board.get(row).set(col, ".");
                left[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }

    }

}