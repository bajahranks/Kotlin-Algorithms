import javax.swing.*

object AreaOfTriangleFromGivenPoints {
    @JvmStatic
    fun main(args: Array<String>) {
        val side1xString = JOptionPane.showInputDialog(null, "Enter x value of side 1: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side1x = java.lang.Double.parseDouble(side1xString)

        val side1yString = JOptionPane.showInputDialog(null, "Enter y value of side 1: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side1y = java.lang.Double.parseDouble(side1yString)

        val side2xString = JOptionPane.showInputDialog(null, "Enter x value of side 2: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side2x = java.lang.Double.parseDouble(side2xString)

        val side2yString = JOptionPane.showInputDialog(null, "Enter y value of side 2: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side2y = java.lang.Double.parseDouble(side2yString)

        val side3xString = JOptionPane.showInputDialog(null, "Enter x value of side 3: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side3x = java.lang.Double.parseDouble(side3xString)

        val side3yString = JOptionPane.showInputDialog(null, "Enter y value of side 3: ",
                "Area Of Triangle From Given Points", JOptionPane.QUESTION_MESSAGE)
        val side3y = java.lang.Double.parseDouble(side3yString)

        val area = Math.abs(side1x * (side2y - side3y) + side2x * (side3y - side1y) +
                side3x * (side1y - side2y) / 2)

        JOptionPane.showMessageDialog(null, "The area is: $area",
                "Area Of Triangle From Given Points", JOptionPane.INFORMATION_MESSAGE)
    }
}
