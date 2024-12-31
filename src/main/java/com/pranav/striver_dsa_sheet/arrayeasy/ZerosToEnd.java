package com.pranav.striver_dsa_sheet.arrayeasy;

public class ZerosToEnd {
    public static void main(String[] args) {
        ZerosToEnd obj=new ZerosToEnd();

//        int[] arr={1,2,4,2,0,5,0,0,0,8,0,0,6,4,0};
        int[] arr={0,0,0,1,2,0,1,0,4,0};
        obj.moveZerosEnd(arr);
    }

    public void moveZerosEnd(int[] arr){
        int i=0;int n=arr.length;
        while(i<n && arr[i]!=0)i++;
        int j=i+1;
        while(j<n){
            while(j<n && arr[j]==0)j++;
            if(j<n){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
            }
            j+=1;
        }

        for(int k:arr){
            System.out.print(k);
        }
    }
}
