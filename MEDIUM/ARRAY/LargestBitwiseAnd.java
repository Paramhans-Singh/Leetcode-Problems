public class LargestBitwiseAnd {
    public int largestCombination(int[] candidates) {
        int[] bit=new int[32];
        for(int i=0;i<candidates.length;i++){
             int temp=31;
            while(candidates[i] > 0){
               bit[temp]+=candidates[i]&1; 
               candidates[i]=candidates[i]>>1;
               temp--;
            }
        }
        int max=0;
        for(int i=0;i<32;i++){
            max=Math.max(max,bit[i]);
        }
        return  max;
}
}