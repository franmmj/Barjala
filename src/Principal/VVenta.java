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
public class VVenta extends javax.swing.JFrame {
	private JPanel Panel1;
	private JButton botonVenta;
	private JButton ocho;
	private JButton nueve;
	private JButton total;
	private JButton jButton24;
	private JButton jButton23;
	private JButton jButton22;
	private JButton jButton21;
	private JButton jButton20;
	private JButton jButton19;
	private JButton jButton18;
	private JButton jButton17;
	private JButton jButton16;
	private JButton jButton15;
	private JButton jButton14;
	private JButton jButton13;
	private JButton jButton12;
	private JButton jButton11;
	private JButton jButton10;
	private JButton jButton9;
	private JButton jButton8;
	private JButton jButton7;
	private JButton jButton6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JTable Tabla;
	private JButton ce;
	private JButton cero;
	private JPanel panel6;
	private JButton menos;
	private JButton borrar;
	private JButton tres;
	private JButton dos;
	private JButton uno;
	private JButton seis;
	private JButton cinco;
	private JButton cuatro;
	private JPanel Panel2;
	private JPanel Panel3;
	private JButton siete;
	private JPanel Panel5;
	private JTextField Pantalla;
	private JPanel Panel4;
	private JButton botonCerrar;
	private JButton botonCaja;
	private JButton botonProveedores;
	private JButton botonCamareros;
	private JButton botonPedido;

