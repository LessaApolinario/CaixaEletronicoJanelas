import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class Transactions {
  public static void main(String[] args) {
    Account account1 = new Account("Pessoa A", "123.456.789-01", 1000);

    // exibindo as informações dos clientes
    account1.displayAccount();

    String myname = JOptionPane.showInputDialog("Qual é o seu nome?");
    account1.setName(myname); // armazenando o nome digitado no objeto account1

    String myCPF = JOptionPane.showInputDialog("Qual é o seu CPF?");
    account1.setCPF(myCPF); // armazenando o CPF digitado no objeto account1

    if (myname.equals("Pessoa A") && myCPF.equals("123.456.789-01")) {
      String option = JOptionPane.showInputDialog("Digite 1 para depositar.\nDigite 0 para sacar.\n");
      int number = parseInt(option);

      if (number == 1) {
        String mybalance = JOptionPane.showInputDialog("Qual é o valor a ser depositado?");
        // convertendo para double e adicionando o saldo no objeto account1
        account1.deposit(Double.parseDouble(mybalance));
      } else if (number == 0) {
        String myWithdraw = JOptionPane.showInputDialog("Qual a quantia a ser sacada?");
        // convertendo para double e realizando o saque no objeto account1
        account1.withdraw(Double.parseDouble(myWithdraw));
      }

      // exibindo as informações dos clientes
      account1.displayAccount();
    } else {
      JOptionPane.showMessageDialog(null, "Dados inválidos!");
    }
  }
}

