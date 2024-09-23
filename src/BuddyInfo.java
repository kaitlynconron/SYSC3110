import java.lang.String;
public class BuddyInfo {

    private final String name;
    private final String address;
    private final int phone;

    public BuddyInfo(String Name, String Address, int Phone) {
        name = Name;
        this.address = Address;
        this.phone = Phone;
    }

    public BuddyInfo() {
        this.name = "Link";
        this.address = "Hyrule";
        this.phone = 7077007;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Kaitlyn", "Home", 7007);
        System.out.println("Hello " + buddy.getName() + "!");
    }
}
