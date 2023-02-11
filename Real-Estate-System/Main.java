import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

class Main {
  
  public static void main(String[] args) {

    ArrayList<Customer> customerList = readCustomerData();
    ArrayList<Listing> listingList = readListingData();
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("\nThank you for visiting 123 Fake Street's open house!");
    
    System.out.println("\nEnter your first and last name: ");
    String name = sc.nextLine();

    System.out.println("\nEnter your home address: ");
    String home = sc.nextLine();

    System.out.println("\nEnter your email address: ");
    String email = sc.nextLine();

    System.out.println("\nI would like to be notified about listings in the following zipcode: ");
    String zipcode = sc.nextLine();

    System.out.println("\nYour email address has been subscribed to our emailing list.");

    System.out.println("\nThank you for attending the open house, " + name + "!");

    Customer customer = new Customer(name, home, email, zipcode);
    customerList.add(customer);

    checkZipcode(customer, listingList);

    writeCustomerData(customerList);
  }

   public static ArrayList<Customer> readCustomerData() {
    String delimiter = ",";
    String mystring;

    ArrayList<Customer> customerList = new ArrayList<Customer>();

    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("Customer.csv"));
      while ((mystring = bufferedReader.readLine()) != null) {
        String[] items = mystring.split(delimiter);
        Customer customer = new Customer(items[0], items[1], items[2], items[3]);
        customerList.add(customer);
      }
    } catch (IOException e)
    {
      e.printStackTrace();
    }
    return customerList;
    }

    public static void writeCustomerData(ArrayList<Customer> customerList) {
    try {
      FileWriter writer = new FileWriter("Customer.csv", false);

      for (Customer obj : customerList) {
        writer.write(obj.getCustName() + "," + obj.getCustAddress() + "," + obj.getCustEmail() + "," + obj.getCustZipcode() + "\n");
      }

      writer.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }  
  }

  public static ArrayList<Listing> readListingData() {
    String delimiter = ",";
    String mystring;

    ArrayList<Listing> listingList = new ArrayList<Listing>();

    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("Listing.csv"));
      while ((mystring = bufferedReader.readLine()) != null) {
        String[] items = mystring.split(delimiter);
        Listing listing = new Listing(items[0], items[1]);
        listingList.add(listing);
      }
    } catch (IOException e)
    {
      e.printStackTrace();
    }
    return listingList;
    }

  static void checkZipcode(Customer customer, ArrayList<Listing> listingList) {
    boolean hasMatched = false;
    for (Listing obj : listingList) {
      if (customer.getCustZipcode().equals(obj.getListingZipcode())){
        hasMatched = true;
        System.out.println("\nEmail has been sent for the listing " + obj.listingAddress);
      }
    }

    if (hasMatched == false){
      System.out.println("\nNo listings match your zipcode.");
    }
  } 
}