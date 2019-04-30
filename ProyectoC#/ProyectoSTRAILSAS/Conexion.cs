using MySql.Data.MySqlClient;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoSTRAILSAS
{
    class Conexion
    {
        string msg; 

        private string conexion = "datasource=127.0.0.1;port=3306;username=root;password=1234567890;database=DBPERSONAS;";
        string query;        

        public string agregarPersona(Persona p)
        {
            string fecha = p.Fechanacimiento.ToString("yyyy/MM/dd");

            query = "INSERT INTO Personas (tipo_documento, numero_documento, apellidos, nombres, fecha_nacimiento) " +
                "VALUES ('" + p.Tipodocumento + "'," + "'" + p.Numdocumento + "'," + "'" + p.Apellidos + "'," + "'"
                + p.Nombres + "'," + "'" + fecha + "');";

            MySqlConnection databaseConnection = new MySqlConnection(conexion);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;

            try
            {
                databaseConnection.Open();
                MySqlDataReader myReader = commandDatabase.ExecuteReader();
                databaseConnection.Close();

                msg = "Usuario insertado satisfactoriamente";
                return msg;

            }
            catch (Exception ex)
            {
                msg = ex.Message;
                return msg;
            }
        }

        public string editarPersona(Persona p)
        {
            string fecha = p.Fechanacimiento.ToString("yyyy/MM/dd");

            query = "UPDATE Personas SET tipo_documento = '"+ p.Tipodocumento + "', apellidos ='" + p.Apellidos + "', nombres ='"+ p.Nombres + "', fecha_nacimiento='"+ fecha + "' WHERE numero_documento = '" + p.Numdocumento + "';";

            MySqlConnection databaseConnection = new MySqlConnection(conexion);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            MySqlDataReader reader;

            try
            {
                databaseConnection.Open();
                reader = commandDatabase.ExecuteReader();
                databaseConnection.Close();

                msg = "Usuario actualizado satisfactoriamente";
                return msg;
            }
            catch (Exception ex)
            {
                msg = ex.Message;
                return msg;
            }
        }

        public string borrarPersona (int p)
        {
            query = "DELETE FROM Personas WHERE numero_documento = " + "'" + p + "';";

            MySqlConnection databaseConnection = new MySqlConnection(conexion);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            MySqlDataReader reader;

            try
            {
                databaseConnection.Open();
                reader = commandDatabase.ExecuteReader();
                databaseConnection.Close();

                msg = "Usuario eliminado satisfactoriamente";
                return msg;
            }
            catch (Exception ex)
            {
                msg = ex.Message;
                return msg;
            }
        }

        public List<Persona> mostrarPersonas()
        {
            query = "SELECT * FROM Personas";

            List<Persona> personas = new List<Persona>();

            MySqlConnection databaseConnection = new MySqlConnection(conexion);
            MySqlCommand commandDatabase = new MySqlCommand(query, databaseConnection);
            commandDatabase.CommandTimeout = 60;
            MySqlDataReader reader;

            try
            {
                databaseConnection.Open();
                reader = commandDatabase.ExecuteReader();

                if (reader.HasRows)
                {
                    while (reader.Read())
                    {
                        Persona p = new Persona(reader.GetInt32(0), reader.GetInt32(1), reader.GetString(2), reader.GetString(3), reader.GetDateTime(4));
                        personas.Add(p);
                    }
                    databaseConnection.Close();
                    return personas;
                }
                else
                {
                    databaseConnection.Close();
                    return null;
                }                
            }
            catch (Exception ex)
            {
                return null;
            }
        }
    }
}
