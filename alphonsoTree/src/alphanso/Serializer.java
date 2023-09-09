package alphanso;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Serializer {
	
	 public static String serialize(BinaryTree tree)
	    {
		 Node root = tree.root;
	        if (root == null) {
	            return null;
	        }
	        Stack<Node> s = new Stack<>();
	        s.push(root);
	 
	        List<String> l = new ArrayList<>();
	        while (!s.isEmpty()) {
	            Node t = s.pop();
	 
	            // If current node is NULL, store marker
	            if (t == null) {
	                l.add("#");
	            }
	            else {
	 
	                // Else, store current node
	                // and recur for its children
	                l.add("" + t.val);
	                s.push(t.right);
	                s.push(t.left);
	            }
	        }
	        return String.join(",", l);
	    }

}
