package com.example.utlislibrary;

import android.content.Context;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


//注释掉的代码表示还没有测试过
public class FileUtils {


    /**
     * 获取assets下的文本内容
     *
     * @param c
     * @param fileName
     * @return
     */
    public static String getTextFromAssets(Context c, String fileName) {
        try {
            InputStreamReader inputReader = new InputStreamReader(c.getResources().getAssets().open(fileName));
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "";
            StringBuilder result = new StringBuilder();
            while ((line = bufReader.readLine()) != null)
                result.append(line + "\n");
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


//    public static void writeFile(String text, String fileName) {
//        try (OutputStream outputStream = new FileOutputStream(fileName);
//             Writer writer = new OutputStreamWriter(outputStream);
//             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
//            bufferedWriter.write(text);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    /**
//     * 文件复制
//     *
//     * @param oldFileName
//     * @param newFileName
//     */
//    public static void copyFile(String oldFileName, String newFileName) {
//        try (InputStream inputStream = new FileInputStream(oldFileName);
//             OutputStream outputStream = new FileOutputStream(newFileName)) {
//            byte[] bytes = new byte[1024];
//            int read;
//            while ((read = inputStream.read(bytes)) != -1) {
//                outputStream.write(bytes, 0, read);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
