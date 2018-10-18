class DisparoNave(coordenadaNaveX: Int, coordenadaNaveY: Int) {
  var coordenadaDisparoX: Int = coordenadaNaveX;
  var coordenadaDisparoY: Int = coordenadaNaveY + 1;

  //-------------------------------------------------- [GETS]
  def getCoordenadaDisparoX: Int ={
    return this.coordenadaDisparoX;
  }

  def getCoordenadaDisparoY: Int ={
    return this.coordenadaDisparoY;
  }

  def movimentoDisparo: Unit ={
    this.coordenadaDisparoY += this.coordenadaDisparoY;
  }


  //-------------------------------------------------- [PRINTS]

  def printInformacoesDisparoNave: Unit ={
    println("----------------");
    println("INFORMACOES DISPARO NAVE");
    println("----------------");
    println("Coordenada x: " + this.getCoordenadaDisparoX);
    println("Coordenada y: " + this.getCoordenadaDisparoY);
    println("----------------");

  }


}
