import java.util.Random;
import java.io.*;
import java.util.Scanner;

    class Dice{

	int number;
	int spot;

	
	Dice(int i){
	    number=i;
	}


	int shake(){
	    Random r=new Random();
	    spot=r.nextInt(6);
	    spot=spot+1;
	    return spot;
	}

    }

class DiceGame{


    public static void main (String[] args){


	System.out.println("What is your name?");
	System.out.print("> ");


	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
	
	
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	
        System.out.println("Hello, " + str + "!\n");	
	System.out.println("Rolling the dice...");

	Dice d1=new Dice(1);
	System.out.println("Die 1:"+d1.shake());

	Dice d2=new Dice(2);
	System.out.println("Die 2:"+d2.shake());

	int sum;
	sum=d1.spot+d2.spot;
	System.out.println("Total value: "+sum);

	if(sum>7){
	    System.out.println(str+" won!\n\n\n\n");}
	else {System.out.println(str+"lost.\n\n\n\n");}

	System.out.println("I will roll the dice until the total reaches 15\n");


	int sum1=0;
	int count=0;
	while(sum1<15){
	    count++;
	    Dice d3=new Dice(3);
	    sum1=sum1+d3.shake();
	    System.out.println("Die["+count+"] : "+d3.spot);
	    System.out.println("Sum is "+sum1);
	}
        System.out.println("\nI rolled the dice "+count+" times before exceeding 15.");
	
    }
}
