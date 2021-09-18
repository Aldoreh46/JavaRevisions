package JavaRevisions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticIn {

static Scanner sc = new Scanner(System.in);

static int B = sc.nextInt();
static int H = sc.nextInt();
static boolean flag = (H > 0 && B > 0) ? true : false;

static{
    if(flag == false) System.out.println("java.lang.Exception: Breadth and height must be positive");
    if(-100 > B || B > 100 ) System.out.println("java.lang.Exception: Breadth and height must be positive");
    if(-100 > H || H > 100 ) System.out.println("java.lang.Exception: Breadth and height must be positive");
}
public static void main(String[] args){
	
    if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

