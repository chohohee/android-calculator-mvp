package edu.nextstep.camp.calculator

interface MainContract {

    interface View {

        fun refreshExpressionView(expression: String)

        fun showToast(result: String)
    }

    interface Presenter {
        fun addOperand(rawOperand: String)

        fun addOperator(rawOperator: String)

        fun removeLast()

        fun calculate()

    }

}