import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    /*JOptionPane.showMessageDialog(null, "Todo mundo quer ir para o ceu, \nMas ninguém quer morrer");*/

    String name = JOptionPane.showInputDialog("Qual seu nome Jovem ?");

    String message = String.format("%s, Todo mundo quer ir para o céu, \nMas ninguem quer morrer", name);

    JOptionPane.showMessageDialog(null,message);
  }
}