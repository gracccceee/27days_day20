import java.io.File;

public class DiGuiTest {
    //��ȡָ���̷�Ŀ¼�µ����С�java�ļ�
    public static void main(String[] args) {
        File srdFolder = new File("D:\\Career\\Java");

        getAllJavaFile(srdFolder);
    }

    private static void getAllJavaFile(File srdFolder) {
        //��װfile����洢�ļ����ļ���
        File[] fileArray = srdFolder.listFiles();
        //����
        for(File file :fileArray){
            if(file.isDirectory()){
                getAllJavaFile(file);
            }else{
                if(file.getName().endsWith(".java")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
