import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> book;

    public AddressBook() {
        this.book = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo pal) {
        if(pal != null) {
            this.book.add(pal);
        }
    }

    public void removeBuddy(BuddyInfo pal) {
        this.book.remove(pal);
    }

    public String getName(BuddyInfo pal) {
        return pal.getName();
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
