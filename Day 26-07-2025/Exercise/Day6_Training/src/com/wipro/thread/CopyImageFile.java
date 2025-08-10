package com.wipro.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageFile {

    public static void main(String[] args) {

        String inputFileName = "C:\\Users\\DELL\\Downloads\\img.png";      // change path
        String outputFileName = "C:\\Users\\DELL\\Downloads\\lmgdemo";       // change path

        try {
            FileInputStream fi = new FileInputStream(inputFileName);
            FileOutputStream fo = new FileOutputStream(outputFileName);

            byte[] buffer = new byte[1024];
            int byteRead = 0;

            try {
                while ((byteRead = fi.read(buffer)) != -1) {
                    fo.write(buffer, 0, byteRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            fi.close();
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
