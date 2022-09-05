package test_file.copyfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    //cách 2 copy tất cả phần con bên trong
    public static void copyAll(File f1, File f2) {
        try {
            // Copy bản thân
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            // Copy các tập tin và thư mục con
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsoluteFile()+"\\"+file.getName());
                copyAll(file, file_new);
            }
        }
    }



    public static void main(String[] args) {
        File f0 = new File("D:\\Module2\\src\\test_file\\copyfile\\file_1.txt");
        File f1 = new File("D:\\Module2\\src\\test_file\\copyfile\\File_2.txt");
        File f2 = new File("D:\\Module2\\src\\test_file\\copyfile\\File_2xyz.txt");
        //1.Thay đổi tên tập tin hoặc thư mục
        //Sử dụng File để thay đổi tên
        f0.renameTo(f1);

        //Sử dụng Files để thay đổi tên
//        try {
//            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        // 2. Di chuyen file
//        File f_2new= new File("D:\\Module2\\src\\test_file\\copyfile\\f0\\File_2xyz.txt");
//        try {
//            Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        File folder_1 =  new File("/Users/mac/eclipse-workspace/Java_70/F1");
//        File folder_1new =  new File("/Users/mac/eclipse-workspace/Java_70/F0/F1");
//        try {
//            Files.move(folder_1.toPath(), folder_1new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            // TODO Auto-generated catc3h block
//            e.printStackTrace();
//        }
        // 3. Copy file cách 1 k copy phần con bên trong
        File f_0 = new File("D:\\Module2\\src\\test_file\\copyfile\\f0");
        File f_0_copy = new File("D:\\Module2\\src\\test_file\\copyfile\\F0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        CopyFile.copyAll(f_0, f_0_copy);
    }
}
