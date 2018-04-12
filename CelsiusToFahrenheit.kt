import javax.swing.*

object CelsiusToFahrenheit {
    @JvmStatic
    fun main(args: Array<String>) {
        // receive input from user
        val celsiusString = JOptionPane.showInputDialog(null,
                "Enter the degree in Celsius",
                "Celsius to Fahrenheit Converter", JOptionPane.QUESTION_MESSAGE)

        // convert string to a number
        val celsius = java.lang.Double.parseDouble(celsiusString)

        // calculate fahrenheit
        val fahrenheit = 9.0 / 5 * celsius + 32

        // display answer to user
        JOptionPane.showMessageDialog(null, celsius.toString() + " degrees Celsius is = " +
                fahrenheit + " degrees fahrenheit", "Celsius to Fahrenheit Converter",
                JOptionPane.INFORMATION_MESSAGE)
    }
}
