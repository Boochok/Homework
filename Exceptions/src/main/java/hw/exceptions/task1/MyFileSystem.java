package hw.exceptions.task1;

import java.io.*;
import java.nio.charset.Charset;

public class MyFileSystem {

    private File file;

    public MyFileSystem(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void createFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("This file is already exist");
    }

    public void createDir() {
        if (!file.exists())
            file.mkdir();
    }

    public void lookThroughDir() {
        String[] content;
        if (file.isDirectory()) {
            content = file.list();
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }
    }

    public void writeToFile() {

        if(!file.exists())
            createFile();

        if(file.isFile()) {

            String data = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                data = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                try(BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(file, true), Charset.defaultCharset()))) {
                    writer.write(data + "\n");
                }
            } catch(FileNotFoundException ex){
                System.out.println(ex.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void readFile() {

        String src;
        try {
            try(BufferedReader br = new BufferedReader(new InputStreamReader(
                                               new FileInputStream(file), Charset.defaultCharset()))){

                while((src = br.readLine()) != null)
                    System.out.println(src);
            }
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        file.delete();
    }
}
