import java.util.Scanner
public class MegaBytesConverter{
    public static void printMegaBytesAndKiloBytes(int kiloBtyes){
        intMB;
        intKB;
        MB=kiloBytes/1024;
        KB= kiloBytes%1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        } else{
             System.out.println(kiloBtes+"KB="+MB+"MB and"+KB+"KB");
        
    }
}