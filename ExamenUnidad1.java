import javax.swing.JOptionPane;
public class ExamenUnidad1{
	public static void main (String[] args) {
		int promedio=Integer.parseInt(JOptionPane.showInputDialog("Da tu promedio"));
		if (promedio==100)
			JOptionPane.showMessageDialog(null,"Usted puede gozar de la beca Excelencia");
		else
		if (promedio>85 & promedio<100)
		JOptionPane.showMessageDialog(null,"Usted puede gozar de la beca Solidaridad");
		else
		if (promedio >=70 & promedio<=85)
		JOptionPane.showMessageDialog(null,"Usted puede gozar de la beca Equidad");
		else 
			JOptionPane.showMessageDialog(null,"NOOO puede gozar de beca su promedio es incorrecto");	
}
}