package com.wipro.datetime;
 
import java.time.LocalDate;
import java.util.Scanner;
 
public class Difference {
 
    public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
    	
        if (dt1.isAfter(dt2)) { // 2024-12-25 and 2025-01-06
            LocalDate temp = dt1;
            dt1 = dt2;
            dt2 = temp;
        }
 
        int years = dt2.getYear() - dt1.getYear();//1
        int months = dt2.getMonthValue() - dt1.getMonthValue();//01-12=-11
        int days = dt2.getDayOfMonth() - dt1.getDayOfMonth();//06-25=-19
 
       
        if (days < 0) {//-19<0
            months--;//-11-1=-12
            LocalDate previousMonth = dt2.minusMonths(1);
            days += previousMonth.lengthOfMonth();//day=day+31 -19+31 = 12days
        }
 
        
        if (months < 0) { //-<0
            years--; //1-- =0
            months += 12;//months =months+12 = -12+12=0
        }
 
        System.out.println("Difference is " + years + " years, " + months + " months, " + days + " days.");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate dt1 = LocalDate.parse(sc.nextLine());
 
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate dt2 = LocalDate.parse(sc.nextLine());
 
        getDateDiff(dt1, dt2);
 
        sc.close();
    }
}
 