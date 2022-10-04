public class ArryIndex {
    public static void main(String[] args) {
        int[]arry={1,2,3,4,5,6,-1};
        int target=5;
        int sum=0;
        for (int a=0;a<arry.length;a++){
            for (int b=a;b<arry.length;b++){
                sum=arry[a]+arry[b];
                if (sum==target){
                    System.out.println(a+","+b);
                }
            }
        }

    }
}
