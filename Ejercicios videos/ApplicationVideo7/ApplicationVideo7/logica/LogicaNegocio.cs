using ApplicationVideo7.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationVideo7.logica
{
    public class LogicaNegocio
    {
        public ObservableCollection<Libro> listaLibros { get; set; }

        public LogicaNegocio()
        {
            listaLibros = new ObservableCollection<Libro>();
        listaLibros.Add(new Libro("Titulo","Autor",DateTime.Now));
        
        }
        public void aniadirLibros(Libro libro)
        {
            listaLibros.Add(libro);
        }
        public void modificarLibro(Libro libro, int posicion)
        {
            listaLibros[posicion] = libro;
        }
    }
}
