import java.io.File;

public class FindFileSize {
    public static void main(String[] args) {
        File file = new File("/Users/kevinstradtman/Desktop/Development/Java/DataStructuresAndMore/filesize.txt");
        if(file.exists()) {
            System.out.println(fileInSizeBytes(file));
            System.out.println(fileInSizeKiloBytes(file));
            System.out.println(fileInSizeMegaBytes(file));
        } else {
            System.out.println("File does not exist!");
        }
    }

    private static String fileInSizeBytes(File file) {
        return (double) file.length()+"bytes";
    }
    private static String fileInSizeMegaBytes(File file) {
        return (double) file.length()/(1024*1024)+ "mb";
    }
    private static String fileInSizeKiloBytes(File file) {
        return (double) file.length()/1024 + "kb";
    }
}
