package com.cybertek.java.Array;

import java.util.Arrays;

public class MultiDArray {
    public static void main (String [] args){
        String [][] users = new String [3][2];
        users [0][0] = "Meleha";
        users [0][1] = "12345";
        users [1][0] = "Smantha";
        users [1][1] = "235323";
        users [2][0] = "Yousaf";
        users [2][1] = "password";
       // System.out.println(Arrays.toString(users));
        System.out.println(users[0][0]);
        System.out.println(users[0][1]);
        System.out.println(users[1][0]);
        System.out.println(users[1][1]);
        System.out.println(users[2][0]);
        System.out.println(users[2][1]);
// For multiDemensional Array we need to use DeeptoString
        System.out.println(Arrays.deepToString(users));
        String [][]Usersdata={{"Henray","HouseTab"},{"Sim","Capsule"},{"Mohtsham","Henrray45"}};
        System.out.println(Usersdata[0][0]);
        System.out.println(Usersdata[0][1]);
        System.out.println(Usersdata[1][0]);
        System.out.println(Usersdata[1][1]);
        System.out.println(Usersdata[2][0]);
        System.out.println(Usersdata[2][1]);
        System.out.println(Arrays.deepToString(Usersdata));

    }
}
