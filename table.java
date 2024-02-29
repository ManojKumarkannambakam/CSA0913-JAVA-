class nine extends Thread
{
	public void run()
	{	for(int i=1;i<=11;i++)
		{
			System.out.println(i+" x 9 = "+i*9);
		}
	}
}
class eleven extends Thread
{
	public void run()
	{	for(int i=1;i<=11;i++)
		{
			System.out.println(i+" x 11 = "+i*11);
		}
	}
}
class table
{
	public static void main(String arg[])
	{
		nine f=new nine();
		eleven  t=new eleven();
		f.start();
		t.start();
	}
}