using ApplicationVideo7.dto;
using ApplicationVideo7.logica;
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

namespace ApplicationVideo7
{
    /// <summary>
    /// Lógica de interacción para DialogoLibro.xaml
    /// </summary>
    public partial class DialogoLibro : Window
    {
        private LogicaNegocio logicaNegocio;
        public Libro libro;
        private int posicion;//inicializamos por defecto a -1, porque se inicializa todo a 0 que es una posición 
        private Boolean modificar;
        private int errores;

        public DialogoLibro(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            libro= new Libro();
            this.modificar = false;
            this.DataContext = libro;
        }
        public DialogoLibro(LogicaNegocio logicaNegocio, Libro libroModificar, int posicion)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            this.libro = libroModificar;
            this.posicion = posicion;      
            this.modificar = true;
            this.DataContext = libro;
        }
        private void ButtonAceptar_Click(object sender, RoutedEventArgs e)
        {
            //logicaNegocio.aniadirLibros(libro);
            //libro = new Libro();
            //this.DataContext = libro; No se porqué metí esto aquí
            if (modificar)
                logicaNegocio.modificarLibro(libro,posicion);
                //Otra forma
             
            else
                logicaNegocio.aniadirLibros(libro);
            this.Close();

        }

        private void ButtonCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {

        if(e.Action == ValidationErrorEventAction.Added)
            errores++;
        else
            errores--;

        if (errores == 0)
            ButtonAceptar.IsEnabled =true;
        else
            ButtonAceptar.IsEnabled = false;
        }
        private void TextBox_TextChanged_1(object sender, TextChangedEventArgs e)
        {

        }
    }
}
