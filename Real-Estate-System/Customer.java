public class Customer{

  String custName = "";
  String custAddress = "";
  String custEmail = "";
  String custZipcode = "";

  
  public Customer(String custName, String custAddress, String custEmail, String custZipcode) {
    this.custName = custName;
    this.custAddress = custAddress;
    this.custEmail = custEmail;
    this.custZipcode = custZipcode;
  }
  
  
  public String getCustName() {
    return custName;
  }
  public void setCustName(String custName) {
  	this.custName = custName;
  }
  
  public String getCustAddress() {
  	return custAddress;
  }
  public void setCustAddress(String custAddress) {
  	this.custAddress = custAddress;
  }

  public String getCustEmail() {
    return custEmail;
  }
  public void setCustEmail(String custEmail){
    this.custEmail = custEmail;
  }

  public String getCustZipcode(){
    return custZipcode;
  }
  public void SetCustZipcode(String custZipcode){
    this.custZipcode = custZipcode;
  }
  
}