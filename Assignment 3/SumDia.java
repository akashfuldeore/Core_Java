import java.util.Scanner; 
class SumDia { 

static void DiagonalSum(int [][]mat, int n) 
{ 
		int principal = 0;
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
				if (i == j) 
					principal += mat[i][j]; 
	
			} 
		} 
	
		System.out.println("Sum of Diagonal:"+ principal); 
									
	} 

	
static public void main (String[] args) 
{ 
		
		int [][]a =  {{ 1, 2, 3 }, 
			      { 5, 6, 7 }, 
			      { 1, 2, 3 }}; 
					
		DiagonalSum(a, 3); 
} 
} 

