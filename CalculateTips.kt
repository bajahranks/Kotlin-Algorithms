import javax.swing.*

object CalculateTips {
    @JvmStatic
    fun main(args: Array<String>) {
        // Read the subtotal
        val subTotalString = JOptionPane.showInputDialog(null,
                "Enter subtotal",
                "Calculate Tips", JOptionPane.QUESTION_MESSAGE)

        val subTotal = java.lang.Double.parseDouble(subTotalString)

        // Read the gratuity
        val gratuityString = JOptionPane.showInputDialog(null,
                "Enter gratuity",
                "Calculate Tips", JOptionPane.QUESTION_MESSAGE)

        val gratuity = java.lang.Double.parseDouble(gratuityString)

        // calculate total gratuity
        val gratuityAmount = gratuity / 100 * subTotal

        // calculate total amount
        val totalAmount = subTotal + gratuityAmount

        JOptionPane.showMessageDialog(null,
                "Gratuity Amount is: $$gratuityAmount\nTotal Amount is: $$totalAmount",
                "Calculate Tips", JOptionPane.INFORMATION_MESSAGE)

    }
}

