
public class Huffman {
	void decode(String S ,Node root)
	{
	    StringBuilder result = new StringBuilder("");
	    Node tempNode = root;
	    int index = 0;
	    while(index < S.length()){
	        char codedigit = S.charAt(index);
	        //System.out.println(codedigit);
	        if(codedigit == '0'){
	            if(tempNode.left == null){
	                tempNode = root;
	            }else{
	                tempNode = tempNode.left;
	                if(tempNode.data != '\0') result.append(tempNode.data);
	                index++;
	            }
	        }else{
	            if(tempNode.right == null){
	                tempNode = root;
	            }else{
	                tempNode = tempNode.right;
	                if(tempNode.data != '\0') result.append(tempNode.data);
	                index++;
	            }
	        }
	    }
	    System.out.println(result);
	}
}
