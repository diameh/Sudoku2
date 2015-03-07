class Board (fieldsAndValues: Map[Field, Int]) {
  def showBoard() {
    for (field <- Field.allPossibleFields) {
        printPosition(field, fieldsAndValues.get(field))
    }
  }

  def addValueToAPosition(field:Field, value:Int) = {
    new Board(fieldsAndValues + (field -> value))
  }

  def areWeDone = fieldsAndValues.size == 81

  def printPosition(field: Field, value: Option[Int]) {
    print(s" ${value.getOrElse(".")} ${field.displayString()}")
  }

  def bestSuggestions: Seq[(Field, List[Int])] = {
    unfilledFields
      .map(x => x -> numbersToTryOut(x))
      .sortBy(x => x._2.size)
  }


  def unfilledFields: List[Field] = (Field.allPossibleFields.toSet -- fieldsAndValues.keySet).toList

  def numbersToTryOut(field:Field): List[Int]= {
    (Set(1, 2, 3, 4, 5, 6, 7, 8, 9) -- usedNumbers(field)).toList
  }

  def usedNumbers(field:Field) = {
    fieldsAndValues
      .collect { case (Field(row,col,squ), value)
      if row == field.row || col == field.col || squ == field.squ => value }
      .toSet
  }
}

object Board {
  /** @param values The value at each field, zero means no value */
  def apply(values: Seq[Option[Int]]) = {
    val map = Field.allPossibleFields
      .zip(values)
      .collect { case (field, Some(value)) => (field, value) }
      .toMap
    new Board(map)
  }
}
