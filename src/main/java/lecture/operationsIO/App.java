package lecture.operationsIO;

import java.io.IOException;

public class App {

    private final static String INPUT_PATH = "src/main/resources/input";
    private final static String OUTPUT_PATH = "src/main/resources/output";

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        String content = fileUtil.readFile(INPUT_PATH);
        System.out.println(content);
        fileUtil.writeFile(OUTPUT_PATH, content);
    }
}
