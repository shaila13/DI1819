using GestionAvituallamientos.interfaces;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace GestionAvituallamientos
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public GestionNegocio gestionNegocio;

        public MainWindow()
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            gestionNegocio= new GestionNegocio();
            DataGridListaCarreras.DataContext = gestionNegocio;//Debemos ponerlo siempre el útlimo.

        }

        private void addMaterial_Click(object sender, RoutedEventArgs e)
        {
            AltaMaterial irNuevoMaterial = new AltaMaterial(gestionNegocio);
            irNuevoMaterial.Show();
        }

        private void showMaterial_Click(object sender, RoutedEventArgs e)
        {
            VerMaterial irVerMaterial = new VerMaterial(gestionNegocio);
            irVerMaterial.Show();
        }


        private void btNewCarrera_Click(object sender, RoutedEventArgs e)
        {
            AltaCarrera altaCarrera = new AltaCarrera(gestionNegocio);
            altaCarrera.Show();
        }

        private void btModifyCarrera_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridListaCarreras.SelectedIndex != -1)
            {
                Carrera cCarrera = (Carrera)DataGridListaCarreras.SelectedItem;
                AltaCarrera altaCarrera = new AltaCarrera(gestionNegocio, (Carrera)cCarrera.Clone(), DataGridListaCarreras.SelectedIndex);
                altaCarrera.Show();
            }


        }

        private void btDeleteCarrera_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridListaCarreras.SelectedIndex != -1)
            {
                Carrera cCarrera = (Carrera)DataGridListaCarreras.SelectedItem;
                gestionNegocio.deleteCarrera(cCarrera);
            }

        }

        private void btSeeCarrera_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridListaCarreras.SelectedIndex != -1)
            {
                Carrera cCarrera = (Carrera)DataGridListaCarreras.SelectedItem;
                VerAvituallamientos altaAvituallamiento = new VerAvituallamientos(gestionNegocio, cCarrera);
                
                //AltaAvituallamiento altaAvituallamiento = new AltaAvituallamiento(gestionNegocio, (Carrera)cCarrera.Clone(), DataGridListaCarreras.SelectedIndex);
                altaAvituallamiento.Show();
            }
        }


    }
}
