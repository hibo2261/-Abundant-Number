package com.bridgelabz;

import java.util.Scanner;
 public class AbundantNumber{

  public static void main(String[] args) {
   System.out.println("********************************************");
   System.out.println(" Welcome to  Abundant Number Program....");   //Printing Welcome Meassage
   System.out.println("********************************************");


   int i,sum = 0 , a ;
   System.out.println("Enter A Number --->"); // taking input from user
   Scanner sc = new Scanner(System.in); // creating a scanner object
   int num = sc.nextInt();
   for ( i =1 ; i < num ; i++)
   {
    if (num % i == 0)
    {
     sum = sum + i;
    }
   }
   if ( sum > num )
   {
    System.out.println(num+" Is A Abundant Number.");
    System.out.println ("And The Abundance Is = "+(sum-num));
   }
   else
   {
    System.out.println(num+" Is Not A Abundant Number.");
   }



   }
  }