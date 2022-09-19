public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {

        int length = nums.length/2;
        int positive []= new int[length];
        int negative[]= new int [length];
        int k=0;
        int j=0;
for (int  i=0;i<nums.length;i++){
    if (nums[i]>0){
        positive[k]=nums[i];
        k++;
    }
    else {
        negative[j]=nums[i];
        j++;
    }
}
k=0;
j=0;
int i=0;
while (i<nums.length){
nums[i]=positive[k];
k++;
nums[i+1]=negative[j];
j++;
i+=2;
}

return nums;
}
}