package com.pranav.striver_dsa_sheet.arraymedium;

public class MaxSubarraySum {
    public static void main(String[] args) {
        MaxSubarraySum obj=new MaxSubarraySum();
        int[] a={-2,1,-3,4,-1,2,1,-5,4};

//        obj.maxSubArray_bruteForce(a);

//        obj.maxSubArray_better(a);

        obj.maxSubArray_kadanes(a);

    }
    void maxSubArray_bruteForce(int[] a){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    void maxSubArray_better(int[] a){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    void maxSubArray_kadanes(int[] a){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            maxSum=Math.max(maxSum, sum);
            if(sum<0) sum=0;
        }
        System.out.println(maxSum);
    }
}
