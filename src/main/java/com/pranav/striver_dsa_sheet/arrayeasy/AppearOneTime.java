package com.pranav.striver_dsa_sheet.arrayeasy;

public class AppearOneTime {
    public static void main(String[] args) {
        AppearOneTime obj=new AppearOneTime();
//        int[] a={6,1,4,2,1,5,2,6,4,1};
//        int[] a={4,1,2,1,2};
        int[] a={2,2,1};
        obj.AppearOneTime_bruteForce(a);
    }

    void AppearOneTime_bruteForce(int[] a){

        for(int i=0;i<a.length;i++){
            int count=0;
            if(a[i] != Integer.MIN_VALUE){
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        if(i!=j){
                            a[j]=Integer.MIN_VALUE;
                        }
                    }

                }
                if(count==1) {
                    System.out.println(a[i]);
                    break;
                }

            }
        }
    }

}
