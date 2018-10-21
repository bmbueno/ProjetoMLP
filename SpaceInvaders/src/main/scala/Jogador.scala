class Jogador(nomeJogador: String) {
  val nome: String = nomeJogador;
  var pontuacao: Int = 0;

  def getNome: String = {
    return this.nome;
  }

  def getPontuacao: Int = {
    return this.pontuacao;
  }
  def atualizaPontuacao: Unit ={
    this.pontuacao += 1;
  }
  //-------------------------------------------------- [PRINTS]

  def printInformacoesJogador: Unit ={
    println("----------------");
    println("INFORMACOES JOGADOR");
    println("----------------");
    println("Nome: " + this.getNome);
    println("Pontuacao: " + this.getPontuacao);
    println("----------------");

  }

}
