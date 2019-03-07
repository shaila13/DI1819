using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/* EJERCICIO 4.  
Haciendo el uso de Listas, y del objeto 'Persona' del ejercicio anterior, crea un programa en 
 * consola que sea capaz de gestionar un listado de personas. Puedes añadirle las opciones 
 * de añadir personas, borrar, listar e incluso ordenar, para que practiques como ordenar una 
 * lista en C#. Como ampliación puedes probar a serializar la lista a disco para que veas como
 * se puede implementar la persistencia en un programa tan simple como éste.*/

namespace Ejercicio4
{
    class Persona
    {

            // Field
            public string Nombre { get; set; }
            public string Apellidos { get; set; }
            public int Edad { get; set; }
            

            // Constructor Vacío
            public Persona()
            {

            }

            // Constructor
            public Persona(string nombre, string apellidos, int edad)
            {
                this.Nombre = nombre;
                this.Apellidos = apellidos;
                this.Edad = edad;
            }

            // Method
            public void ReadField()
            {
                Console.WriteLine("Introduzca un nombre: ");
                this.Nombre = Console.ReadLine();
                Console.WriteLine("Introduzca los apellidoa: ");
                this.Apellidos = Console.ReadLine();
                Console.WriteLine("Introduzca una edad: ");
                this.Edad = UInt16.Parse(Console.ReadLine());

            }

            // Printing method:
            public void PrintPerson()
            {
                Console.WriteLine(Nombre + " " + Apellidos + ", tiene " + Edad + " años.");
            }

            public override string ToString()
            {
                return Nombre + " " + Apellidos + ", tiene " + Edad + " años.";
            }

        }
    
     
    }




    


