//Create Intersect that give the command element in both the array
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
	
        ArrayList<Integer> list = new ArrayList<Integer>();
         int[] frequency = new int[1001];
		 //Create the frequency array and assing the frequency count from array 1 and check in array 2 in loop 2
         for(int i = 0 ; i < nums1.length ; i++){
            frequency[nums1[i]]++;
         }
         for(int i = 0 ; i < nums2.length ; i++){
            if(frequency[nums2[i]] > 0 ){
                list.add(nums2[i]);
                frequency[nums2[i]]--;
            }
         }
         int[] result = new int[list.size()];
         int index = 0;
		 //arraylist to array
         for(int num : list){
            result[index++] = num;
         }
         
         return result;
    }
}