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
        for (int i = 0; i < width; i++){
            emptyBox += "*";
        }
        for (int j = 0; j < height - 3; j++ ){
            for (int k = 0; k < height - 3; k++){
                emptyBox += ("*");
            }
        }
        for (int l = 0; l < width; l++){
            emptyBox += "*";
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
        return "";
    }

}