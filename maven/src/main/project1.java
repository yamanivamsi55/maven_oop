package project;

public class project1 {
	public static void main(String args[])
	{
		Sweets s1=new Sweets("laddu",11);
		Sweets s2=new Sweets("kovva",10);
		Sweets s3=new Sweets("barfi",12);
		System.out.println("sweets are: "+s1.name+" "+s2.name+" "+s3.name);
	}
	public String display(Candies c[],int l,int m)
	{String s="";
		for(int i=0;i<5;i++)
		{
			if(c[i].weight>=l&& c[i].weight<=m)
			{
			s=s+c[i].name+" ";
			
			}
		}
		return s;
	}

}
