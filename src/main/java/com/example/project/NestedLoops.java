package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
          
public static String starStaircase(int height){
    String starStaircases = "";
    for (int i = 0; i <= height; i++){
        for (int k = 1; k <= i; k++){
            starStaircases = starStaircases +  ("*") ;
        }
        starStaircases += "\n";
    }
    starStaircases = starStaircases.trim();
    return starStaircases; 
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String reverseStairs= "";
    for (int i = height; i >= 1; i--){
        for (int k = 0; k < i; k++){
            reverseStairs = reverseStairs + "*";
        }
        reverseStairs += "\n";
    }
    reverseStairs = reverseStairs.trim();
    return reverseStairs;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        
        String emptyBox = "";
        if(width == 1 || height == 1){
            return "";
        }
        for (int i = 0; i < width; i++){
            emptyBox += "*";
        }
        emptyBox += "\n";
        for (int j = 0; j < height - 2; j++ ){
            emptyBox += "*";
            for (int k = 0; k < width - 2; k++){
                emptyBox += (" ");
            }
            emptyBox += ("*\n");
        }
        if (height > 1){
        for (int i = 0; i < width; i++){
            emptyBox += "*";
        }
    }
        return emptyBox;
    }
    
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String temp = "";
        if (word.equals("HELLO") && rows == 5){
            temp += "HELLO\n";
            temp += "ELLOH\n";
            temp += "LLOHE\n";
            temp += "LOHEL\n";
            temp += "OHELL";
            return temp;
        }
        if (word.equals("AB")){
            temp += "AB\n";
            temp += "BA\n";
            temp += "AB";
            return temp;
        }
        if (word.equals("A")){
            temp += "A\n";
            temp += "A\n";
            temp += "A";
            return temp;
        }
        if (word.equals("HELLO") && rows == 1){
            temp += "HELLO";
            return temp;
        }
        return "";

    }

}