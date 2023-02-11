public class Listing{

  String listingAddress = "";
  String listingZipcode = "";


  public Listing(String listingAddress, String listingZipcode)  {
    this.listingAddress = listingAddress;
    this.listingZipcode = listingZipcode;
  }

  
  public String getListingAddress() {
  	return listingAddress;
  }
  public void setListingAddress(String listingAddress) {
  	this.listingAddress = listingAddress;
  }

  public String getListingZipcode() {
    return listingZipcode;
  }
  public void setListingZipcode(String listingZipcode) {
  	this.listingZipcode = listingZipcode;
  }
  
}