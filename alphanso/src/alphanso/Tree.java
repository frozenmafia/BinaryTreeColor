package alphanso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
    Node root;

	public static void print(Node node) {
		
		if(node == null) {
			System.out.println("This tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			int levelSize = queue.size();
			int hl = levelSize/2;
			for( int i = 0; i < levelSize; i++) {
				Node curr = queue.poll();
				
				if(curr !=null) {
					if(i==hl) {
						System.out.println(curr.ch+" ");
					}else {
						System.out.println("  ");
					}
					queue.offer(curr.left);
					queue.offer(curr.right);
				}else {
					System.out.println("  ");
					queue.offer(null);
					queue.offer(null);
				}
				
			}
		}
		System.out.println();
		
	}

}
