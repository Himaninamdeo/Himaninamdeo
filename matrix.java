import java .util.*;
public class  main  {
    
    public static void main(String[] args){
        int[][] board = {{1,2,2},{2,3,1},{3,3,2}};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0j<board.length;j++)
            {
                board[i][j]=i+j;
            }
        }
        System.out.println("another way to print array=\n");
        System.out.println(Arrays.deepToString(board));
    }
}
        
        
