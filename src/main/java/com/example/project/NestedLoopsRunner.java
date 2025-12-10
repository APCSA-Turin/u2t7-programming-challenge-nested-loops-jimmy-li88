package com.example.project;

public class NestedLoopsRunner {
    public static void main(String[] args) {
        String orig = " ";
        String emptyBox = "";
        for (int i = 0; i < 9; i++){
            emptyBox += "*";
        }
        for (int j = 0; j < 5 - 3; j++ ){
            for (int k = 0; k < 5 - 3; k++){
                emptyBox += ("*" + "\n" + orig.repeat(7) + "*");
            }
        }
        for (int l = 0; l < 9; l++){
            emptyBox += "*";
        }
        System.out.print(emptyBox);
    }
}
