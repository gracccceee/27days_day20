import java.io.File;

public class DiGuiTest {
    //获取指定盘符目录下的所有。java文件
    public static void main(String[] args) {
        File srdFolder = new File("D:\\Career\\Java");

        getAllJavaFile(srdFolder);
    }

    private static void getAllJavaFile(File srdFolder) {
        //封装file数组存储文件或文件夹
        File[] fileArray = srdFolder.listFiles();
        //遍历
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
