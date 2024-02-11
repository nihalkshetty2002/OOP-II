//Create a class called Stack with necessary fields and constructors. Use static methods for
//push and pop operations.
//Nihal kiran Shetty
//Regno: 230970065
//Date: 04-02-2024

import java.util.Scanner;
class stacks
{
	static int stack[]=new int[5];
	static int top=-1,max=5;

    stacks(){top=-1;}

	static boolean isFull()
	{
        return top==max-1;
	}

	static boolean isEmpty()
	{
			return top==-1;
	}

	static void push(int n)
	{
			if(isFull())
            {
					System.out.println("Overflow!");
            }else
            {
					stack[++top]=n;
            }
	}

	static int pop()
	{
			if(isEmpty())
            {
					System.out.println("Underflow!");
					return -1;
			}else
            {
					System.out.println("Popped element: "+stack[top]);
					return stack[top--];
		    }
	}

    static int peek()
    {
            if(isEmpty())
            {
                    System.out.println("Stack is empty.");
                    return -1;
            }else
            {
                    System.out.println("Top element: "+stack[top]);
                    return stack[top];
            }
    }

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int ele,ch;
        do{
                System.out.println("\n1.Push \n2.Pop \n3.Display \nEnter your choice:");
                ch=sc.nextInt();
                switch(ch)
                {
                        case 1:
                                System.out.println("Enter the element :");
                                ele=sc.nextInt();
                                stacks.push(ele);
                                break;
                        case 2:
                                stacks.pop();
                                break;

                        case 3: stacks.peek();
                                break;
                        
                        case 4: break;
                        default:
                                System.out.println("Invalid choice.");
                }
        }while(ch!=4);
	}
}
    