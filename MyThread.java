package nrPrime;

public class MyThread extends Thread {
    
	private int a,b,index;
	public MyThread(int index,int a, int b)
	{
		this.index=index;
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		for(int i=this.a;i<=this.b;i++)
		{
			int d=2;
			int ok=1;
			while(d<=i/2)
			{
				if(i%d==0)
					{
					 ok=0;
					 break;
					}
					
				else
					d++;
			}
			if(ok==1)
			{
				System.out.println("Thread-ul cu indexul "+ this.index +" : " + i );
			}
				
		}
	}

}
