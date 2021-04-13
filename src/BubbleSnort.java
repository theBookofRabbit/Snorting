public class BubbleSnort {

    public static void main(String[] args) {
//        int[] nums = new int[length];//int不能超过10位,1000000000是十亿，9个0，10位数；但是十亿会超出java的栈内存（1MB），所以要么放在堆里new，要么改为一亿。
        final  int length =  1000;//十万时已经达到3秒才能出结果
        int[] nums = new int[length];
        for(int i = 0; i < length; i++){
            nums[i] = length - i;
        }
        System.out.println("===============排序前====================");
        for(int i = 0; i < length; i++){
            System.out.print(nums[i]+"  ");
        }
        for(int i = 0;i+1 < length;i++){
            for(int j = 0;j+1 < length;j++){
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        System.out.println("\n===============排序后===================");
        for(int i = 0; i < length; i++){
            System.out.print(nums[i]+"  ");
        }
    }
    static void swap(int[] nums, int left, int right){
        int swap = nums[left];
        nums[left] = nums[right];
        nums[right] = swap;
    }
}
