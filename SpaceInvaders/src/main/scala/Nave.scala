class Nave() {
  val posXInicial: Int = 0;
  val posYInicial: Int = 50;
  val quantidadeVidas: Int = 3;
  var posX: Int = 0;
  var posY: Int = 0;
  var vidas: Int = 0;


  //-------------------------------------------------- [SETS]
  def inicialNave: Unit ={
    this.posX = this.posXInicial;
    this.posY = this.posYInicial;
    this.vidas = this.quantidadeVidas;
  }

  def setNovaPosicaoNaveX(coordenadaX: Int): Unit ={
    this.posX = coordenadaX;
  }
  
  // não tenho certeza se a nave se move no eixo Y.
  def setNovaPosicaoNaveY(coordenadaY: Int): Unit ={
    this.posY = coordenadaY;
  }


  //-------------------------------------------------- [GETS]
  def getCoordenadaXNave: Int ={
    return this.posX;
  }

  def getCoordenadaYNave: Int ={
    return this.posY;
  }

  def getVidas: Int ={
    return this.vidas;
  }

  //-------------------------------------------------- [MECÂNICA DA NAVE]
  def movimentaNaveParaFrente: Unit ={
    this.posY = this.posY + 1;
  }

  def movimentaNaveParaTras: Unit ={
    this.posY = this.posY - 1;
  }

  def movimentaNaveParaDireita: Unit ={
    this.posX = this.posX + 1;
  }

  def movimentaNaveParaEsquerda: Unit ={
    this.posX = this.posX - 1;
  }

  def decrementaVida: Unit = {
    this.vidas = this.vidas - 1;

  }

  /**
    * O método efetua o decremento de vidas da nave e faz a verificação se ela ainda está
    * em funcionamento.
    *
    * @return FALSE em caso de a nave ter sido abatida.
    */
  def naveDanificada: Boolean ={
    var naveEmFuncionamento: Boolean = true;


    if(this.getVidas <= 0){
      naveEmFuncionamento = false;
    }else{
      this.decrementaVida;
    }

    return naveEmFuncionamento;

  }

  //-------------------------------------------------- [PRINTS]

  def printInformacoesNave: Unit ={
    println("----------------");
    println("INFORMACOES NAVE");
    println("----------------");
    println("Coordenada x: " + this.getCoordenadaXNave);
    println("Coordenada y: " + this.getCoordenadaYNave);
    println("Vidas: " + this.getVidas);
    println("----------------");

  }

}
