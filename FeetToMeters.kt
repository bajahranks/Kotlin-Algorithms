import javax.swing.*

object FeetToMeters {
    @JvmStatic
    fun main(args: Array<String>) {
        // receive input from user
        val feetString = JOptionPane.showInputDialog(null,
                "Enter feet",
                "Feet to Meter Converter", JOptionPane.QUESTION_MESSAGE)

        // convert string to a number
        val feet = java.lang.Double.parseDouble(feetString)

        // calculate meters
        val meter = feet * 0.305

        // display answer to user
        JOptionPane.showMessageDialog(null, feet.toString() + " feet = " +
                meter + " meters", "Feet to Meter Converter",
                JOptionPane.INFORMATION_MESSAGE)
    }
}
