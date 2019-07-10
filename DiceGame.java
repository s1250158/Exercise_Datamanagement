import java.util.Random;
import java.io.*;

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
	    System.out.println(str+" won!");}
	else {System.out.println(str+"lost.");}
	
    }
}
