

object SpaceInvaders {
  def main(args: Array[String]): Unit = {

    var scanner = new java.util.Scanner(System.in)
    var nome = scanner.nextLine()

    var jogador = new Jogador(nome)

    jogador.printInformacoesJogador

    var teste: UI = new UI

    teste.criaJanela


  }
}
