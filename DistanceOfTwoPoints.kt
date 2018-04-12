import javax.swing.*


object DistanceOfTwoPoints {
    @JvmStatic
    fun main(args: Array<String>) {
        val x1String = JOptionPane.showInputDialog(null, "Enter the x value of the first point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE)
        val x1 = java.lang.Double.parseDouble(x1String)

        val y1String = JOptionPane.showInputDialog(null, "Enter the y value of the first point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE)
        val y1 = java.lang.Double.parseDouble(y1String)

        val x2String = JOptionPane.showInputDialog(null, "Enter the x value of the second point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE)
        val x2 = java.lang.Double.parseDouble(x2String)

        val y2String = JOptionPane.showInputDialog(null, "Enter the y value of the second point",
                "Distance Of Two Points", JOptionPane.QUESTION_MESSAGE)
        val y2 = java.lang.Double.parseDouble(y2String)

        val distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))

        JOptionPane.showMessageDialog(null, "The distance is: $distance",
                "Distance Of Two Points", JOptionPane.INFORMATION_MESSAGE)
    }
}
