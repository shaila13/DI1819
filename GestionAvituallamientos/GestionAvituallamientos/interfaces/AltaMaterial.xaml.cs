using GestionAvituallamientos.logica;
using GestionAvituallamientos.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
    /// Lógica de interacción para AltaMaterial.xaml
    /// </summary>
    public partial class AltaMaterial : Window
    {
        public GestionNegocio gestionNegocio { get; set; }
        public Material material { get; set; }
        public List<String> listaTiposMaterial { get; set; } //OJO
        private int p;
        private Boolean modificar;
        private int errores;
        /**
         * Alta nuevo material.
         */
        public AltaMaterial(GestionNegocio gestionNegocio)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            listaTiposMaterial = new List<string>() { "Bebida", "Comida", "Barritas", "Geles", "Material sanitario" };//OJO
            modificar = false;
            this.material = new Material();
            comboxTipoProducto.DataContext = this;
            this.DataContext = this;//Poner siempre lo último para que lo que vayamos a usar ya esté instanciado
        }

        /**
          * Modificar material.
          */
        public AltaMaterial(GestionNegocio gestionNegocio, Material material, int posicion)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            this.material = material.Clone() as Material;
            this.p = posicion;
            listaTiposMaterial = new List<string>() { "Bebida", "Comida", "Barritas", "Geles", "Material sanitario" };//OJO
            modificar = true;
            comboxTipoProducto.DataContext = this;
            this.DataContext = this;
        }

        private void addMaterial(object sender, RoutedEventArgs e)
        {

            if (modificar)
            {
                gestionNegocio.modifyMaterial(material, p);
                MessageBox.Show("Modificación realizada con éxito.");
            }
            else
            {
 
               gestionNegocio.addMaterial(material);//aqui me da el nullpoint

                MessageBox.Show("Operación realizada con éxito.");
            }
            this.Close();
        }

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
                errores++;
            else
                errores--;

            if (errores == 0)
                AddMaterial.IsEnabled = true;
            else
                AddMaterial.IsEnabled = false;

        }

        private void Cancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
