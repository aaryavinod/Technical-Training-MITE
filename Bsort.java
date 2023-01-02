package array;

public class Bsort {

		public static void main(String args[]) {
			int ele[]= {12,23,65,24,775,785,43};
			for(int i=0;i<ele.length-1;i++)
			{
				for(int j=i+1;j<ele.length;j++)
				{
					if(ele[i]>ele[j])
					{
						ele[i]=(ele[i]+ele[j])-(ele[j]=ele[i]);
					}
				}
			}
			for(int i=0;i<ele.length;i++)
				System.out.println(ele[i]+"");
			

	}

}
