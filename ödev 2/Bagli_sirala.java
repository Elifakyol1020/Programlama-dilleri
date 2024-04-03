package odev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bagli_sirala {
    int veri;
    int adres;
    
    public Bagli_sirala(int veri, int adres) {
        this.veri = veri;
        this.adres = adres;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dosya adi giriniz: ");
        String a = scan.nextLine();
        String path = "src/odev2/" + a + ".txt";
        oku(path);
    }

    public static void oku(String path) {
        ArrayList<Bagli_sirala> dizi = new ArrayList();
        ArrayList<Bagli_sirala> dizi1 = new ArrayList();
        String deger = " ";
        int i = 0;
        int c=0;
        try {
            try (FileReader fileReader = new FileReader(path)) {
                FileReader filereader1 = new FileReader(path);
                BufferedReader in = new BufferedReader(filereader1);
                while ((deger = in.readLine()) != null) {
                    int veri = Integer.parseInt(deger.trim());
                    Bagli_sirala yeniveri = new Bagli_sirala(veri, i++);
                    Bagli_sirala yeniveri1 = new Bagli_sirala(veri, c++);
                    dizi.add(yeniveri);
                    dizi1.add(yeniveri1);
                }
                fileReader.close();
            }
        } catch (IOException ex) {
        }
        int n = dizi.size();
        for (int e = 0; e < n - 1; e++) {
            for (int j = 0; j < n - e - 1; j++) {
                if (dizi1.get(j).veri > dizi1.get(j + 1).veri) {
                int temp = dizi1.get(j).veri;
                dizi1.get(j).veri = dizi1.get(j + 1).veri;
                dizi1.get(j + 1).veri = temp;
                int temp1=dizi1.get(j).adres;
                dizi1.get(j).adres=dizi1.get(j+1).adres;
                dizi1.get(j+1).adres=temp1;
                }
            }
        }       
        System.out.println("Siralanmamis dizi:\tSiralanmis dizi:\nVERI:\tADRES:\t\tVERI:\tADRES:");
        for (int m=0;m<dizi.size();m++) {
            System.out.println(dizi.get(m).veri + "\t" + dizi.get(m).adres+"   \t\t"+dizi1.get(m).veri+"   \t"+dizi1.get(m).adres);
        }
    }
}
    
     



