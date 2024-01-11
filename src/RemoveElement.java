public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        System.out.println(removeElement(arr,3));

    }

    public static  int removeElement(int[] nums, int val) {
        int[] b = new int[nums.length];

        int index=0;
        for (int i=0, k=0;i<=nums.length-1; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                k++;
                index++;
            }
        }

        return index;
    }
}
