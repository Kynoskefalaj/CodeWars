package utilities;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class ClipboardDataTransform {

    public static void main(String[] args) {

        try {
            String clipboardData = getClipboardContents();

            String transformedData = transformToCommaSeparated(clipboardData);

            setClipboardContents(transformedData);

            System.out.println("Dane zostały przekształcone i wklejone z powrotem do schowka.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getClipboardContents() throws IOException, UnsupportedFlavorException {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = clipboard.getContents(null);

        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String) transferable.getTransferData(DataFlavor.stringFlavor);
        }
        return null;
    }

    private static void setClipboardContents(String data) {
        StringSelection selection = new StringSelection(data);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }

    private static String transformToCommaSeparated (String data) {
        return data.replace("false", "true        setUp(12, \"water/Water00\", true);\n" +
                "        setUp(13, \"water/Water01\", true);\n" +
                "        setUp(14, \"water/Water02\", true);\n" +
                "        setUp(15, \"water/Water03\", true);\n" +
                "        setUp(16, \"water/Water04\", true);\n" +
                "        setUp(17, \"water/Water05\", true);\n" +
                "        setUp(18, \"water/Water06\", true);\n" +
                "        setUp(19, \"water/Water07\", true);\n" +
                "        setUp(20, \"water/Water08\", true);\n" +
                "        setUp(21, \"water/Water09\", true);\n" +
                "        setUp(22, \"water/Water10\", true);\n" +
                "        setUp(23, \"water/Water11\", true);\n" +
                "        setUp(24, \"water/Water12\", true);\n" +
                "        setUp(25, \"water/Water13\", true);");
    }
}


