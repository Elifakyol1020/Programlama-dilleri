
package progamlamadilleri;
import java.util.ArrayList;
import java.util.Scanner;
public class gramer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz:");
        String kullanici_giris = scanner.nextLine();
        String cevap=kontrol(kullanici_giris);
        System.out.println(cevap);
    }
    public static String kontrol(String deger) {
        String[] dizi = deger.replaceAll("\\s+", " ").trim().split("\\s+");
        if (dizi.length != 3){
          return "HAYIR";
        }
        int e=0;
        ArrayList <String> OZNE = new ArrayList<>();
        OZNE.add("Ben");
        OZNE.add("Sen");
        OZNE.add("Hasan");
        OZNE.add("Nurşah");
        OZNE.add("Elif");
        OZNE.add("Abdulrezzak");
        OZNE.add("Şehribanu");
        OZNE.add("Zeynelabidin");
        OZNE.add("Naki");
        ArrayList <String> NESNE=new ArrayList<>();
        NESNE.add("Bahçe");
        NESNE.add("Okul");
        NESNE.add("Park");
        NESNE.add("Sınıf");
        NESNE.add("Yarın");
        NESNE.add("Pazartesi");
        NESNE.add("Salı");
        NESNE.add("Çarşamba");
        NESNE.add("Perşembe");
        NESNE.add("Cuma");
        NESNE.add("Cumartesi");
        NESNE.add("Pazar");
        NESNE.add("Merkez");
        NESNE.add("Ev");
        NESNE.add("Kitap");
        NESNE.add("Defter");
        NESNE.add("Güneş");
        NESNE.add("Beydağı");
        ArrayList <String> YUKLEM=new ArrayList<>();
        YUKLEM.add("Gitmek");
        YUKLEM.add("Gelmek");
        YUKLEM.add("Okumak");
        YUKLEM.add("Yazmak");
        YUKLEM.add("Yürümek");
        YUKLEM.add("Görmek");
        for(String eleman: OZNE){
            if(eleman.equals(dizi[0])){
                e=1;
            }
        }
         if(e==0){
            return "HAYIR";
        }
         e=0;
        for(String eleman1: NESNE){
            if(eleman1.equals(dizi[1])){
                e=1;
            }
        }
         if(e==0){
            return "HAYIR";
        }
         e=0;
         for(String eleman2: YUKLEM){
            if(eleman2.equals(dizi[2])){
                e=1;
            }
        }
        if(e==0){
            return "HAYIR";
        }
        return "EVET";
    }   
}
  
    
 