	/**
	* Auto-generated main method to display this JFrame
	*/
/*	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Venta inst = new Venta();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public VVenta() {
		super();
		initGUI();
	}
	public String c="";	
	public void initGUI() {
	
		try {
			getContentPane().setLayout(null);
			this.setTitle("Tpv BarJala Venta");
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
				Panel1.setBackground(new java.awt.Color(239,107,69));
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
					botonCamareros.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("botonCamareros.mouseClicked, event="+evt);
							//TODO add your code for botonCamareros.mouseClickedisi
							new VCamarero().setVisible(true);
				            setVisible(false);
							//Camarero.setVisible(true);
							//Venta.setVisible(false);
							 
						}
					});
				}
				{
					botonProveedores = new JButton();
					Panel1.add(botonProveedores);
					botonProveedores.setText("Proveedores");
					botonProveedores.setPreferredSize(new java.awt.Dimension(157, 47));
					botonProveedores.setFont(new java.awt.Font("Segoe UI",0,26));
					botonProveedores.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							System.out.println("botonProveedores.mouseClicked, event="+evt);
							//TODO add your code for botonProveedores.mouseClicked
							new VProveedor().setVisible(true);
				            setVisible(false);
						}
					});
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
							new VLogin().setVisible(true);
				            setVisible(false);
						
						}
					});
				}
			}
			{
				Panel2 = new JPanel();
				GridLayout Panel2Layout = new GridLayout(4, 6);
				Panel2Layout.setHgap(5);
				Panel2Layout.setVgap(5);
				Panel2Layout.setColumns(6);
				Panel2Layout.setRows(4);
				Panel2.setLayout(Panel2Layout);
				getContentPane().add(Panel2);
				Panel2.setBounds(199, 6, 589, 267);
				Panel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				Panel2.setBackground(new java.awt.Color(239,107,69));
				{
					jButton1 = new JButton();
					Panel2.add(jButton1);
					jButton1.setText("jButton1");
				}
				{
					jButton2 = new JButton();
					Panel2.add(jButton2);
					jButton2.setText("jButton2");
				}
				{
					jButton3 = new JButton();
					Panel2.add(jButton3);
					jButton3.setText("jButton3");
				}
				{
					jButton4 = new JButton();
					Panel2.add(jButton4);
					jButton4.setText("jButton4");
				}
				{
					jButton5 = new JButton();
					Panel2.add(jButton5);
					jButton5.setText("jButton5");
				}
				{
					jButton6 = new JButton();
					Panel2.add(jButton6);
					jButton6.setText("jButton6");
				}
				{
					jButton7 = new JButton();
					Panel2.add(jButton7);
					jButton7.setText("jButton7");
				}
				{
					jButton8 = new JButton();
					Panel2.add(jButton8);
					jButton8.setText("jButton8");
				}
				{
					jButton9 = new JButton();
					Panel2.add(jButton9);
					jButton9.setText("jButton9");
				}
				{
					jButton10 = new JButton();
					Panel2.add(jButton10);
					jButton10.setText("jButton10");
				}
				{
					jButton11 = new JButton();
					Panel2.add(jButton11);
					jButton11.setText("jButton11");
				}
				{
					jButton12 = new JButton();
					Panel2.add(jButton12);
					jButton12.setText("jButton12");
				}
				{
					jButton13 = new JButton();
					Panel2.add(jButton13);
					jButton13.setText("jButton13");
				}
				{
					jButton14 = new JButton();
					Panel2.add(jButton14);
					jButton14.setText("jButton14");
				}
				{
					jButton15 = new JButton();
					Panel2.add(jButton15);
					jButton15.setText("jButton15");
				}
				{
					jButton16 = new JButton();
					Panel2.add(jButton16);
					jButton16.setText("jButton16");
				}
				{
					jButton17 = new JButton();
					Panel2.add(jButton17);
					jButton17.setText("jButton17");
				}
				{
					jButton18 = new JButton();
					Panel2.add(jButton18);
					jButton18.setText("jButton18");
				}
				{
					jButton19 = new JButton();
					Panel2.add(jButton19);
					jButton19.setText("jButton19");
				}
				{
					jButton20 = new JButton();
					Panel2.add(jButton20);
					jButton20.setText("jButton20");
				}
				{
					jButton21 = new JButton();
					Panel2.add(jButton21);
					jButton21.setText("jButton21");
				}
				{
					jButton22 = new JButton();
					Panel2.add(jButton22);
					jButton22.setText("jButton22");
				}
				{
					jButton23 = new JButton();
					Panel2.add(jButton23);
					jButton23.setText("jButton23");
				}
				{
					jButton24 = new JButton();
					Panel2.add(jButton24);
					jButton24.setText("jButton24");
				}
			}
			{
				Panel3 = new JPanel();
				FlowLayout Panel3Layout = new FlowLayout();
				Panel3.setLayout(Panel3Layout);
				getContentPane().add(Panel3);
				Panel3.setBounds(199, 279, 295, 276);
				Panel3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				Panel3.setBackground(new java.awt.Color(239,107,69));
				{
					Pantalla = new JTextField();
					Panel3.add(Pantalla);
					Pantalla.setHorizontalAlignment(4);
					Pantalla.setPreferredSize(new java.awt.Dimension(284, 30));
					Pantalla.setBorder(BorderFactory.createCompoundBorder(
							null, 
							null));
					Pantalla.setBackground(new java.awt.Color(255,255,255));
					Pantalla.setCaretColor(new java.awt.Color(255,255,255));
				}
				{
					Panel5 = new JPanel();
					GridLayout Panel5Layout = new GridLayout(3, 4);
					Panel5Layout.setHgap(5);
					Panel5Layout.setVgap(5);
					Panel5Layout.setColumns(4);
					Panel5Layout.setRows(3);
					Panel5.setLayout(Panel5Layout);
					Panel3.add(Panel5);
					Panel5.setPreferredSize(new java.awt.Dimension(279, 171));
					{
						siete = new JButton();
						Panel5.add(siete);
						siete.setText("7");
						siete.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("siete.mouseClicked, event="+evt);
								//TODO add your code for siete.mouseClicked
								c=Pantalla.getText();
								c=c+"7";
								Pantalla.setText(c);
							}
						});

					}
					{
						ocho = new JButton();
						Panel5.add(ocho);
						ocho.setText("8");
						ocho.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("ocho.mouseClicked, event="+evt);
								//TODO add your code for ocho.mouseClicked
								c=Pantalla.getText();
								c=c+"8";
								Pantalla.setText(c);
							}
						});
					}
					{
						nueve = new JButton();
						Panel5.add(nueve);
						nueve.setText("9");
						nueve.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("nueve.mouseClicked, event="+evt);
								//TODO add your code for nueve.mouseClicked
								c=Pantalla.getText();
								c=c+"9";
								Pantalla.setText(c);
							}
						});
					}
					{
						borrar = new JButton();
						Panel5.add(borrar);
						borrar.setText("C");
						borrar.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("borrar.mouseClicked, event="+evt);
								//TODO add your code for borrar.mouseClicked
								c=Pantalla.getText();
								c="";
								Pantalla.setText(c);
							}
						});
					}
					{
						cuatro = new JButton();
						Panel5.add(cuatro);
						cuatro.setText("4");
						cuatro.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("cuatro.mouseClicked, event="+evt);
								//TODO add your code for cuatro.mouseClicked
								c=Pantalla.getText();
								c=c+"4";
								Pantalla.setText(c);
							}
						});
					}
					{
						cinco = new JButton();
						Panel5.add(cinco);
						cinco.setText("5");
						cinco.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("cinco.mouseClicked, event="+evt);
								//TODO add your code for cinco.mouseClicked
								c=Pantalla.getText();
								c=c+"5";
								Pantalla.setText(c);
							}
						});
					}
					{
						seis = new JButton();
						Panel5.add(seis);
						seis.setText("6");
						seis.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("seis.mouseClicked, event="+evt);
								//TODO add your code for seis.mouseClicked
								c=Pantalla.getText();
								c=c+"6";
								Pantalla.setText(c);
							}
						});
					}
					{
						menos = new JButton();
						Panel5.add(menos);
						menos.setText("-");
						menos.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("menos.mouseClicked, event="+evt);
								//TODO add your code for menos.mouseClicked
								c=Pantalla.getText();
								c="-"+c;
								Pantalla.setText(c);
							}
						});
					}
					{
						uno = new JButton();
						Panel5.add(uno);
						uno.setText("1");
						uno.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("uno.mouseClicked, event="+evt);
								//TODO add your code for uno.mouseClicked
								c=Pantalla.getText();
								c=c+"1";
								Pantalla.setText(c);
							}
						});
					}
					{
						dos = new JButton();
						Panel5.add(dos);
						dos.setText("2");
						dos.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("dos.mouseClicked, event="+evt);
								//TODO add your code for dos.mouseClicked
								c=Pantalla.getText();
								c=c+"2";
								Pantalla.setText(c);
							}
						});
					}
					{
						tres = new JButton();
						Panel5.add(tres);
						tres.setText("3");
						tres.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("tres.mouseClicked, event="+evt);
								//TODO add your code for tres.mouseClicked
								c=Pantalla.getText();
								c=c+"3";
								Pantalla.setText(c);
							}
						});
					}
					{
						ce = new JButton();
						Panel5.add(ce);
						ce.setText("CE");
						ce.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("ce.mouseClicked, event="+evt);
								//TODO add your code for ce.mouseClicked
								c=Pantalla.getText();
								c="";
								Pantalla.setText(c);
							}
						});
					}
				}
				{
					panel6 = new JPanel();
					GridLayout panel6Layout = new GridLayout(1, 2);
					panel6Layout.setHgap(5);
					panel6Layout.setVgap(5);
					panel6Layout.setColumns(2);
					panel6.setLayout(panel6Layout);
					Panel3.add(panel6);
					panel6.setPreferredSize(new java.awt.Dimension(275, 51));
					{
						cero = new JButton();
						panel6.add(cero);
						cero.setText("0");
						cero.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								System.out.println("cero.mouseClicked, event="+evt);
								//TODO add your code for cero.mouseClicked
								c=Pantalla.getText();
								c=c+"0";
								Pantalla.setText(c);
							}
						});
					}
					{
						total = new JButton();
						panel6.add(total);
						total.setText("Total");
					}
				}
			}
			{
				Panel4 = new JPanel();
				getContentPane().add(Panel4);
				Panel4.setBounds(500, 279, 288, 276);
				Panel4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				Panel4.setBackground(new java.awt.Color(239,107,69));
				{	
					TableModel TablaModel = 
						new DefaultTableModel(
								new String[][] { { "Cantidad", "Producto", "Precio", "Subtotal" } },
								new String[] { "Cantidad", "Producto", "Precio", "Subtotal" });
					Tabla = new JTable();
					TableLayout TablaLayout1 = new TableLayout(new double[][] {{TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL}, {TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL}});
					TablaLayout1.setHGap(4);
					TablaLayout1.setVGap(4);
					GridBagLayout TablaLayout = new GridBagLayout();
					TablaLayout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
					TablaLayout.rowHeights = new int[] {7, 7, 7, 7};
					TablaLayout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
					TablaLayout.columnWidths = new int[] {7, 7, 7, 7};
					Tabla.setLayout(TablaLayout1);
					Panel4.add(Tabla);
					Tabla.setModel(TablaModel);
					Tabla.setPreferredSize(new java.awt.Dimension(267, 263));
					Tabla.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
					Tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					Tabla.setAutoCreateColumnsFromModel(false);
					Tabla.setBackground(new java.awt.Color(241,236,126));
				}
			}
			this.setSize(800, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
