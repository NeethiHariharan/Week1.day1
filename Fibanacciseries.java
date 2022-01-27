package looppractice;

public class Fibanacciseries {


public static void main(String[] args) {
	int range=8,firstnum=0,secnum=1,sum;
	System.out.println(firstnum);
	
	for(int i=1;i<=range;i++)
	{
		sum=firstnum+secnum;
		//secnum=firstnum+secnum;
		firstnum=secnum;
		secnum=sum;
		System.out.println(sum);
		
	}
	
}
}

