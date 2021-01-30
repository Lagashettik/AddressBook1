import java.awt.desktop.SystemEventListener;
import java.util.*;

public class AddressBookTest extends AddressBook {
    static Scanner scan = new Scanner(System.in);

    static AddressBook Adr = new AddressBookTest();
    static ArrayList<AddressBook> adrlst= new ArrayList<AddressBook>();

    AddressBookTest(){
        super();
    }
    AddressBookTest(String firstname, String lastname, String  address, String  city, String state, String email, int zip, long phNo){
        super(firstname, lastname, address, city, state, email, zip, phNo);
    }

    void AddContact(){
        System.out.println("Enter First Name");
        String firstname=scan.next();

        System.out.println("Enter Last Name");
        String lastname=scan.next();

        System.out.println("Enter Address");
        String address=scan.next();

        System.out.println("Enter City");
        String city=scan.next();

        System.out.println("Enter State");
        String state= scan.next();

        System.out.println("Enter Email");
        String email = scan.next();

        System.out.println("Enter Zip Code");
        int zip = scan.nextInt();

        System.out.println("Enter Phone Number");
        long phNo = scan.nextLong();

        AddressBookTest addConact = new AddressBookTest(firstname, lastname, address, city, state, email, zip, phNo);
        adrlst.add(addConact);

    }

    public static void main(String[] args){
        AddressBookTest adr = new AddressBookTest();
        adr.AddContact();
        System.out.println(AddressBookTest.adrlst);
        System.out.println("End");

    }
}

class AddressBook<String> {
    private String Fname;   // First Name
    private String Lname;   // Last Name
    private String Address;
    private String City;
    private String State;
    private String Email;
    private int Zip;
    private long  PhNo;     // PhNo= Phone Number

    AddressBook(String fname, String lname, String address, String city, String state, String email, int zip, long phNo){
        super();
        this.Fname = fname;
        this.Lname = lname;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Email = email;
        this.Zip = zip;
        this.PhNo = phNo;
    }

    public AddressBook() {
    super();
    }


    public void setFname(String fname){
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setAddress(String address){
        Address = address;
    }
    public void setCity(String city){
        City = City;
    }
    public void setState(String state){
        State = state;
    }
    public void setEmail(String email){
        Email = email;
    }
    public void setZip(int zip){
        Zip = zip;
    }
    public void setPhNo(long phNo){
        PhNo = phNo;
    }
    public void display(){
        System.out.println(Zip);
    }

}