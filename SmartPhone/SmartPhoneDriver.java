package SmartPhone;

public class SmartPhoneDriver {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("T-Mobile", 32);

        System.out.println(phone.toString());
        System.out.println("Total play time: " + phone.totalPlayTime());
        phone.deleteAllSongs();
        System.out.println(phone.toString());
    }
}
