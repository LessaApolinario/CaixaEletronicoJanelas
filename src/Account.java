public class Account {

  private String name;
  private String cpf;
  private double balance;
  private double withdraw;

  // construtor
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

  // recuperando o nome do cliente
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // recuperanndo o cpf do cliente
  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  public String getCPF() {
    return cpf;
  }

  // realiza um despósito
  public void deposit(double despositAmount) {
    if (despositAmount > 0.0) {
      balance += despositAmount;
    }
  }

  // realiza um saque
  public void withdraw(double withdrawAmount) {
    if (withdrawAmount > 0.0) {
      balance -= withdrawAmount;
    }
  }
}
