package dsa.Array;

import java.util.Scanner;
class CramersRule{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x,y;
        int[][] coeeficientArr = new int[2][2];
        int[][] XArr = new int[2][2];
        int[][] YArr = new int[2][2];
        int[][] constantArr = new int[2][1];
        System.out.println("----------------------------------");
        System.out.println("Welcome to the Arena! We solve linear systems here");
        System.out.println("This solves an equation with 2 unknowns");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your "+ (i == 0 ? "first":"second") + " equation: ");
            System.out.println("Using this format: ax + by = c");
            System.out.println("Input a"+i +":");
            coeeficientArr[i][0] = input.nextInt();
            System.out.println("Input b"+i+":");
            coeeficientArr[i][1] = input.nextInt();
            System.out.println("Input c"+i+":");
            constantArr[i][0] = input.nextInt();
        }

        System.out.println("Coefficient array:");
        printArray(coeeficientArr);

        //Initialize XArr and YArr
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                XArr[i][j]= coeeficientArr[i][j];
                YArr[i][j]= coeeficientArr[i][j];
            }
        }
        
        XArr[0][0]= constantArr[0][0];
        XArr[1][0]=constantArr[1][0];
        
        YArr[0][1]= constantArr[0][0];
        YArr[1][1]=constantArr[1][0];
        
        System.out.println("X array:");
        printArray(XArr);

        System.out.println("Y array:");
        printArray(YArr);
        System.out.println(determinantOf2by2(XArr));
        System.out.println(determinantOf2by2(YArr));

        x = determinantOf2by2(XArr) / determinantOf2by2(coeeficientArr);
        y = determinantOf2by2(YArr) / determinantOf2by2(coeeficientArr);

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        input.close();
        System.out.println("----------------------------------");
    }

    public static int determinantOf2by2(int[][] arr){
        return (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
