using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio4
{
    class GestionPersonas
    {
        List<Persona> listaPersonas = new List<Persona>();

        // Constructor Vacío
        public GestionPersonas()
        {

        }

        // Method añadir una persona
        public void aniadirPerson(Persona persona)
        {
            listaPersonas.Add(persona);

        }

        // Method borrar una persona
        public void borrarPerson(string nombre)
        {
            listaPersonas.RemoveAll(c => c.Equals(nombre));
           
           
        }

        // Method modificar persona
        public void modificarPerson(Persona persona, int posicion)
        {
            listaPersonas[posicion] = persona;

        }


        // Method listar personas
        public void listarPerson()
        {
            foreach (Persona people in listaPersonas)
            {
                Console.WriteLine(people);
            }


        }

        // Method listar personas
        public void ordenarPerson()
        {
            // Sort the cars by color alphabetically, and then by speed in descending order. 
            //listaPersonas.Sort();

            var listaNombre = listaPersonas.OrderBy(param => param.Nombre).ToList();
            foreach (Persona people in listaNombre)
            {
                Console.WriteLine(people);
            }


        }

    }
} 
