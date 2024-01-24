import javax.swing.JOptionPane

fun main(args: Array<String>) {
    val name = JOptionPane.showInputDialog("Type your name:")
    //%s is for concatenating strings, as value, value
    val output = String.format("%s %s", "Welcome, ", name)

    //Shows graphic interface
    JOptionPane.showMessageDialog(null, output)
}
