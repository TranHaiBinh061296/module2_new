package binaryfile_serialization.copy_file_binary;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile implements Serializable {
    public List<Object> readFile(String path) {
        List<Object> obj = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (List<Object>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void writeFile(String path, List obj) {
        ObjectOutputStream writer = null;
        try {
            FileOutputStream fos = new FileOutputStream(path);
            writer = new ObjectOutputStream(fos);
            writer.writeObject(obj);
            writer.close();
            fos.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) {
//        CopyFile copyFile = new CopyFile();

        String linkcop = "D:\\Module2\\src\\binaryfile_serialization\\copy_file_binary\\data\\hello1.txt";
        String linkParse = "D:\\Module2\\src\\binaryfile_serialization\\copy_file_binary\\data\\hello2.txt";

        File sourceFile =null;
        File destFile = null;

        sourceFile = new File(linkcop);
        try {
            destFile = new File(linkParse);
            if (!destFile.exists()) {
                FileWriter writer = new FileWriter(linkParse);
                // writer.flush();
                writer.close();
            }
        }catch (Exception e){
            e.getStackTrace() ;
        }

        destFile = new File(linkParse);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}