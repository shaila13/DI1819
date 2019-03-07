using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


//EJERCICIO 1.  
/*Después de revisar como realizar el programa “hola mundo” en el enlace
anterior, implementalo en tu VS y comprueba que funciona como esperas.*/

    class Hello 
    {
        static void Main(string[] args)
        {
            System.Console.WriteLine("Hello World!");

            // Keep the console window open in debug mode.
            System.Console.WriteLine("Press any key to exit.");
            System.Console.ReadKey();
        }
    }
}
