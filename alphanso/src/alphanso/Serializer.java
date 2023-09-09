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
	 
	         
	            if (t == null) {
	                l.add("#");
	            }
	            else {
	 
	              
	                l.add("" + t.val);
	                s.push(t.right);
	                s.push(t.left);
	            }
	        }
	        return String.join(",", l);
	    }

}
