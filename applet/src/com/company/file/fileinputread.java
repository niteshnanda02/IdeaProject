package com.company.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputread {
    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fin;
        try {
            fin=new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("usage: showFile File");
            return;
        }

        //read character
        do {
            i=fin.read();
            if (i!=-1)
                System.out.println((char)i);

        }while (i!=-1);
        fin.close();
    }
}
