class Sample05
{
	public static void main(String[] args) 
	{
		String s1="C$j!s/$sit@So&lu*tions";
		char[] ch = s1.toCharArray();
		for (int i=0;i<ch.length;i++ )
		{
			//System.out.print(ch[i]);
			if (ch[i]>='A'&& ch[i]<='Z')
			{
               System.out.print(ch[i]);
			}
			if (ch[i]>='a'&& ch[i]<='z'){
				System.out.print(ch[i]);
			}
		}
	}
}
