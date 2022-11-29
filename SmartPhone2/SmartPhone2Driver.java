package SmartPhone2;

public class SmartPhone2Driver {
    public static void main(String[] args) {
        SmartPhone2 phone = new SmartPhone2("T-Mobile", 32);

        System.out.println(phone.toString());
        System.out.println("Total play time: " + phone.totalPlayTime());
        phone.deleteAllSongs();
        System.out.println(phone.toString());
    }
}
