class Alien(x: Int, y: Int) {
  var posX: Int = x
  var posY: Int = y
  var vivo: Boolean = true


  def mexe(direcao: String): Unit = {
    if (direcao.equals("esquerda") == true){
      this.posX -= 1
    }
    else if(direcao.equals("direita") == true){
      this.posX += 1
    }
    else
      println("ERRO")
  }
  def morreu: Unit = {
    if (vivo){
      // desenha UI
    }
    else {
      //apaga UI
    }
  }
}

// TODO: desenhar, apagar, mover
