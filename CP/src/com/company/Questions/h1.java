package com.company.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class h1 {
    public static class student implements Comparable<student>{
        String name;
        int marks;
        int rollno;

        public student(String name,  int marks,int rollno) {
            this.name = name;
            this.marks = marks;
            this.rollno = rollno;
        }

        @Override
        public int compareTo(student student) {
            if(this.marks!=student.marks)
                return student.marks-this.marks;
            else if(this.name!=student.name)
                return this.name.compareTo(student.name);
            else
                return this.rollno-student.rollno;
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        student[] students=new student[t];
        for (int i = 0; i <t ; i++) {
            String l=reader.readLine();
            String[] a=l.split(",");
            students[i]=new student(a[0],Integer.parseInt(a[1].substring(1)),Integer.parseInt(a[2].substring(1)));
        }
        Arrays.sort(students);
        for (int i = 0; i <t ; i++) {
            System.out.println(students[i].marks+" "+students[i].name);
        }
    }
}
