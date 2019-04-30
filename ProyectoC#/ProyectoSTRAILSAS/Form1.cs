using System;
using System.Collections.Generic;
using System.IO;
using System.Windows.Forms;

namespace ProyectoSTRAILSAS
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void limpiar()
        {
            comboBox1.SelectedIndex =-1;
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";
            comboBox2.SelectedIndex = -1;
            comboBox3.SelectedIndex = -1;
        }

        //-----BOTON AÑADIR
        private void button1_Click(object sender, EventArgs e)
        {            
            if (comboBox1.SelectedIndex==-1 || textBox1.Text=="" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || comboBox2.SelectedIndex == -1 || comboBox3.SelectedIndex == -1)
            {
                label7.Text = "Por Favor ingresa todos los campos.";
            }
            else
            {
                Persona p = new Persona();
                Conexion con = new Conexion();

                p.Tipodocumento = comboBox1.SelectedIndex + 1;
                p.Numdocumento = Convert.ToInt32(textBox1.Text);
                p.Apellidos = textBox2.Text;
                p.Nombres = textBox3.Text;
                DateTime fecha = new DateTime(Convert.ToInt32(textBox4.Text), comboBox3.SelectedIndex + 1, comboBox2.SelectedIndex + 1);
                p.Fechanacimiento = fecha;

                label7.Text = con.agregarPersona(p);
                limpiar();
            }           
        }

        //-----BOTON MODIFICAR
        private void button2_Click(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex == -1 || textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || comboBox2.SelectedIndex == -1 || comboBox3.SelectedIndex == -1)
            {
                label7.Text = "Por Favor ingresa todos los campos.";
            }
            else
            {
                Persona p = new Persona();
                Conexion con = new Conexion();

                p.Tipodocumento = comboBox1.SelectedIndex + 1;
                p.Numdocumento = Convert.ToInt32(textBox1.Text);
                p.Apellidos = textBox2.Text;
                p.Nombres = textBox3.Text;
                DateTime fecha = new DateTime(Convert.ToInt32(textBox4.Text), comboBox3.SelectedIndex + 1, comboBox2.SelectedIndex + 1);
                p.Fechanacimiento = fecha;

                label7.Text = con.editarPersona(p);
                limpiar();
            }
        }

        //-----BOTON BORRAR
        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                label7.Text = "Por Favor ingresa el número de documento de la persona.";
            }
            else
            {
                Conexion con = new Conexion();

                int p = Convert.ToInt32(textBox1.Text);
                label7.Text = con.borrarPersona(p);
                limpiar();
            }
        }

        //-----BOTON EXPORTAR
        private void button5_Click(object sender, EventArgs e)
        {
            SaveFileDialog save = new SaveFileDialog();
            save.Filter = "Archivos CSV (*.csv)|*.csv";
            if (save.ShowDialog() == DialogResult.OK && save.ToString() != " ")
            {             

                Conexion con = new Conexion();

                List<Persona> personas = new List<Persona>();

                personas = con.mostrarPersonas();

                StreamWriter w = new StreamWriter(save.FileName);

                foreach (var per in personas)
                {
                    string linea = per.imprimirPersona();
                    w.WriteLine(linea);                    
                }
                w.Close();
                label7.Text = "Datos exportados correctamente.";
            }
            else
            {
                label7.Text = "Por Favor Selecciona un archivo.";
            }
        }

        //-----BOTON IMPORTAR
        private void button4_Click(object sender, EventArgs e)
        {
            OpenFileDialog open = new OpenFileDialog();
            open.Filter = "Archivos CSV (*.csv)|*.csv";
                if (open.ShowDialog() == DialogResult.OK && open.ToString() != " ")
                {                
                    string[] lines = File.ReadAllLines(open.FileName);

                    for (int i = 0; i < lines.Length; i++)
                    {
                        string[] l = lines[i].Split(';');
                        Persona p = new Persona(Convert.ToInt32(l[0]), Convert.ToInt32(l[1]), l[2],l[3],Convert.ToDateTime(l[4]));

                        Conexion con = new Conexion();
                        con.agregarPersona(p);
                    }
                    label7.Text = "Datos importados correctamente.";
                }
                else
                {
                    label7.Text = "Por Favor Selecciona un archivo.";
                }
        }

        //-----RESTRINGIR SOLO DIGITOS PARA CAMPO FECHA NACIMIENTO
        private void textBox4_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsControl(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            {                
                e.Handled = true;
            }
        }

        //-----RESTRINGIR SOLO DIGITOS PARA CAMPO NUMERO DOCUMENTO
        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsControl(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
            }
        }

        //-----RESTRINGIR SOLO LETRAS PARA CAMPO APELLIDOS
        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsLetter(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsControl(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsSeparator(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
            }
        }

        //-----RESTRINGIR SOLO LETRAS PARA CAMPO NOMBRES
        private void textBox3_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsLetter(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsControl(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            if (Char.IsSeparator(e.KeyChar))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
