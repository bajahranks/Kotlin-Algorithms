import javax.swing.*

object NumberOfYearsGivenMinutes {
    @JvmStatic
    fun main(args: Array<String>) {
        // Read the minutes from user
        val minutesString = JOptionPane.showInputDialog(null, "Enter the number of minutes",
                "Number of Years given Minutes", JOptionPane.QUESTION_MESSAGE)
        val minute = java.lang.Long.parseLong(minutesString)

        // Calculate hour, day and year
        val hour = minute / 60
        val day = (hour / 24).toInt()
        val year = day / 365
        val remainingDays = day % 365

        // Display answer to user
        if (year == 1) {
            JOptionPane.showMessageDialog(null,
                    minute.toString() + " minutes is " + year + " year and " + remainingDays + " days",
                    "Number of Years given Minutes", JOptionPane.INFORMATION_MESSAGE)
        } else {
            JOptionPane.showMessageDialog(null,
                    minute.toString() + " minutes is " + year + " years and " + remainingDays + " days",
                    "Number of Years given Minutes", JOptionPane.INFORMATION_MESSAGE)
        }
    }
}
