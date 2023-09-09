package alphanso;

public class Painter {
	
	boolean flag = true;
	
	
	
	void travelBoundary(BinaryTree tree) {
		flag = true;
		
		Node root = tree.root;
		
		travelBoundaryLeft(root);
		travelLeaves(root);
		travelBoundaryRight(root);
		
		
	}
	
	

	private void travelBoundaryRight(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return;
		}
		
		if(node.right !=null) {
			travelBoundaryRight(node.right);
			if(node.ch == 'G') {
				if(flag) {
					node.ch = 'B';
				}else {
					node.ch = 'R';
				}
				flag = !flag;
			}
		}else if(node.left !=null) {
			travelBoundaryRight(node.left);
			if(node.ch == 'G') {
				if(flag) {
					node.ch = 'B';
				}else {
					node.ch = 'R';
				}
				flag = !flag;
			}
			
		}
		
	}

	private void travelLeaves(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		
		travelLeaves(node.left);
		
		if(node.left == null && node.right == null) {
			if(node.ch == 'G') {
				if(flag)
					node.ch = 'B';
				else
					node.ch = 'R';
				flag = !flag;
			}
			
		}
		
		travelLeaves(node.right);
			

	}

	private void travelBoundaryLeft(Node node) {
		// TODO Auto-generated method stub
		if(node == null){
			return ;
		}
		
		
		if(node.left!=null) {
			if(node.ch=='G') {
				if(flag)
					node.ch = 'B';
				else
					node.ch = 'R';
				
				flag = !flag;
			}
			
			travelBoundaryLeft(node.left);
		}else if(node.right !=null) {
			if(node.ch == 'G') {
				if(flag)
					node.ch = 'B';
				else
					node.ch = 'R';
				
				flag = !flag;
			}
			
			travelBoundaryRight(node.right);
		}
	}
	
	
	
}
