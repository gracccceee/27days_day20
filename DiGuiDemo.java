public class DiGuiDemo {
    public static void main(String[] args) {
    //��a�Ľ׳�
        //1.дһ������ 2.�������� 3.����
        //���� ����ֵ���� long �����ѱ� int n
        //�������� if(n == 1){return 1}
        //���� if(n!=1){return n*��������n-1)}

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