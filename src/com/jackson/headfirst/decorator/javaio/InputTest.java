package com.jackson.headfirst.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        String path = "/Users/jackson/Desktop/Job/headfirst-design-pattern/src/com/jackson/headfirst/decorator/javaio/test.txt";
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream(path)
                                )
                            );
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
