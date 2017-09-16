package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean numEnd = false;
        LinkedList<String> stringListL = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int mBehind = 0;

        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        scanner.nextLine();
        String stringL = scanner.nextLine();

        stringL = stringL + " N";

        for(int i = 0; i < stringL.length(); i++){
            if(numEnd){
                stringListL.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                numEnd = false;
            }

            char c = stringL.charAt(i);
            if(c == ' '){
                numEnd = true;
            }else{
                stringBuilder.append(c);
            }
        }

        if(0 < M && M <= stringListL.size()){
            int newIndexReference = stringListL.size() - M;

            System.out.println(stringListL.get(newIndexReference));
        }else{
            System.out.println("NIL");
        }
    }
}
