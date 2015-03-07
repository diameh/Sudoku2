class Game(values: Seq[Int]) {
  def solveSudoku(): Unit = {
    val initValues = values.map(x => fixZero(x))
    val board = Board.apply(initValues)
    addNrs(Option(board)) match {
      case None => println("bork")
      case Some(b) => b.showBoard
    }
  }

  def addNrs(board:Option[Board]):Option[Board] = {
    board match {
      case None => None
      case Some(b) if b.areWeDone => board
      case Some(b) => b.bestSuggestions.head match {
        case (field, Nil) => None
        case (field, suggestions) => tryOutANumber(field, suggestions, b)ˇ
      }
    }
  }

  def tryOutANumber(field:Field, suggestions: List[Int], board:Board): Option[Board] = {
    suggestions match {
      case Nil => None
      case _  => addNrs(Option(board.addValueToAPosition(field, suggestions.head))) match {
          case None => tryOutANumber(field, suggestions.tail, board)
          case Some(a) => Some(a)
       }
    }
  }

  def fixZero(index:Int): Option[Int] = {
    index match {
      case 0 => None
      case _ => Option(index)
    }
  }
}



