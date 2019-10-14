package game

import react.*
import react.dom.div

class Board : RComponent<RProps, RState>() {

    val squares = arrayOfNulls<String>(9)

    private fun RBuilder.renderSquare(i: Int) = square(squares[i]) {
        setState { squares[i] = "X" }
    }

    var status = "Nest player: X"

    override fun RBuilder.render() {
        div {
            div("status") {
                +status
            }
            div("board-row") {
                renderSquare(0)
                renderSquare(1)
                renderSquare(2)
            }
            div("board-row") {
                renderSquare(3)
                renderSquare(4)
                renderSquare(5)
            }
            div("board-row") {
                renderSquare(6)
                renderSquare(7)
                renderSquare(8)
            }
        }
    }

}

fun RBuilder.board() = child(Board::class) {}