package unionElementarray;

public class UnionEliment {
    public static void main(String[] args) {
        //input number for array
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {4, 5, 6, 7, 8, 9};

        //define length of array (i=6 j=6)
        int i = a.length;
        int j = b.length;

        
        // take 2 variable  x and y (x and i for a, y and j for b)
        int x = 0, y = 0;
          //x<i and y < j that true

        while (x<i && y<j) {
            if (a[x] < b[y])
            {System.out.print(a[x]+" ");//
                x++;}

            else if (b[y] < a[x]) {
                System.out.print(b[y]+" ");
                y++;
            }
            else
            {
                System.out.print(b[y] + " ");
                x++;
                y++;
            }
        }
        while (x<i) {
            System.out.print(a[x] + " ");
            x++;
        }
        while (y<j) {
            System.out.print(b[y] + " ");
            y++;
        }
    }
}
