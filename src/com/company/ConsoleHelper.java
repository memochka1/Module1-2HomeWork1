package com.company;

import com.company.ArrayHolder;

import java.util.Scanner;

//Maryna Burge
/*?????????? ??????????:
        - ???? ??????? ??????? int
        - ???? ????????? ???????
        - ???? ? ?????????? ?????????? ??? ???:
        - ????? ???? ?? ????????
        - ??????????*/
public class ConsoleHelper {
    private Scanner input = new Scanner(System.in);
    private ArrayHolder arrayHolder;

    public  void SetArrayCapacity()
    {
        System.out.println("Please enter capacity:");
        arrayHolder = new ArrayHolder(input.nextInt());
    }
    public  boolean CheckArrayHolderIsIntialized()
    {
        if(arrayHolder==null)
        {
            System.out.println("You must set array capacity first.");
        }
        return  arrayHolder!=null;

    }
    public void SetArrayValues() {
        if (CheckArrayHolderIsIntialized()) {
            int[] tempArray = new int[arrayHolder.getArray().length];
            for (int i = 0; i < arrayHolder.getArray().length; i++) {
                System.out.println("Set element: " + i);
                tempArray[i] = input.nextInt();
            }
            arrayHolder.setArray(tempArray);
        }
    }
    public void SearchArray()
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
    public  void PrintRawArray()
    {
        if (CheckArrayHolderIsIntialized()) {
            for (int x = 0; x < arrayHolder.getArray().length; x++) {
                System.out.println("Element [" + x + "]=" + arrayHolder.getArray()[x]);
            }
        }
    }
    public  void PrintSortedArray()
    {
        if (CheckArrayHolderIsIntialized()) {
            for (int x = 0; x < arrayHolder.getArray().length; x++) {
                System.out.println("Element [" + x + "]=" + arrayHolder.GetSortedArray()[x]);
            }
        }
    }
}
