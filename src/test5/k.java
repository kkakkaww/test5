package test5;

public class k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		for(i=6;i<=10000;i++) {
			j=i/2;
			n=0;
			for(j=1;j<i;j++) {
				if(i%j==0) 
					n+=j;
			}
			if (n==i)
				System.out.println(n);
		}
	}

}
