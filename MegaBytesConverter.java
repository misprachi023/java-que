import java.util.Scanner

class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBtyes) {
        int MB;
        int KB;
        MB = kiloBytes / 1024;
        KB = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBtes + "KB=" + MB + "MB and" + KB + "KB");

        }
    }

    public static void main(String[] args) {
        MegaBytes Obj = new MegaBytes();
        Obj.printMegaBytesAndKiloBytes(2500);
    }
}
