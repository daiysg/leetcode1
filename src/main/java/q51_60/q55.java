package q51_60;

public class q55 {

// quick solution, check every step can reach fast, if cannot reach return 0	
public boolean canJump(int[] nums) {
        
		//int curCheck = 0;
		int maxToGo = 0;	
	
		for (int i=0; i <nums.length; i++){		
			if (maxToGo >= nums.length-1) return true;						
			
			if (maxToGo < i ) {
				return false;
			}
			
			 if (maxToGo < i+nums[i] ) {
				 maxToGo = i+nums[i];
			 }
		}
		
		
		if (maxToGo > nums.length-1) return true;	
		else return false;
		
    } 
}
