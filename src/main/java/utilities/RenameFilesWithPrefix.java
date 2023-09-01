package utilities;

import java.io.File;

public class RenameFilesWithPrefix {

    public static void main(String[] args) {

        String folderPath = "C:\\Users\\adamg\\Pictures\\Assety\\PixelArt\\Verdant Whisker\\TileSet2\\Water\\";

        String prefix = "skeleton_mage_dying_right_";
        String suffix = "0";

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                    String oldName = file.getName();
//                    String suffix = oldName.replace("deb_right_", "");

//                    String newName = prefix + oldName;
                    String[] splitOldName = oldName.split(".p");
                    String newName = splitOldName[0] + suffix + ".p" + splitOldName[1];

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
