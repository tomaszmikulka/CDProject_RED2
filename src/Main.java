import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cześć ! Witam w generatorze postaci.\nNa poczatęk podaj kilka informacji dotyczących Twojej postaci:");
        System.out.println("Jak nazywa się Twoja postać?");
        String imie = sc.nextLine();
        System.out.println("Wybierz klasę postaci: ");
        String klasa = sc.nextLine();
        System.out.println("Ile ma posiadać punktów siły?");
        int punkty_sily = sc.nextInt();
        System.out.println("Ile ma posiadać punktów many?");
        int punkty_many = sc.nextInt();
        System.out.println("Czy jest to nowa postać? true/false");
        boolean nowa_stara = sc.nextBoolean();
        Hero postac = new Hero (imie, klasa, punkty_sily, punkty_many, nowa_stara);
        System.out.println("Gratuluje stworzenia nowej postaci ! Oto jej dane:\nNazwa: " + postac.getImie() + "\nKlasa: " + postac.getKlasa() + "\nSiła: " + postac.getPunkty_sily() + "\nMana: " + postac.getPunkty_many() + "\nMoc uderzenia: " + postac.moc_bohatera() + "\n" + "Czy jest to nowa postać? " + postac.getNowa_stara());
    }
}
