package org.UnitTest;

public class GradeNumber {
    public char gradeNumber(int num){
        if (num < 0 || num > 100){
            throw new IllegalArgumentException("Number can't be less than 0 or more han 100");
        }

        if (num < 33){
            return 'F';
        }

        if (num < 50){
            return 'D';
        }

        if (num < 60){
            return 'C';
        }

        if (num < 80){
            return 'B';
        }

        else{
            return 'A';
        }
    }
}
