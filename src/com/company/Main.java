//Maryna Burge
/*Консольное приложение:
        - ввод размера массива int
        - ввод элементов массива
        - меню с возможными операциями над ним:
        - поиск чила по значению
        - сортировка*/
package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ConsoleHelper helper = new ConsoleHelper();
        while (!helper.DisplayMenu()) {
        }
        System.out.println("Program Exited ");

    }
}

class ArrayHolder {

    private int[] mArray;

    public ArrayHolder(int capacity) {
        mArray = new int[capacity];
    }

    public int[] getArray() {
        return mArray;
    }

    public void setArray(int[] pArray) {

        mArray = pArray;
    }
    public int IndexOf(int value)
    {
        int elementLocation=-1;
        for(int x=0;x<mArray.length;x++)
        {
            if(mArray[x]==value)
            {
                elementLocation=x;
            }

        }
        return  elementLocation;

    }
    public  int[] GetSortedArray()
    {
        int[] tempArray=mArray;
        Arrays.sort(tempArray);
        return tempArray;
    }


}

class ConsoleHelper {
    private Scanner input = new Scanner(System.in);
    private ArrayHolder arrayHolder;

    public boolean DisplayMenu() {
        String doExit = "";
        System.out.println("Type in choice");
        System.out.println("0 set array capacity");
        System.out.println("1 to set array values");
        System.out.println("2 to search array");
        System.out.println("3 print the array (Raw)");
        System.out.println("4 print the array (Sorted)");
        System.out.println("q to quit");
        doExit = input.next();
        ProcessUserInput(doExit);
        return doExit.equals("q");
    }

    private String GetUserInput() {
        return input.next();

    }

    private void ProcessUserInput(String menuChoice) {
        switch (menuChoice) {
            case "0":
                System.out.println("Please enter capacity:");
                arrayHolder = new ArrayHolder(input.nextInt());
                break;
            case "1":
                SetArrayValues();
                break;
            case "2":
                SearchArray();
                break;
            case "3":
                PrintRawArray();
                break;
            case "4":
                PrintSortedArray();
                break;

        }
    }
    private  boolean CheckArrayHolderIsIntialized()
    {
        if(arrayHolder==null)
        {
            System.out.println("You must set array capacity first.");
        }
        return  arrayHolder!=null;

    }
    private void SetArrayValues() {
        if (CheckArrayHolderIsIntialized()) {
            int[] tempArray = new int[arrayHolder.getArray().length];
            for (int i = 0; i < arrayHolder.getArray().length; i++) {
                System.out.println("Set element: " + i);
                tempArray[i] = input.nextInt();
            }
            arrayHolder.setArray(tempArray);
        }
    }
    private  void SearchArray()
    {
        if (CheckArrayHolderIsIntialized()) {
            System.out.println("Enter Value To Search:");
            int searchValue = input.nextInt();
            int searchLocation = arrayHolder.IndexOf(searchValue);
            if (searchLocation == -1) {
                System.out.println("Value " + searchValue + " not found");
            } else {
                System.out.println("Value exists at " + searchLocation + " element.");
            }
        }
    }
    private  void PrintRawArray()
    {
        if (CheckArrayHolderIsIntialized()) {
            for (int x = 0; x < arrayHolder.getArray().length; x++) {
                System.out.println("Element [" + x + "]=" + arrayHolder.getArray()[x]);
            }
        }
    }
    private  void PrintSortedArray()
    {
        if (CheckArrayHolderIsIntialized()) {
            for (int x = 0; x < arrayHolder.getArray().length; x++) {
                System.out.println("Element [" + x + "]=" + arrayHolder.GetSortedArray()[x]);
            }
        }
    }
}













