package by.academy.classwork.lesson13.task3;

import java.io.*;

public class CopyFile {
    private File path1;
    private File path2;

    public CopyFile(File path1, File path2) {
        this.path1 = path1;
        this.path2 = path2;
    }

    public File getPath1() {
        return path1;
    }

    public File getPath2() {
        return path2;
    }

    public void copyDataFile(){
        try(BufferedReader br= new BufferedReader(new FileReader(getPath1()));
            BufferedWriter bw = new BufferedWriter(new FileWriter(getPath2()))){

        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
