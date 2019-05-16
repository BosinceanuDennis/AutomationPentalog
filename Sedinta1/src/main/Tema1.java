package main;

import org.jetbrains.annotations.NotNull;

public class Tema1 {

    public static void firstExercise(int distance, @NotNull String geometricForm)
    {
        if(geometricForm.toUpperCase() == "RECTANGLE" )
        {
            System.out.println("Perimeter of the rectangle is:" + 4*distance + "\n" + "Area of the rectangle is:" + distance*distance );
        }
        else if(geometricForm.toUpperCase() == "HEXAGON"){
            System.out.println("Perimeter of the hexagon is:" + 6*distance + "\n" + "Area of the hexagon is:" + ((3*Math.sqrt(3))/3)*(distance*distance));
        }
        else
        {
            System.out.println("Wrong geometricForm");
        }
    }


    public static double secondExercise(int xcoordonate1, int ycoordonate1, int xcoordonate2, int ycoordonate2)
    {
        System.out.println(Math.sqrt(((xcoordonate2 - xcoordonate1)^2) + ((ycoordonate2 - ycoordonate1)^2)));
        return Math.sqrt(((xcoordonate2 - xcoordonate1)^2) + ((ycoordonate2 - ycoordonate1)^2));
    }


    @NotNull
    public static String thirdExercise(String word)
    {
        StringBuilder reversedword = new StringBuilder();
        reversedword.append(word).reverse();

        System.out.println("The string in reversed form is: " + reversedword);

        return reversedword.toString();
    }


    public static void fourthExercise()
    {   int index;
        for(index = 1; index<100; index+=2)
        {
                System.out.println(index);
        }
    }


    @NotNull
    public static String fifthExercise(@NotNull String word)
    {
        System.out.println("word:" + word.toLowerCase());
        return word.toLowerCase();
    }


    public static void sixthExercise()
    {
        for (int index=1; index<=100; index++)
        {
            if( index%3 == 0 && index%5 == 0)
            {
                System.out.println(index + " fizz buzz");
            }
            else if(index%3 == 0)
                {
                    System.out.println(index + " buzz");
                }
            else if(index%5 == 0)
                {
                System.out.println(index + " fizz");
                }
        }
    }


    public static boolean seventh(int number)
    {
        long reversedNum = 0;
        long input_long = number;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        System.out.println("Number reverted: " +reversedNum);

        if(reversedNum == number && number >0) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }


}
