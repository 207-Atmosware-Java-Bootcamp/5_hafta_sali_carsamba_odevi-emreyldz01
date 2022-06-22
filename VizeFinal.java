package myProject;

import java.util.Scanner;

public class VizeFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z =sc.nextInt();
		z = (z+sc.nextInt())/2;
		sc.close();
		if(z>83&&z<=100) 
		{
			System.out.println("AA");
		}
		else if(z>69&&z<83) 
		{
			System.out.println("BA");
		}
		else if (z>50 && z<69) 
		{
			System.out.println("BB");
		}
		else if(z==50) 
		{
			System.out.println("geçti");
		}
		else {System.out.println("kaldı");}
	}
	}


