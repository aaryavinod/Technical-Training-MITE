package string;

public class Stringsort {
	public static void main(String args[])
	{
		String [] names = {"Sukuna","Itadori","Naruto","Tanjiro","Gojo"};
		for(int i=0;i<names.length-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareToIgnoreCase(names[j])>0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
	for(int i=0;i<names.length;i++)
		System.out.println(names[i]);
	}

}
