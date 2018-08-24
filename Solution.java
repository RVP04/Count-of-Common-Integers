import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		    matrix[i][j]=sc.nextInt();
        
        int loop = n/2;
        ArrayList<Integer> topright = new ArrayList<Integer>();
        ArrayList<Integer> bottomleft = new ArrayList<Integer>();
        
        if(n%2==1)
        {
            for(int i=0;i<=loop;i++)
            for(int j=loop;j<n;j++)
                topright.add(matrix[i][j]);
    
            for(int i=loop;i<n;i++)
            for(int j=0;j<=loop;j++)
                bottomleft.add(matrix[i][j]);
        }
        else
        {
            for(int i=0;i<=loop-1;i++)
            for(int j=loop;j<n;j++)
                topright.add(matrix[i][j]);
                
            for(int i=loop;i<n;i++)
            for(int j=0;j<=loop-1;j++)
                bottomleft.add(matrix[i][j]);
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<topright.size();i++)
        {
            int temp = topright.get(i);
            for(int j=0;j<bottomleft.size();j++)
            {
                if(temp==bottomleft.get(j))
                    {
                        result.add(bottomleft.get(j));
                        bottomleft.set(j,-1);
                        break;
                    }
            }
        }
        System.out.print(result.size());
	}
}
