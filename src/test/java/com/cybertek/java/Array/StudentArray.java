package com.cybertek.java.Array;

public class StudentArray {
    public static void main(String [] args){

        //String [] Student = {"1234","Meleha","Yousaf","B22","3476524528"};
        //String [] studnet = new String[] {"1234","Meleha","Yousaf","B22","3476524528"};
        String [] student = new String [5];
        student[0] = "1234";
        student[1] = "Meleha";
        student[2] = "Yousaf";
        student[3] = "B22";
        student [4] = "3476524528";
        System.out.println("id: "+student[0]);
        System.out.println("FirstName: "+student[1]);
        System.out.println("LastName: "+student[2]);
        System.out.println("Batch Number: "+student[3]);
        System.out.println("Phone Number: "+student[4]);
        System.out.println("Student Data Length: "+student.length);

        if(student.length==5){
            System.out.println("pass: Data Array has a correct length");
        }else{
            System.out.println("fail: Data Array has incorrect length");
        }

        // changing the first name and last name into the upper case
        System.out.print(student[1].toUpperCase()+" ");
        System.out.println(student[2].toUpperCase());


        System.out.println((student[1]+" "+student[2]).toUpperCase());

        String [] names ={"John","Adam","Don"};

        for (int i=0;i<names.length; i++){
            System.out.println("names : "+names[i]);
        }

        // for each loop
        int [] nums = {33,11,66};
        for (int each : nums){
            System.out.println(each);
        }
    }
}
