package app

import game.game
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import logo.*
import mycomp.mycomp
import mycomp.mycomp1
import ticker.*

class App : RComponent<RProps, RState>() {

    private var pass = 0

    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
        p {
            mycomp()
        }
        p {
            mycomp1(pass)
        }

        button {
            +"Click"
            attrs.onClickFunction = { setState { pass += 1 } }
        }

        div {
            game()
        }
    }
}
fun RBuilder.app() = child(App::class) {}
