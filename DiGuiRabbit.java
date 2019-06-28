public class DiGuiRabbit {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
//        arr[2] = arr[0]+arr[1];
//        arr[19] = arr[18]+arr[17];
        //方式1 数组
        for(int x=2;x<arr.length;x++){
            arr[x] = arr[x-1]+arr[x-2];
        }
        System.out.println(arr[19]);

        System.out.println("---------------");

        //方式2 变量的变化实现
        int a = 1;
        int b = 1;
        for(int x =0;x<18;x++){
            int temp = a;
            a =  b;
            b = temp+a;
        }
        System.out.println(b);
        System.out.println("---------------");

        System.out.println(Digui(20));
    }
    //方式3 递归实现
    public static int Digui(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return Digui(n-1)+Digui(n-2);
        }
    }
}
