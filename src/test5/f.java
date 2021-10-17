package test5;

public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
        double e=1,a;
        for (i=10000;i<=100000;i+=10000) {
        	e=1;
        	a=1;
        	for(j=1;j<=i;j++) {
        		for(k=1;k<=j;k++) {
        			a=a*k;
        		}
        		e=e+1/a;
        	}
        	System.out.println(e);
        }
	}

}
