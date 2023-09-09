package alphanso;

 class Deserializer {
	 static int t;

	    public static BinaryTree deserialize(String data)
	    {
	        if (data == null)
	            return null;
	        t = 0;
	        String[] arr = data.split(",");
	        BinaryTree tree = new BinaryTree();
	        tree.root = helper(arr);
	        return tree;
	    }
	 
	    public static Node helper(String[] arr)
	    {
	        if (arr[t].equals("#"))
	            return null;
	 
	        Node root
	            = new Node(Integer.parseInt(arr[t]));
	        t++;
	        root.left = helper(arr);
	        t++;
	        root.right = helper(arr);
	        return root;
	    }
	    
	    
	    
	 
}
