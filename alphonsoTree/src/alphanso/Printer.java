package alphanso;

public class Printer {
	
	public static int height(Node node) {
		if(node == null) {
			return 0;
		}
		
		return Math.max(height(node.left), height(node.right))+1;
	}
	
	public static int getCol(int h) {
		if(h == 1) {
			return 1;
		}
		
		return 2*getCol(h-1)+1;
	}
	
	
	public static void printTreeNode(Node[][] grid, Node root, int col, int row, int height) {
		if( root == null) {
			return ;
		}
		
		grid[row][col] = root;
		
		 printTreeNode(grid, root.left, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
	        printTreeNode(grid, root.right, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
	}
	
	 public static void print(BinaryTree tree) {
	        int h = height(tree.root);
	        int col = getCol(h);
	        Node[][] grid = new Node[h][col];
	        printTreeNode(grid, tree.root, col / 2, 0, h);
	        for (int i = 0; i < h; i++) {
	            for (int j = 0; j < col; j++) {
	                if (grid[i][j] == null)
	                    System.out.print("  ");
	                else {
	                	
	       
	                	System.out.print(grid[i][j] + " ");
	                	
	                }
	                    
	            }
	            System.out.println();
	        }
	    }


}
