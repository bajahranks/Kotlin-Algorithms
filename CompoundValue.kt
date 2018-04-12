import javax.swing.*

object CompoundValue {
    @JvmStatic
    fun main(args: Array<String>) {
        val interestRate = 0.00417

        val monthlySavingsString = JOptionPane.showInputDialog(null, "Enter your monthly savings amount",
                "CompoundValue", JOptionPane.QUESTION_MESSAGE)
        val monthlySavings = java.lang.Double.parseDouble(monthlySavingsString)

        val month1 = monthlySavings * (1 + interestRate)
        val month2 = (monthlySavings + month1) * (1 + interestRate)
        val month3 = (monthlySavings + month2) * (1 + interestRate)
        val month4 = (monthlySavings + month3) * (1 + interestRate)
        val month5 = (monthlySavings + month4) * (1 + interestRate)
        val month6 = (monthlySavings + month5) * (1 + interestRate)

        JOptionPane.showMessageDialog(null, "The amount after 6 months is: $month6",
                "CompoundValue", JOptionPane.INFORMATION_MESSAGE)
    }
}
