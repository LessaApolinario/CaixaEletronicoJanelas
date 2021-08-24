import javax.swing.JOptionPane;

public class Account {
  private String name;
  private String cpf;
  private double balance;

  // construtor
  public Account(String name, String cpf, double balance) {
    this.name = name;

    this.cpf = cpf;

    if (balance > 0.0) {
      this.balance = balance;
    }
  }

  // recuperando o nome do cliente
  public void setName(String name) {
    this.name = name;
  }

  // retorna o nome
  public String getName() {
    return name;
  }

  // recuperanndo o cpf do cliente
  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  // retorna o cpf
  public String getCPF() {
    return cpf;
  }

  // realiza um despósito
  public void deposit(double despositAmount) {
    if (despositAmount > 0.0) {
      balance += despositAmount;
    }
  }

  // retorna o saldo
  public double getBalance() {
    return balance;
  }

  // realiza um saque
  public void withdraw(double withdrawAmount) {
    if (withdrawAmount > 0.0 && withdrawAmount <= getBalance()) {
      balance -= withdrawAmount;
    } else {
      JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
    }
  }

  // exibe informações da conta
  public void displayAccount() {
    String message = String.format("\nNome: %s\nCPF: %s\nSaldo: %.2f\n", getName(), getCPF(), Double.valueOf(getBalance()));
    JOptionPane.showMessageDialog(null, message);
  }
}
