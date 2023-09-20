import java.io.*;


public class Text1 {
    public static void main(String[] args) throws IOException {
        float a = Text2.rate("D:\\RJGC\\data\\orig.txt","D:\\RJGC\\data\\orig_add.txt");
        //float a = repeatrate.rate("D:\\javatest\\test\\orig.txt","D:\\javatest\\test\\orig_0.8_add.txt");


        String atext = "D:\\RJGC\\data\\output.txt";
        System.out.println("答案文件：" + atext);
        System.out.println("查重率："+ a);
        File f = new File(atext);
        try {
            if(!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            fw.write("");
            fw.flush();
            fw.write(String.valueOf(a));
            fw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}