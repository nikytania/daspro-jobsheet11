import java.util.Scanner;

public class UcapanTerimaKasih_18 {
  public static String penerimaUcapan() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
      String namaOrang = sc.nextLine();
      sc.close();
      return namaOrang;
  }

  public static void ucapanTerimaKasih() {
      String nama = penerimaUcapan(); 
      System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +
              "You inspired in me a love for learning and made me feel like I could ask you anything.");
  }
  public static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
  }

  public static void main(String[] args) {
      ucapanTerimaKasih();

      String tambahan = "I hope you are always healty and happy!";
        ucapanTambahan(tambahan);
  }
}