//nihal 
//230970065
import java.util.*;
class box
{
	float width,height,depth;
	box()
	{
		width=height=depth=0;
	}

	box(float w,float h,float d)
	{
		width=w;
		height=h;
		depth=d;
	}

	public double volume()
	{
		return width*height*depth;
	}
	public static void main(String[] args)
				{

					Scanner sc=new Scanner(System.in);
					float w,h,d,weight;
					String color;
					do
					{
						System.out.println("Enter the Length,width,height,Weight and Color?");
						w=sc.nextFloat();
						h=sc.nextFloat();
						d=sc.nextFloat();
						weight=sc.nextFloat();
						color=sc.next();
						if(w<0||h<0||d<0||weight<0)
						{
							System.out.println("INVALID INPUT");
						}
					}while(w<0||h<0||d<0||weight<0);

						boxing b=new boxing(w,h,d,weight,color);
						b.display();

			}

}
		class boxing extends box
		{
			String color;
			float weight;
			boxing(float a, float b, float c , float wg, String col)
			{
				super(a,b,c);
				weight=wg;
				color=col;
			}
			public void display()
			{
				System.out.println("LENGTH:"+width);
				System.out.println("WIDTH:"+height);
				System.out.println("HEIGHT:"+depth);
				System.out.println("VOLUME ="+volume());
				System.out.println("WEIGHT ="+weight);
				System.out.println("COLOR ="+color);
			}

		}


