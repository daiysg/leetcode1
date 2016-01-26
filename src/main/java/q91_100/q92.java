package q91_100;

public class q92 {

	// three steps,
	//1. find m-1;
	// 2. from m to n reverse
	// 3. link together 
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	 
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	    
		if(m<1 || m>=n || head == null) return head;
	       
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    head = dummy;
	     
	    
	    for (int i=0; i<m-1; i++) {
	    	head = head.next;
	    }
	    
	 // reverse list from pre with length n-m+1  
	    // from 2->3->4 to 2<-3->4
	    ListNode pre = head.next;
	    ListNode cur = pre.next;
	    
	    for (int i=0; i<n-m; i++) {
	    	 ListNode temp = cur.next;
	         cur.next = pre;
	         pre = cur;
	         cur = temp;
	    }
	   
	    
	    // connect together 
	    head.next.next = cur;
        head.next = pre;
        head = dummy.next; // use dummy to get the head
        
        return head;
	 }
	 


}
