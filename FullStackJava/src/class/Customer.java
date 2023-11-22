class Customer {
  String fullName;
  int age;

  public Customer(String name, int age) {
    this.fullName = name;
    this.age = age;
  }

  public static void main(String s[]) {
    Customer c = new Customer("Pranav", 38);
    System.out.println("Customer " + c.fullName + " has age of " +  c.age);
  }
}
