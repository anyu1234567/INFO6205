package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UF_client {
    private static int count(int n) {
        Random random = new Random();
        UF_HWQUPC uf = new UF_HWQUPC(n);
        int i=0;
        while (uf.components()!=1){
            uf.connect(random.nextInt(n),random.nextInt(n));
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

        int[] ns = new int[]{1000,2000,3000,4000,5000};
        for(int n : ns){
            System.out.println("the number of object :"+n+" , the number of connections: "+count(n));
        }
    }


}
