public class Test{
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 3, 34, 45};
        int z = sumofArray(a);
        System.out.println(z);

        int[] b = {3, 3, 3, 3, 3, 21, 1, 2, 33};
        sumofArray(b);

        
        String c = upperFun("   shivam  ");
        System.out.println(c);

        System.out.println(sum(3, 7));
        System.out.println(sum(1, 2, 3));


    }

// >>>>>>>>> method syntex >>>>>>>>>>>>>>
    // accessModifier returnType methodName(parameters){
    //     method body
    // }

    public static int sumofArray(int[] arr){
        int res = 0;
        for(int i=0; i < arr.length; i++){
            res += arr[i];
        }
        return res;
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase();

    }


    private static int sum(int x, int y){
        return x + y;
    }

    private static int sum(int x, int y, int z){ // method overloading
        return x + y;
    }


}