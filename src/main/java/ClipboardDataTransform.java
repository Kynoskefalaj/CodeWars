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
        return data.replace("\n", ", ");
    }
}
