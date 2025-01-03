package com.pranav.striver_dsa_sheet.arrayeasy;

public class LongestSubArrayPosSum {
    public static void main(String[] args) {
        int[]a={2,3,5,1,9};
        int sum=10, result=3;
        LongestSubArrayPosSum obj=new LongestSubArrayPosSum();
        obj.longestSubArray1(a);
    }


    void longestSubArray1(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                if(sum==10){
                    if(max<(j-i+1)) max=j-i+1;
                }
            }
        }
        System.out.println(max);
    }
}
