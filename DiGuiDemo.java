public class DiGuiDemo {
    public static void main(String[] args) {
    //求a的阶乘
        //1.写一个方法 2.出口条件 3.规律
        //方法 返回值类型 long 参数裂变 int n
        //出口条件 if(n == 1){return 1}
        //规律 if(n!=1){return n*方法名（n-1)}

        System.out.println(jieCheng(5));
    }

    public static int jieCheng(int n){
        if(n == 1){
            return 1;
        }else{
            return n*jieCheng(n-1);
        }
    }

}