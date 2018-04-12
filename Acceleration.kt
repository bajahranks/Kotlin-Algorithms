import javax.swing.*

object Acceleration {
    @JvmStatic
    fun main(args: Array<String>) {
        // Read starting velocity
        val startingVelocityString = JOptionPane.showInputDialog(null,
                "Enter the starting velocity", "Acceleration", JOptionPane.QUESTION_MESSAGE)
        val startingVelocity = java.lang.Double.parseDouble(startingVelocityString)

        // Read ending velocity
        val endingVelocityString = JOptionPane.showInputDialog(null,
                "Enter the ending velocity", "Acceleration", JOptionPane.QUESTION_MESSAGE)
        val endingVelocity = java.lang.Double.parseDouble(endingVelocityString)

        // Read time
        val timeString = JOptionPane.showInputDialog(null,
                "Enter the time", "Acceleration", JOptionPane.QUESTION_MESSAGE)
        val time = Integer.parseInt(timeString)

        // Calculate acceleration
        val acceleration = (endingVelocity - startingVelocity) / time

        // Display answer to user
        JOptionPane.showMessageDialog(null,
                "Acceleration is : $acceleration", "Acceleration", JOptionPane.INFORMATION_MESSAGE)
    }
}
