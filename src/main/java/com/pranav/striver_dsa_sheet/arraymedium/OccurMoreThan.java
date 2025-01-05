package com.pranav.striver_dsa_sheet.arraymedium;

public class OccurMoreThan {
    public static void main(String[] args) {
        OccurMoreThan obj=new OccurMoreThan();
//        int[] num={3,2,3};
        int[] num={2,2,1,1,1,2,2};
        obj.occur_bruteforce(num);
    }

    void occur_bruteforce(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!= Integer.MIN_VALUE){
                int count=0;
                for(int j=0;j<a.length;j++){
                    if(a[i] == a[j]){
                        count++;
                        if(i!=j){
                            a[j]=Integer.MIN_VALUE;
                        }
                    }
                }
                if(count>a.length/2){
                    System.out.println(a[i]);
                    return;
                }
            }
        }
    }
}
