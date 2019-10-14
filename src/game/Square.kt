package game

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.button

interface Index : RProps {
    var index: String?
    var block: () -> Unit
}

class Square(props: Index) : RComponent<Index, RState>(props) {


    override fun RBuilder.render() {

        button(classes = "square") {
            +(props.index ?: "null")
            attrs.onClickFunction = { props.block.invoke() }
            attrs{
                asDynamic().onClick = {

                }
            }
        }
    }

}

fun RBuilder.square(i: String?, block: () -> Unit) = child(Square::class) {
    attrs.index = i
    attrs.block = block
}