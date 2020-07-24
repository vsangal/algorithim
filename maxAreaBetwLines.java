
public class maxAreaBetwLines {

	    public static void main(String[] argv) {
	    	int[] height = {1,8,6,2,5,4,8,3,7};
	    	int maxarea = 0;
	        
	    	for (int i = 0; i < height.length; i++)
	            for (int j = i + 1; j < height.length; j++) {
	            	maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
	            }
	        
	    	
	    }
}
