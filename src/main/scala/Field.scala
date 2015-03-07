case class Field (row: Int, col: Int, squ: Int) {
  def displayString(): String = (row, col, squ)
  match {
    case (3,9,3) => "\n__________________________\n"
    case (6,9,6) => "\n__________________________\n"
    case (_,9,_) => "\n"
    case (_,3,_) => "|"
    case (_,6,_) => "|"
    case a => ""
  }
}

object Field {
  def allPossibleFields: Seq[Field] = {
    Seq (
      new Field(1,1,1), new Field(1,2,1), new Field(1,3,1),
      new Field(1,4,2), new Field(1,5,2), new Field(1,6,2),
      new Field(1,7,3), new Field(1,8,3), new Field(1,9,3),

      new Field(2,1,1), new Field(2,2,1), new Field(2,3,1),
      new Field(2,4,2), new Field(2,5,2), new Field(2,6,2),
      new Field(2,7,3), new Field(2,8,3), new Field(2,9,3),

      new Field(3,1,1), new Field(3,2,1), new Field(3,3,1),
      new Field(3,4,2), new Field(3,5,2), new Field(3,6,2),
      new Field(3,7,3), new Field(3,8,3), new Field(3,9,3),

      new Field(4,1,4), new Field(4,2,4), new Field(4,3,4),
      new Field(4,4,5), new Field(4,5,5), new Field(4,6,5),
      new Field(4,7,6), new Field(4,8,6), new Field(4,9,6),


      new Field(5,1,4), new Field(5,2,4), new Field(5,3,4),
      new Field(5,4,5), new Field(5,5,5), new Field(5,6,5),
      new Field(5,7,6), new Field(5,8,6), new Field(5,9,6),

      new Field(6,1,4), new Field(6,2,4), new Field(6,3,4),
      new Field(6,4,5), new Field(6,5,5), new Field(6,6,5),
      new Field(6,7,6), new Field(6,8,6), new Field(6,9,6),

      new Field(7,1,7), new Field(7,2,7), new Field(7,3,7),
      new Field(7,4,8), new Field(7,5,8), new Field(7,6,8),
      new Field(7,7,9), new Field(7,8,9), new Field(7,9,9),

      new Field(8,1,7), new Field(8,2,7), new Field(8,3,7),
      new Field(8,4,8), new Field(8,5,8), new Field(8,6,8),
      new Field(8,7,9), new Field(8,8,9), new Field(8,9,9),

      new Field(9,1,7), new Field(9,2,7), new Field(9,3,7),
      new Field(9,4,8), new Field(9,5,8), new Field(9,6,8),
      new Field(9,7,9), new Field(9,8,9), new Field(9,9,9)
    )
  }
}