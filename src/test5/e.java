package test5;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        double pi=0;
        for (i=10000;i<=100000;i+=10000) {
        	pi=0;
        	for(j=1;j<=i;j++) {
        		pi+=Math.pow(-1, j+1)/(2*j-1);
        	}
        	System.out.println(4*pi);
        }
	}

}
