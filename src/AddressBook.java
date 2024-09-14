import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> book;

    public AddressBook() {
        this.book = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo pal) {
        this.book.add(pal);
    }

    public void removeBuddy(BuddyInfo pal) {
        this.book.remove(pal);
    }

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        BuddyInfo bud = new BuddyInfo("kait", "Home", 7007);
        BuddyInfo guy = new BuddyInfo("link", "his house", 40009);
        ab.addBuddy(bud);
        ab.addBuddy(guy);
        System.out.println(ab.book.get(0).getName());
        ab.removeBuddy(bud);
        System.out.println(ab.book.get(0).getName());


        //System.out.println("Address Book");
    }
}
