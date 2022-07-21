
/*
  a
  b c
  d e f
  g h i j
*/public class Pattern4
{
	public static void main(String[] args)
	{int num=1;
	char ch='a';
		//for(int i=1;i<=4;i++)
			for(int line=1;line<=4;line++)
				
		{
			//for(int j=4;j>=i;j--)
			for(int space=line;space<=line;space++)
			{
				System.out.print(" ");
				
			}
			for(int n=1;n<=line;n++)
			{
				//System.out.print(" "+num++);
				System.out.print(" "+ch++);
			}
			
			//num++;
			System.out.println();
			
		}
	
	}
	
}
