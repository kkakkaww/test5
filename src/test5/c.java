package test5;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
        int i,j,k,l;
        for (i=0;i<=n;i++) {
        	for (j=4*i;j<=4*(n);j++) {
        		System.out.print(" ");
        	}
        	for (l=0;l<=i;l++) {
        		if(l<=3) {
        		System.out.print((int)Math.pow(2, l));
        		System.out.print(" ");
        		System.out.print(" ");
        		System.out.print(" ");
        		}
        		else if (l<7) {
        			System.out.print((int)Math.pow(2, l));
            		System.out.print(" ");
            		System.out.print(" ");
        		}
        		else {
        			System.out.print((int)Math.pow(2, l));
            		System.out.print(" ");
        		}
        	}
        	for (k=i-1;k>=0;k--) {
        		if(k<=3) {
            		System.out.print((int)Math.pow(2, k));
            		System.out.print(" ");
            		System.out.print(" ");
            		System.out.print(" ");
            		}
            		else if (k<7) {
            			System.out.print((int)Math.pow(2, k));
                		System.out.print(" ");
                		System.out.print(" ");
            		}
            		else {
            			System.out.print((int)Math.pow(2, k));
                		System.out.print(" ");
            		}
        	}
        	System.out.print("\n");
        }
	}

}
