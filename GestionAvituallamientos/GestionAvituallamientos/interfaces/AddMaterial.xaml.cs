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
    /// Lógica de interacción para AddMaterial.xaml
    /// </summary>
    public partial class AddMaterial : Window
    {
        public GestionNegocio gestionNegocio { get; set; }
        public Avituallamiento avituallamiento { get; set; }

        public AddMaterial(GestionNegocio gestionNegocio, Avituallamiento avituallamiento)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            this.avituallamiento = avituallamiento;
            DataGridMaterialesParaAvituallamiento.DataContext = gestionNegocio;

        }

        private void DataGridMateriales(object sender, SelectionChangedEventArgs e)
        {
            if (DataGridMaterialesParaAvituallamiento.SelectedIndex != -1)
            {
                Material material = (Material)DataGridMaterialesParaAvituallamiento.SelectedItem;
                txMaterial.Content = material.Nombre;
   
            }
        }

        private void cancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
        private void BtnAdd_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridMaterialesParaAvituallamiento.SelectedIndex != -1)
            {
                Material material = (Material)DataGridMaterialesParaAvituallamiento.SelectedItem;
                int cantidadAaniadir = Convert.ToInt32(BoxCantidadRetirar.Text);
                Material materialAddAvituallamiento = new Material(material.Nombre, material.Tipo, material.Precio, cantidadAaniadir);
                gestionNegocio.retirarMaterial(materialAddAvituallamiento, avituallamiento);
                MessageBox.Show("Se ha añadido " + materialAddAvituallamiento.Nombre);
            }
            else
            {
                MessageBox.Show("Seleccione un material.");
            }
        }
    }
}
