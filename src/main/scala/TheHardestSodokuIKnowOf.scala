

object TheHardestSodokuIKnowOf extends App {

  val hardestSodokuEver = Map(
    (0, 0) -> 8,

    (1, 2) -> 7,
    (1, 3) -> 5,
    (1, 8) -> 9,

    (2, 1) -> 3,
    (2, 6) -> 1,
    (2, 7) -> 8,

    (3, 1) -> 6,
    (3, 5) -> 1,
    (3, 7) -> 5,

    (4, 2) -> 9,
    (4, 4) -> 4,

    (5, 3) -> 7,
    (5, 4) -> 5,

    (6, 2) -> 2,
    (6, 4) -> 7,
    (6, 8) -> 4,

    (7, 5) -> 3,
    (7, 6) -> 6,
    (7, 7) -> 1,

    (8, 6) -> 8
  )
  
  val hardest =
    for {
      x <- 0 to 8
      y <- 0 to 8
    } yield hardestSodokuEver.getOrElse((x, y), 0)


  new Game(hardest).solveSudoku()

}
