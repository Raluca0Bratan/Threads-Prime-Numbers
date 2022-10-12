package nrPrime;

public class MainMoreThreads {

   
	public static void main(String[] args) {
		int k=3,n=23;
		int q=n/k;
		int r=n%k;
	    Thread[] thread = new Thread[20];
		for(int i=1;i<=k;i++)
		{
			(new MyThread(i,(i-1)*q+r+1,i*q+r)).start();
		}
	}

}
