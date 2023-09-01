package utilities;

import java.io.*;
import java.util.HashMap;

public class FindAndReplace {

    String regEx = " ";
    String filePath = "";
    String fileName = "interior01.txt";
    HashMap<String, String> replacementMap = new HashMap<>();

    int linesQty = 0;
    String[] values;
    String newValue;
    String newLine;

    public static void main(String[] args) {

        FindAndReplace instance = new FindAndReplace();
        instance.findAndReplace();

    }
    public void setReadLines() {
        values = new String[linesQty];

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath + fileName));
            for (int i = 0; i < values.length; i++) {
                values[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void findAndReplace() {
        sumLinesQty();
        setReplacementMap();
        setReadLines();

        writeValues();
    }

    public void sumLinesQty() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath + fileName));
            String line;

            while ((line = br.readLine()) != null) {
                linesQty++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setReplacementMap() {
        replacementMap.put("41", "58");
        replacementMap.put("43", "44");
    }

    public void writeValues() {

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(filePath + fileName));
            String[] line;

            for (int i = 0; i < values.length; i++) {
                line = values[i].split(regEx);
                newLine = "";

                for (String sign : line) {
                    newValue = replacementMap.get(sign);
                    if (newValue != null) {
                        newLine += newValue + regEx;
                    }
                    else {
                        newLine += sign + regEx;
                    }
                }
                bw.write(newLine);
                bw.newLine();
            }

            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}