package main;

import java.util.LinkedList;
import java.util.List;

class main {
    public static void ex2( int x, int y){
        if (x < y) {
            System.out.println("x is lower than y");
        } else {
            System.out.println("y is lower than x");
        }
    }


    public static void ex1( int x, int y){
        if (x < y) {
            System.out.println("x is lower than y");
        }
        if (x > y) {
            System.out.println("y is lower than x");
        }
    }

    public static void ex3(int x, int y){
        switch(x-y)
        {
            case 3:
                System.out.println("Valoare y este: "+ y);
                break;
            case 9:
                 System.out.println("Valoare x este: "+ x);
                break;
            case -5:
                System.out.println("x+y este"+ x+y);
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }


    public static void main(String args[]) {
        /*ex2(10,15);
         ex1(10,15);
         ex3(10,15);*/

         Tema1.firstExercise( 10, "HEXAGON");
         Tema1.secondExercise(10,1,10,2);
         Tema1.thirdExercise("word");
         Tema1.fourthExercise();
         Tema1.fifthExercise("WOrD");
         Tema1.sixthExercise();
         Tema1.seventh(0);


    }
}