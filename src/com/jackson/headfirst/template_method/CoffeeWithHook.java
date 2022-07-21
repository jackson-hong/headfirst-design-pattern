package com.jackson.headfirst.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    protected void addCondiments() {
        System.out.println("adding cream");
    }

    @Override
    protected void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")) return true;
        return false;
    }

    private String getUserInput() {

        String answer = null;

        System.out.println("you want some cream?");

        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException e){
            System.err.println("IO error");
        }
        if(answer == null) return "no";
        return answer;
    }
}
