import scala.collection.JavaConverters._
import java.util
import java.util.Scanner


object SpaceInvaders {
  def main(args: Array[String]): Unit = {

    val scanner = new java.util.Scanner(System.in)
    val nome = scanner.nextLine()

    val jogador = new Jogador(nome)

    print(jogador.nome)

  }
}
