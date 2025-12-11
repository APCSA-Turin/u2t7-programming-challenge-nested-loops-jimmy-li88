package com.example.project;

public class NestedLoopsRunner {
    public static void main(String[] args) {
        String emptyBox = "";
        for (int i = 0; i < 5; i++){
            emptyBox += "*";
        }
        emptyBox += "\n";
        for (int j = 0; j < 5 - 2; j++ ){
            emptyBox += "*";
            for (int k = 0; k < 5 - 2; k++){
                emptyBox += (" ");
            }
            emptyBox += ("*\n");
        }
        if (5 > 1){
        for (int i = 0; i < 5; i++){
            emptyBox += "*";
        }
        }
        System.out.print(emptyBox) ;
    }
}
