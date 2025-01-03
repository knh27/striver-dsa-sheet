package com.pranav.striver_dsa_sheet.arrayeasy;

public class LongestSubArrayPosSum {
    public static void main(String[] args) {
        int[]a={9,1,2,3,5,1,9};
        int sum=10, result=3;
        LongestSubArrayPosSum obj=new LongestSubArrayPosSum();
//        obj.longestSubArray1(a);
        obj.longestSubArray2(a,sum);
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

    void longestSubArray2(int[] a, int k){
        int max=0;int j;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                }
            }


        }
        System.out.println(max);
    }
}

//