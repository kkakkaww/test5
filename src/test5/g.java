package test5;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,count=0;
		for(year=101;year<=2100;year++) {
			if((year%4==0&&year%100!=0)||(year%400==0)) {
				count++;
				System.out.print(year);
				if(count%10==0) {
					System.out.print("\n");
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
		System.out.print(count);
	}

}
