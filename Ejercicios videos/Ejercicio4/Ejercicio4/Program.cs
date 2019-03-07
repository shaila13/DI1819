using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio4
{
    class Program
    {
        static void Main()
        {
            Persona person = new Persona("Ana", "Pérez", 34);
            GestionPersonas gestinPersonas = new GestionPersonas();

            person.ReadField(); 
            person.PrintPerson();

           Persona person1 = new Persona("Pepe","Sánchez",34);
           Persona person2 = new Persona("Manuel", "Fernández", 34);

           System.Console.WriteLine("Añadir Personas.");
           gestinPersonas.aniadirPerson(person);
           gestinPersonas.aniadirPerson(person1);
           gestinPersonas.aniadirPerson(person2);
           gestinPersonas.listarPerson();

           Persona person3 = new Persona("LLLLL", "SSSSS", 34);

           System.Console.WriteLine("Modificar Personas.");
           gestinPersonas.modificarPerson(person3, 2);
           System.Console.WriteLine("");
           System.Console.WriteLine("Listar Personas.");
           gestinPersonas.listarPerson();
           System.Console.WriteLine("Ordenar Personas.");
           gestinPersonas.ordenarPerson();
           System.Console.WriteLine("Borrar Personas.");
           gestinPersonas.borrarPerson("LLLLL");
           gestinPersonas.listarPerson();
            // Keep the console window open in debug mode.
            System.Console.WriteLine("Press any key to exit.");
            System.Console.ReadKey();


        }
    }
}
