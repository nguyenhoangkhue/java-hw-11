package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        File file=new File("book.json");
        try{
            BufferedReader br= Files.newBufferedReader(file.toPath());
            String line=null;
            while (true){
                line=br.readLine();
                if (line==null){
                    break;
                }else {
                    System.out.println(line);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Nhập tên sách muốn tìm");
        String findTitle=sc.nextLine();
        try{
            BufferedReader br= Files.newBufferedReader(file.toPath());
            String line=null;
            while (true){
                line=br.readLine();
                if (findTitle.equalsIgnoreCase(line)){
                    System.out.println(line);
                }else {
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
