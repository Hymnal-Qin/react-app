package mycomp

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

interface MyProps : RProps {
    var pass: Int
}

class MyComp1(props: MyProps) : RComponent<MyProps, RState>(props) {
    override fun RBuilder.render() {
        +"This is my component. This is ${props.pass}."
    }

}

fun RBuilder.mycomp1(pass: Int) = child(MyComp1::class) { attrs.pass = pass }