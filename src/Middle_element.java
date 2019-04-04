
public class Middle_element {
	public static Optional<String> findMiddleElementFromHead1PassIteratively(Node head) {
	    if (head == null) {
	        return Optional.empty();
	    }
	 
	    Node slowPointer = head;
	    Node fastPointer = head;
	 
	    while (fastPointer.hasNext() && fastPointer.next().hasNext()) {
	        fastPointer = fastPointer.next().next();
	        slowPointer = slowPointer.next();
	    }
	 
	    return Optional.ofNullable(slowPointer.data());
	}
}
