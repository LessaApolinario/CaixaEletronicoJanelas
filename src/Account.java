public class Account {
  private String name;
  private String cpf;
  double balance, withdraw;

  public Account(String name, String cpf, double balance, double withdraw) {
    this.name = name;

    this.cpf = cpf;

    if (balance > 0.0) {
      this.balance = balance;
    }

    if (withdraw > 0.0) {
      this.withdraw = withdraw;
    }

  }
}
