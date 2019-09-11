package learn;

import java.io.*;

/**
 * Created by Administrator on 2017/12/20.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        File txt = new File("E:/Download/f1.txt");
        FileOutputStream fos = new FileOutputStream(txt);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        BufferedWriter bw = new BufferedWriter(osw);

        printFiles(new File("F:\\BaiduNetdiskDownload\\Java语言学习"), 0, bw);

        bw.close();
        osw.close();
        fos.close();
        System.out.println("写入完成");
        System.exit(1);

        File file = new File("E:/Download/f.txt");
        if(file.exists()){
//            System.out.println("文件大小" + (float)file.length()/1000 + "kb");
//            System.out.println("文件可写" + file.canWrite());

            System.out.println(file.setReadable(true));
            System.out.println(file.setWritable(true));
            System.out.println("文件可读" + file.canRead());

//            System.out.println(file.isFile());
//            System.out.println(file.isDirectory());
//            File nameTo = new File("E:/Download/f1.txt");
//            file.renameTo(nameTo);
        }else{
            System.out.println("文件不存在");
            try {
                file.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //文件夹
//        File folder = new File("E:/Download/bin");
//        if(folder.exists()){
//            System.out.println("文件夹已存在！");
//        }else{
//            folder.mkdir();
//            System.out.println("文件夹创建成功！");
//        }

    }

    //遍历文件
    public static void printFiles(File dir, int tab, BufferedWriter bw) throws IOException {
        String str = "";
        if(dir.isDirectory()){

            File[] next = dir.listFiles();
            for (File f:next) {
                for (int i=0;i<tab;i++){
                    System.out.print("---");
                    bw.write("---");
                }
                System.out.println(f.getName());
                bw.write(f.getName() + "\n");
                if(f.isDirectory()){
                    printFiles(f, tab + 1, bw);
                }
            }

        }
    }
}
