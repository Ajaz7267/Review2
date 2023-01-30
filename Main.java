package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<=100;i++){
            int count =0;
            for(int k=1;k<i;k++){
                if(i%k==0){
                    count=count+1;
                }
            }
            if(count<=2){
                System.out.print(" "+i);
            }

        }
    }
}
