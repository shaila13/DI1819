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
    /// Lógica de interacción para VerMaterial.xaml
    /// </summary>
    public partial class VerMaterial : Window
    {
        public GestionNegocio gestionNegocio { get; set; }

        public VerMaterial(GestionNegocio gestionNegocio)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            DataGridListaMateriales.DataContext = gestionNegocio;//Debemos ponerlo siempre el útlimo.
        }

        /**
         * Permite modificar un material.
         */

        private void modifyMaterial_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridListaMateriales.SelectedIndex != -1)
            {
                Material mMaterial = (Material)DataGridListaMateriales.SelectedItem;
                AltaMaterial ap = new AltaMaterial(gestionNegocio, (Material)mMaterial.Clone(), DataGridListaMateriales.SelectedIndex);
                ap.Show();
            }

        }

        /**
         * Cerrar la ventana.
         */
        private void cancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
        /**
         * Permite borrar un material si no está en ninguna carrera.
         */
        private void deleteMaterial_Click(object sender, RoutedEventArgs e)
        {
            Boolean isEncontrado = false;

            if (DataGridListaMateriales.SelectedIndex != -1)
            {
                Material mMaterial = (Material)DataGridListaMateriales.SelectedItem;
                foreach (Carrera c in gestionNegocio.listaCarreras)
                {
      
                    if (c.ListaAvituallamientos.Count == 0 && !isEncontrado)
                    {
                        gestionNegocio.deleteMaterial(mMaterial);
                        MessageBox.Show("Se ha borrado " + mMaterial.Nombre);
                    }
                    else
                    {
                        foreach (Avituallamiento a in c.ListaAvituallamientos) {

                            if (a.ListaMateriales.Any(x => x.Nombre == mMaterial.Nombre))
                            {
                                MessageBox.Show("No se puede borrar el material porque pertenece a un avituallamiento.");
                                isEncontrado = true;
                            }
                            else
                            {
                                gestionNegocio.deleteMaterial(mMaterial);
                                MessageBox.Show("Se ha borrado " + mMaterial.Nombre);
                            }
                            
                        }
                     
                    }
     
                }

 
            
            }
            else
            {
                MessageBox.Show("Seleccione un material para borrar.");
            }




        }
    }
}
