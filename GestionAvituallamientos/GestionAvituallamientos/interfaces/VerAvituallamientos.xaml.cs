using GestionAvituallamientos.logica;
using GestionAvituallamientos.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace GestionAvituallamientos.interfaces
{
    /// <summary>
    /// Lógica de interacción para VerAvituallamientos.xaml
    /// </summary>
    public partial class VerAvituallamientos : Window
    {
        public GestionNegocio gestionNegocio { get; set; }
        public Carrera carrera { get; set; }

        public VerAvituallamientos(GestionNegocio gestionNegocio, Carrera carrera)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.carrera = carrera;            
            this.gestionNegocio = gestionNegocio;
            DataGridListaAvituallamientos.DataContext = carrera;//Debemos ponerlo siempre el útlimo.
        }


        /**
         * Cerrar la ventana.
         */
        private void cancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        /**
         * Permite borrar un avituallamiento
         */
        private void deleteAvituallamiento_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridListaAvituallamientos.SelectedIndex != -1)
            {
                Avituallamiento avituallamiento = (Avituallamiento)DataGridListaAvituallamientos.SelectedItem;
                carrera.ListaAvituallamientos.Remove(avituallamiento);
                MessageBox.Show("Se ha borrado el avituallamiento.");
            }
            else
            {
                MessageBox.Show("Seleccione un avituallamiento para borrar.");
            }

        }

    /**
     * Permite modificar un material.
     */
        private void modifyAvituallamiento_Click(object sender, RoutedEventArgs e)
        {     
            if (DataGridListaAvituallamientos.SelectedIndex != -1)
            {
                 Avituallamiento avituallamiento = (Avituallamiento)DataGridListaAvituallamientos.SelectedItem;
                 Avituallamiento avituallamientoModificar = avituallamiento.Clone() as Avituallamiento;
                 AltaAvituallamiento ap = new AltaAvituallamiento(gestionNegocio, carrera, DataGridListaAvituallamientos.SelectedIndex);
                ap.Show();
            }
            else
            {
                MessageBox.Show("Seleccione un elemento.");
            }
        }

        private void createAvituallamiento_Click(object sender, RoutedEventArgs e)
        {
           
            AltaAvituallamiento ap = new AltaAvituallamiento(gestionNegocio,carrera);
            ap.Show();

        }

    }
}
