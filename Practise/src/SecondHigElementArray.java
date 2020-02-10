
public class SecondHigElementArray
{
	public static void main(String[] args)
	{
		int arr[] = {2,45,5,6,1,13,121};
		int larg=0;
		int seclarg=0;
		for(int i:arr)
		{
				if(i>larg )
				{
					seclarg = larg;
					larg = i;
				}
				else
				{
					if(i>seclarg)
					{
						seclarg=i;
					}
				}
			
				
		}
//		System.out.println(larg);
		System.out.println(seclarg);
	}

}
