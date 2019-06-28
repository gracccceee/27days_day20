import java.io.File;

public class DiGuiDelete {
    //删除指定文件夹
    public static void main(String[] args) {
        File SrcFolder = new File("D:\\Career\\Java\\Demo");

        deleteFile(SrcFolder);
        }

    private static void deleteFile(File SrcFolder) {
        File[] fileArray = SrcFolder.listFiles();

        for(File file :fileArray){
            if(file.isDirectory()){
                deleteFile(file);
            }else{
                System.out.println(file.getName()+"---"+file.delete());
            }
        }

        System.out.println(SrcFolder.getName()+"---"+SrcFolder.delete());
    }
}