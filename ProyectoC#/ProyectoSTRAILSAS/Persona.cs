using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoSTRAILSAS
{
    class Persona
    {
        private int tipodocumento;
        private int numdocumento;
        private string apellidos;
        private string nombres;
        private DateTime fechanacimiento;

        //CONSTRUCTOR VACIO
        public Persona()
        {

        }

        //CONSTRUCTOR CON ARGUMENTOS
        public Persona(int tipodoc, int numdoc, string apellidos, string nombres, DateTime fechanacimiento)
        {
            this.tipodocumento = tipodoc;
            this.numdocumento = numdoc;
            this.apellidos = apellidos;
            this.nombres = nombres;
            this.Fechanacimiento = fechanacimiento;
        }

        public int Tipodocumento
        {
            get
            {
                return tipodocumento;
            }

            set
            {
                tipodocumento = value;
            }
        }

        public int Numdocumento
        {
            get
            {
                return numdocumento;
            }

            set
            {
                numdocumento = value;
            }
        }

        public string Apellidos
        {
            get
            {
                return apellidos;
            }

            set
            {
                apellidos = value;
            }
        }

        public string Nombres
        {
            get
            {
                return nombres;
            }

            set
            {
                nombres = value;
            }
        }

        public DateTime Fechanacimiento
        {
            get
            {
                return fechanacimiento;
            }

            set
            {
                fechanacimiento = value;
            }
        }

        public string imprimirPersona()
        {
            string persona = this.tipodocumento.ToString() + ";" + this.numdocumento.ToString() + ";" + this.apellidos + ";" + this.nombres + ";" + this.fechanacimiento.ToShortDateString();
            return persona;
        }
                
    }
}
