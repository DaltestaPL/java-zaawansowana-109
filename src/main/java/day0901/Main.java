package day0901;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        bufferedReader();
//        fileReader();
//        fileInputStream();
    }

    private static void bufferedReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");
        var bufferedReader = new BufferedReader(fileReader);
        var bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Hello!");

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            System.out.println(line);
        }
    }

    private static void fileReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");
        int i;
        while ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println((char) i);
        }
    }

    private static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output");
//        System.out.println(fileInputStream.available());
//        int i = fileInputStream.read();
//        int i1 = fileInputStream.read();
//        char c = (char) i;
//        char c1 = (char) i1;
//
//        System.out.println(c);
//        System.out.println(c1);
//        int i2 = fileInputStream.read();
//        System.out.println(i2);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
            System.out.println(i);
        }
    }
}
