package q21_30;

import java.util.List;

//divide and conquer divide N tobe 2;
// btw, the linked list question, better create result=new ListNode(0); and return result.next()
public class q23 {

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }


	 public ListNode mergeKLists(List<ListNode> lists) {
	        int length = lists.size() ;

	        if(length == 0)
	            return null ;
	        if(length == 1){
	            return lists.get(0) ;
	        }

	        int mid = (length - 1)/2 ;
	        ListNode l1 = mergeKLists(lists.subList(0,mid + 1)) ;
	        ListNode l2 = mergeKLists(lists.subList(mid + 1,length)) ;

	        return mergeTowLists(l1,l2) ;

	    }

	    public ListNode mergeTowLists(ListNode l1 , ListNode l2){
	        ListNode result = new ListNode(0) ;
	        ListNode list = result ;
	        while(l1 != null && l2 != null){
	            if(l1.val < l2.val){
	                list.next = l1 ;
	                l1 = l1.next ;
	            }else{
	                list.next = l2 ;
	                l2 = l2.next ;
	            }
	            list = list.next ;
	        }

	        while(l1 != null){
	            list.next = l1 ;
	            l1 = l1.next ;
	            list = list.next ;
	        }

	        while(l2 != null){
	            list.next = l2 ;
	            l2 = l2.next ;
	            list = list.next ;
	        }

	        return result.next ;
	    }
}
