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
using WpfApplicationVideo3.dto;

namespace WpfApplicationVideo3
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            List<Persona> listaPersonas = new List<Persona>();
            listaPersonas.Add(new Persona("Shaila", "Pérez"));
            listaPersonas.Add(new Persona("Igar", "Sánchez"));

            foreach (Persona persona in listaPersonas)
            {
                ComboBoxItem cbi = new ComboBoxItem();
                cbi.Content = persona;
                comBoxPersonas.Items.Add(cbi);


            }



        }

        private void comBoxPersonas_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem cbi = (ComboBoxItem)comBoxPersonas.SelectedItem;
            Persona persona = (Persona)cbi.Content;

            listBoxPersonas.Items.Add(persona);
            

        }

    }
}

