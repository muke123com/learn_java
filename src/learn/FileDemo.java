package learn;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/20.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:/Download/f.txt");
        if(file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }else{
            System.out.println("文件不存在");
            try {
                file.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
