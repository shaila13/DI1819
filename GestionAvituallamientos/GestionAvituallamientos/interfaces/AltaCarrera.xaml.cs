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
    /// Lógica de interacción para AltaCarrera.xaml
    /// </summary>
    public partial class AltaCarrera : Window
    {
        public GestionNegocio gestionNegocio { get; set; }
        public Carrera carrera { get; set; }
        private Boolean modificar;
        private int posicion;


        public AltaCarrera(GestionNegocio gestionNegocio)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            carrera = new Carrera();
            this.DataContext = carrera;
            modificar = false;
        }

        public AltaCarrera(GestionNegocio gestionNegocio, Carrera carrera, int posicion)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            this.carrera = carrera;
            this.posicion = posicion;
            modificar = true;
            this.DataContext = carrera;
        }


        public AltaCarrera(GestionNegocio gestionNegocio, Carrera carrera, int posicion, int consultar)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            this.gestionNegocio = gestionNegocio;
            this.carrera = carrera;

            this.posicion = posicion;
            this.modificar = false;
            AddCarrera.Visibility = Visibility.Hidden;
            this.DataContext = carrera;

        }
        private void AddCarrera_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                gestionNegocio.modifyCarrera(carrera, posicion);
            }
            else
            {

                if (gestionNegocio.listaCarreras.Any(x => x.NombreCarrera == carrera.NombreCarrera))
                        {
                            MessageBox.Show("La carrera ya existe.");
                        }
                        else
                        {
                            gestionNegocio.addCarrera(carrera);
                            this.Close();
                        }
                

            }


        }

        private void btCancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

    }
}

