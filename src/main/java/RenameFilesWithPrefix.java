import java.io.File;

public class RenameFilesWithPrefix {

    public static void main(String[] args) {

        String folderPath = "C:\\Users\\adamg\\Pictures\\Assety\\PixelArt\\Verdant Whisker\\VFX\\Arcane_Missile\\down\\";

        String prefix = "am_down_";

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                    String oldName = file.getName();

                    String newName = prefix + oldName;

                    File newFile = new File(folderPath + newName);

                    if (file.renameTo(newFile)) {
                        System.out.println("Zmieniono nazwę pliku " + oldName + " na " + newName);
                    } else {
                        System.out.println("Nie udało się zmienić nazwy pliku " + oldName);
                    }
                }
            }
        } else {
            System.out.println("Brak plików w folderze.");
        }
    }
}
