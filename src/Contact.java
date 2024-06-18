public class Contact {
  private String name;
  private int phone;

  public Contact(String name, int phone) {
    this.name = name;
    this.phone = phone;
  }

  // Getter and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  // Methods

  @Override
  public String toString() {
    return "Name: " + name + ", Phone: " + phone; }

}
