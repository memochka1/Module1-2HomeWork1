package com.company;

import java.util.Scanner;

//Maryna Burge
/*?????????? ??????????:
        - ???? ??????? ??????? int
        - ???? ????????? ???????
        - ???? ? ?????????? ?????????? ??? ???:
        - ????? ???? ?? ????????
        - ??????????*/
public class ApplicationRunner
{
    private Scanner input = new Scanner(System.in);
    private  ConsoleHelper consoleHelper=new ConsoleHelper();
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
                    consoleHelper.SetArrayCapacity();
                    break;
                case "1":
                    consoleHelper.SetArrayValues();
                    break;
                case "2":
                    consoleHelper.SearchArray();
                    break;
                case "3":
                    consoleHelper.PrintRawArray();
                    break;
                case "4":
                    consoleHelper.PrintSortedArray();
                    break;

            }
        }
}
