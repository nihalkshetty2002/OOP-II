import java.util.Scanner;

class IntArr {
    int arr[], size, i, num;
    Scanner sc = new Scanner(System.in);

    IntArr() {
        size = 0;
        arr = new int[0];
    }

    IntArr(int s) {
        size = s;
        arr = new int[size];
        System.out.println("\nEnter array elements");
        for (i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    public void display() {
        System.out.println("\nArray contents are");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + "\t");
    }

    public void search() {
        int flag = 0;
        System.out.println("\nEnter element to search");
        num = sc.nextInt();
        for (i = 0; i < size; i++) {
            if (arr[i] == num) {
                flag = 1;
                System.out.println("Element found at position " + i);
                break;
            }
        }
        if (flag == 0)
            System.out.println("Element not found");
    }

    public void compare(IntArr a) {
        int flag = 1;
        if (size == a.size) {
            for (i = 0; i < size; i++) {
                if (arr[i] != a.arr[i]) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println("Both arrays are equal");
            else
                System.out.println("Both arrays are not equal");
        } else {
            System.out.println("Both arrays are not equal (different sizes)");
        }
    }
}

class Search {
    public static void main(String[] args) {
        int size1, size2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array 1 size");
        size1 = sc.nextInt();

        IntArr b1 = new IntArr(size1);
        b1.display();
        b1.search();

        System.out.println("\nEnter array size to compare");
        size2 = sc.nextInt();

        System.out.println("\nArray elements to compare");
        IntArr b2 = new IntArr(size2);
        b2.display();
        b1.compare(b2);
    }
}
