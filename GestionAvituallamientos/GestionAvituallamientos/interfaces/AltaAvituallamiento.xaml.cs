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
    /// Lógica de interacción para AltaAvituallamiento.xaml
    /// </summary>
    public partial class AltaAvituallamiento : Window
    {
        public GestionNegocio gestionNegocio { get; set; }
        public Avituallamiento avituallamiento { get; set; }
        public Carrera carrera { get; set; }
        public PersonaContacto personaContacto { get; set; }
        private Boolean modificar = false;
        private int posicion = -1;
        private int errores = 0;


        public AltaAvituallamiento(GestionNegocio gestionNegocio, Carrera carrera)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            TbNombreCarrera.IsReadOnly = true;
            this.carrera = carrera;
            this.gestionNegocio = gestionNegocio;
            this.avituallamiento = new Avituallamiento();
            this.personaContacto = new PersonaContacto();
            this.modificar = false;
            this.DataContext = this;
            DataGridMaterialesAvituallamiento.DataContext = avituallamiento;
        }


        public AltaAvituallamiento(GestionNegocio gestionNegocio, Carrera carrera,int posicion)
        {
            InitializeComponent();
            WindowStartupLocation = System.Windows.WindowStartupLocation.CenterScreen;
            btAddAvituallamiento.Content = "Modificar Avituallamiento";
            this.carrera = carrera;
            this.posicion = posicion;
            this.gestionNegocio = gestionNegocio;
            this.modificar = true;
            TbNombreCarrera.IsReadOnly = true;
            this.avituallamiento = carrera.ListaAvituallamientos[posicion].Clone() as Avituallamiento;
            this.personaContacto = carrera.ListaAvituallamientos[posicion].PersonaContacto.Clone() as PersonaContacto;
            this.DataContext = this;
            DataGridMaterialesAvituallamiento.DataContext = avituallamiento;

        }


        private void btAddMaterial_Click(object sender, RoutedEventArgs e)
        {
            
            AddMaterial addMaterial = new AddMaterial(gestionNegocio, avituallamiento);
            addMaterial.Show();

        }

        private void btAddAvituallamiento_Click(object sender, RoutedEventArgs e)
        {


            if (modificar)
            {
                avituallamiento.NombreCarrera = carrera.NombreCarrera;
                avituallamiento.PersonaContacto = personaContacto;

                carrera.ListaAvituallamientos[posicion] = avituallamiento;
                MessageBox.Show("Avituallamiento modificado");
            }
            else

            {
                avituallamiento.NombreCarrera = carrera.NombreCarrera;
                avituallamiento.PersonaContacto = personaContacto;

                if (gestionNegocio.listaPersonasContacto.Any(x => x.NombrePersonaContacto == personaContacto.NombrePersonaContacto 
                    && x.TelefonoPersonaContacto == personaContacto.TelefonoPersonaContacto))

                {
                    MessageBox.Show("La persona ya se encuentra en otro avituallamiento o carrera, elija a otra persona.");

                }else if(carrera.ListaAvituallamientos.Any(x => x.PuntoKilometrico == Convert.ToInt32(BoxPuntoKilometrico.Text))){
                   MessageBox.Show("Ya hay un avituallamiento en es punto kilométrico.");

                }else{
                        //Añado la persona a la lista de contactos para comprobaciones
                        gestionNegocio.addPerson(personaContacto);
                        carrera.ListaAvituallamientos.Add(avituallamiento);
                        MessageBox.Show("Avituallamiento creado");
                        this.Close();
                }


                }

            }
   

        

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
                errores++;
            else
                errores--;

            if (errores == 0)
                btAddAvituallamiento.IsEnabled = true;
            else
                btAddAvituallamiento.IsEnabled = false;

        }

        private void btCancel_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

    }
}
