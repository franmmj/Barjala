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
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
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
public class Proveedor extends javax.swing.JFrame {
	private JPanel Panel1;
	private JButton botonVenta;
	private JButton botonCerrar;
	private JButton botonCaja;
	private JButton botonProveedores;
	private JButton botonCamareros;
	private JButton botonPedido;
	private JPanel Lista;
	private JPanel jPanel1;
	private JTextField boxCif;
	private JLabel direccion;
	private JButton eliminarProveedor;
	private JButton guardarProveedor;
	private JTextField boxCorreo;
	private JLabel correo;
	private JTextField boxTelefono;
	private JLabel telefono;
	private JTextField boxContacto;
	private JLabel contacto;
	private JTextField boxCp;
	private JLabel cp;
	private JTextField boxDireccion;
	private JTextField boxNombre;
	private JLabel nombre;
	private JLabel cif;
	private JTable Tabla;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Proveedor inst = new Proveedor();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Proveedor() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			this.setTitle("Tpv BarJala Proveedor");
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
					botonCerrar.setText("Volver");
					botonCerrar.setFont(new java.awt.Font("Segoe UI",0,26));
					botonCerrar.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("botonCerrar.mouseClicked, event="+evt);
							//TODO add your code for botonCerrar.mouseClicked
							new Venta().setVisible(true);
				            setVisible(false);
						}
					});
				}
			}
			{
				Lista = new JPanel();
				getContentPane().add(Lista);
				Lista.setBounds(199, 6, 583, 175);
				Lista.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				{
					TableModel TablaModel = 
						new DefaultTableModel(
								new String[][] { { "Nombre", "Contacto", "Telefono" } },
								new String[] { "One", "Two", "Three" });
					Tabla = new JTable();
					Lista.add(Tabla);
					Tabla.setModel(TablaModel);
					Tabla.setPreferredSize(new java.awt.Dimension(569, 165));
				}
			}
			{
				jPanel1 = new JPanel();
				GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
				jPanel1.setLayout(jPanel1Layout);
				getContentPane().add(jPanel1);
				jPanel1.setBounds(193, 187, 583, 368);
				jPanel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				{
					cif = new JLabel();
					cif.setText("CIF: ");
				}
				{
					boxCif = new JTextField();
				}
				{
					nombre = new JLabel();
					nombre.setText("Nombre: ");
				}
				{
					boxNombre = new JTextField();
				}
				{
					direccion = new JLabel();
					direccion.setText("Dirección: ");
				}
				{
					boxDireccion = new JTextField();
				}
				{
					cp = new JLabel();
					cp.setText("C.P.: ");
				}
				{
					boxCp = new JTextField();
				}
				{
					contacto = new JLabel();
					contacto.setText("Persona de Contacto: ");
				}
				{
					boxContacto = new JTextField();
				}
				{
					telefono = new JLabel();
					telefono.setText("Telefono: ");
				}
				{
					boxTelefono = new JTextField();
				}
				{
					correo = new JLabel();
					correo.setText("E-mail: ");
				}
				{
					boxCorreo = new JTextField();
				}
				{
					guardarProveedor = new JButton();
					guardarProveedor.setText("Guardar");
				}
				{
					eliminarProveedor = new JButton();
					eliminarProveedor.setText("Eliminar");
				}
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					        .addComponent(contacto, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					        .addGap(153))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					        .addGroup(jPanel1Layout.createParallelGroup()
					            .addComponent(cp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					                .addComponent(cif, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					                .addGap(9)))
					        .addComponent(boxCif, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					        .addGap(15))
					    .addGroup(jPanel1Layout.createSequentialGroup()
					        .addGroup(jPanel1Layout.createParallelGroup()
					            .addComponent(direccion, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					                .addComponent(nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                .addGap(12))
					            .addComponent(telefono, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					            .addComponent(correo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					        .addGap(12)
					        .addGroup(jPanel1Layout.createParallelGroup()
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					                .addComponent(boxCp, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					                .addComponent(boxContacto, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					                .addGap(12))
					            .addComponent(boxNombre, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					            .addComponent(boxDireccion, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					            .addComponent(boxTelefono, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					            .addComponent(boxCorreo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					                .addGap(32)
					                .addComponent(guardarProveedor, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					                .addGap(55)))))
					.addComponent(eliminarProveedor, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(177, Short.MAX_VALUE));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxCif, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(cif, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxNombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(nombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxDireccion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(direccion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxCp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(cp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxContacto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(contacto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxTelefono, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(telefono, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(boxCorreo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(correo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(guardarProveedor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					    .addComponent(eliminarProveedor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, 61));
			}
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
