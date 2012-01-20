package Principal;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import info.clearthought.layout.TableLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VLogin extends javax.swing.JFrame {
	private JPanel Panel1;
	private JButton botonVenta;
	private JButton botonCerrar;
	private JButton botonCaja;
	private JButton botonProveedores;
	private JButton botonCamareros;
	private JButton botonPedido;
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
/*	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public VLogin() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			this.setTitle("Tpv BarJala Login");
			this.setName("Principal");
			this.setResizable(false);
			getContentPane().setBackground(new java.awt.Color(192,192,192));
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					System.out.println("this.mouseClicked, event="+evt);
					//TODO add your code for this.mouseClicked
					botonVenta.setBackground(Color.BLUE);
				}
			});
			{
				Panel1 = new JPanel();
				GridLayout Panel1Layout = new GridLayout(6, 1);
				Panel1Layout.setHgap(5);
				Panel1Layout.setVgap(5);
				Panel1Layout.setColumns(1);
				Panel1Layout.setRows(6);
				Panel1.setLayout(Panel1Layout);
				getContentPane().add(Panel1);
				Panel1.setBounds(7, 6, 186, 549);
				Panel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				Panel1.setForeground(new java.awt.Color(255,0,0));
				{
					botonVenta = new JButton();
					Panel1.add(botonVenta);
					botonVenta.setText("Venta");
					botonVenta.setPreferredSize(new java.awt.Dimension(164, 49));
					botonVenta.setSize(165, 40);
					botonVenta.setFont(new java.awt.Font("Segoe UI",0,26));
					botonVenta.setForeground(new java.awt.Color(0,0,0));
					botonVenta.setBackground(new java.awt.Color(192,192,192));
				}
				{
					botonPedido = new JButton();
					Panel1.add(botonPedido);
					botonPedido.setText("Pedido");
					botonPedido.setSize(165, 23);
					botonPedido.setPreferredSize(new java.awt.Dimension(164, 49));
					botonPedido.setFont(new java.awt.Font("Segoe UI",0,26));
				}
				{
					botonCamareros = new JButton();
					Panel1.add(botonCamareros);
					botonCamareros.setText("Camareros");
					botonCamareros.setPreferredSize(new java.awt.Dimension(162, 59));
					botonCamareros.setFont(new java.awt.Font("Segoe UI",0,26));
				}
				{
					botonProveedores = new JButton();
					Panel1.add(botonProveedores);
					botonProveedores.setText("Proveedores");
					botonProveedores.setPreferredSize(new java.awt.Dimension(157, 47));
					botonProveedores.setFont(new java.awt.Font("Segoe UI",0,26));
				}
				{
					botonCaja = new JButton();
					Panel1.add(botonCaja);
					botonCaja.setText("Caja");
					botonCaja.setFont(new java.awt.Font("Segoe UI",0,26));
				}
				{
					botonCerrar = new JButton();
					Panel1.add(botonCerrar);
					botonCerrar.setText("Cerrar");
					botonCerrar.setFont(new java.awt.Font("Segoe UI",0,26));
					botonCerrar.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("botonCerrar.mouseClicked, event="+evt);
							//TODO add your code for botonCerrar.mouseClicked
							System.exit(1);
						}
					});
				}
			}
			{
				jPanel1 = new JPanel();
				GridLayout jPanel1Layout = new GridLayout(2, 2);
				jPanel1Layout.setHgap(5);
				jPanel1Layout.setVgap(5);
				jPanel1Layout.setColumns(2);
				jPanel1Layout.setRows(2);
				jPanel1.setLayout(jPanel1Layout);
				getContentPane().add(jPanel1);
				jPanel1.setBounds(199, 6, 588, 549);
				jPanel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				{
					jButton1 = new JButton();
					jPanel1.add(jButton1);
					jButton1.setText("jButton1");
					jButton1.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("jButton1.mouseClicked, event="+evt);
							//TODO add your code for jButton1.mouseClicked
							new VVenta().setVisible(true);
				            setVisible(false);
						}
					});
				}
				{
					jButton2 = new JButton();
					jPanel1.add(jButton2);
					jButton2.setText("jButton2");
					jButton2.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("jButton2.mouseClicked, event="+evt);
							//TODO add your code for jButton2.mouseClicked
							new VVenta().setVisible(true);
				            setVisible(false);
						}
					});
				}
				{
					jButton3 = new JButton();
					jPanel1.add(jButton3);
					jButton3.setText("jButton3");
					jButton3.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("jButton3.mouseClicked, event="+evt);
							//TODO add your code for jButton3.mouseClicked
							new VVenta().setVisible(true);
				            setVisible(false);
						}
					});
				}
				{
					jButton4 = new JButton();
					jPanel1.add(jButton4);
					jButton4.setText("jButton4");
					jButton4.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("jButton4.mouseClicked, event="+evt);
							//TODO add your code for jButton4.mouseClicked
							new VVenta().setVisible(true);
				            setVisible(false);
						}
					});
				}
			}
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
