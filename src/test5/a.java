package test5;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fare = 10000;
		double sum = 0;
		int i;
		fare = fare * Math.pow(1.05, 10);
		System.out.println(fare);
		for(i=0;i<4;i++) {
			sum+=fare;
			fare = fare*1.05;
		}
		System.out.println(sum);
	}

}
