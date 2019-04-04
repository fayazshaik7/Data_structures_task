
public class CycleDeletion {
	int HasCycle(Node head) {

	    if (head == null) {
	        return 0;
	    }
	    Node walker = head;
	    Node runner = head;
	    
	    while (runner.next != null) {
	        runner = runner.next;
	        if (runner.next == null) {
	            return 0;
	        } else {
	            runner = runner.next;
	        }
	        walker = walker.next;
	        
	        if (walker == runner) {
	            return 1;
	        }
	    }
	    return 0;
	}
}
