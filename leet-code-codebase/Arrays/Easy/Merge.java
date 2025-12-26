// Create merge class that merge two non-decreasing array 
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
	
	
        int [] result = new int [n+m];
        int index = 0;
        int i = 0;
        int j = 0;
		//check the smallest one and store it in result array
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                result[index++] = nums1[i];
                i++;
            }else{
                result[index++] = nums2[j];
                j++;
            }
        }

        while(i < m){
            result[index++] = nums1[i];
            i++;
        }
        while(j < n){
            result[index++] = nums2[j];
            j++;
        }
        for(int count = 0 ; count < result.length ; count++){
            nums1[count] = result[count];
        }        
    }
}