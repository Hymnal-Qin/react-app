package mycomp

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class MyComp(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        +"This is my component."
    }

}

fun RBuilder.mycomp() = child(MyComp::class) {}