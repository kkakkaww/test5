package test5;
import java.util.Scanner;
public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int n = input.nextInt();
        int i,total=0,d;
        String c;
        int a[]= {0,31,29,31,30,31,30,31,31,30,31,30};
        int b[]= {0,31,28,31,30,31,30,31,31,30,31,30};
        total=n;
        for(i=0;i<12;i++) {
        	if((y%4==0&&y%100!=0)||(y%400==0)) {
        	total+=a[i];
        	d=total%7;
        	if(d==0) c="Sunday";
        	else if (d==1)c="Monday";
        	else if (d==2) c="Tuesday";
        	else if (d==3) c="Wednesday";
        	else if (d==4) c="Thursday";
        	else if (d==5) c="Friday";
        	else c="Saturday";

        	if (i==0)System.out.println("January 1, "+y+" is "+c);	
        	else if(i==1) System.out.println("February 1, "+y+" is "+c);
        	else if(i==2) System.out.println("March 1, "+y+" is "+c);
        	else if(i==3) System.out.println("April 1, "+y+" is "+c);
        	else if(i==4) System.out.println("May 1, "+y+" is "+c);
        	else if(i==5) System.out.println("June 1, "+y+" is "+c);
        	else if(i==6) System.out.println("July 1, "+y+" is "+c);
        	else if(i==7) System.out.println("August 1, "+y+" is "+c);
        	else if(i==8) System.out.println("September 1, "+y+" is "+c);
        	else if(i==9) System.out.println("October 1, "+y+" is "+c);
        	else if(i==10) System.out.println("November 1, "+y+" is "+c);
        	else System.out.println("December 1, "+y+" is "+c);
        }
        	else {
        		total+=b[i];
            	d=total%7;
            	if(d==0) c="Sunday";
            	else if (d==1)c="Monday";
            	else if (d==2) c="Tuesday";
            	else if (d==3) c="Wednesday";
            	else if (d==4) c="Thursday";
            	else if (d==5) c="Friday";
            	else c="Saturday";

            	if (i==0)System.out.println("January 1, "+y+" is "+c);	
            	else if(i==1) System.out.println("February 1, "+y+" is "+c);
            	else if(i==2) System.out.println("March 1, "+y+" is "+c);
            	else if(i==3) System.out.println("April 1, "+y+" is "+c);
            	else if(i==4) System.out.println("May 1, "+y+" is "+c);
            	else if(i==5) System.out.println("June 1, "+y+" is "+c);
            	else if(i==6) System.out.println("July 1, "+y+" is "+c);
            	else if(i==7) System.out.println("August 1, "+y+" is "+c);
            	else if(i==8) System.out.println("September 1, "+y+" is "+c);
            	else if(i==9) System.out.println("October 1, "+y+" is "+c);
            	else if(i==10) System.out.println("November 1, "+y+" is "+c);
            	else System.out.println("December 1, "+y+" is "+c);
        	}
	}
	}
}
