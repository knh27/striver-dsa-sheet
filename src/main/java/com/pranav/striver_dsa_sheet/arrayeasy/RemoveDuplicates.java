package com.pranav.striver_dsa_sheet.arrayeasy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates obj=new RemoveDuplicates();
        int[] arr={1,1,4,4,4,4,5,6,6,8};
//        int[] arr={1,4,5,6,8,9,66};
        obj.removeDuplicates(arr); 
    }

    public void removeDuplicates(int[] arr){
        int i=0; int j=1; int n=arr.length;
        while(j<n){
            if(arr[i]!=arr[j]){
                i+=1;
                arr[i]=arr[j];
            }
            j++;
        }
        System.out.println("new array:");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]);
        }
    }

}
