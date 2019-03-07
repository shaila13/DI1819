using GestionAvituallamientos.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace GestionAvituallamientos.logica
{
  public class GestionNegocio
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }
        public ObservableCollection<Material> listaMateriales { get; set; }
        public ObservableCollection<Carrera> listaCarreras { get; set; }
        public ObservableCollection<PersonaContacto> listaPersonasContacto { get; set; }
        public Material material { get; set; }
        public PersonaContacto persona { get; set; }
        public Carrera carrera { get; set; }
        public Avituallamiento avituallamiento { get; set; }

        public GestionNegocio()
        {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            listaMateriales = new ObservableCollection<Material>();
            listaCarreras = new ObservableCollection<Carrera>();
            listaPersonasContacto = new ObservableCollection<PersonaContacto>();

            addMaterileslista();
            addCarrreraslista();
        }
        private void addMaterileslista()
        {
            listaMateriales.Add(new Material("Botellín pequeño agua", "Bebida", 0.99F, 15));
            listaMateriales.Add(new Material("Tiritas", "Material sanitario", 0.60F, 15));
            listaMateriales.Add(new Material("Plátano", "Comida", 1.99F, 15));
            listaMateriales.Add(new Material("Bebida isotónica", "Bebida", 2.99F, 15));
            listaMateriales.Add(new Material("Desinfectante y gasas", "Material sanitario", 1.99F, 15));
            listaMateriales.Add(new Material("Refresco Cola", "Bebida", 0.99F, 15));
            listaMateriales.Add(new Material("Manzana", "Comida", 0.20F, 15));
            listaMateriales.Add(new Material("Muesli", "Barritas energéticas", 3.00F, 15));
            listaMateriales.Add(new Material("Acuarius", "Bebida", 1.65F, 15));
        }

        private void addCarrreraslista()
        {
            listaCarreras.Add(new Carrera("Cebolles"));
            listaCarreras.Add(new Carrera("Nabos"));
            listaCarreras.Add(new Carrera("Pimientos"));
        }




        /**
         * Método que modifica un material de la lista.
         * 
         */
        public void modifyMaterial(Material material, int posicion)
        {
            listaMateriales[posicion] = material;
        }

      /**
       * Método que borra un material de la lista.
       * 
       */
        public void deleteMaterial(Material material)
        {
            listaMateriales.Remove(material);
        }
      /**
       * Método que añade un material a la lista.
       */
        public void addMaterial(Material material)
        {
                    listaMateriales.Add(material);

        }

      /**
       * Método que elimina un material de la lista de materiales porque se ha retirado determinadas unidades.
       */


        public void retirarMaterial(Material material, Avituallamiento avituallamiento)
        {

            foreach (Material m in listaMateriales)
            {
                if (material.Nombre.Equals(m.Nombre))
                {
         
                    if (m.Cantidad > material.Cantidad)
                    {
                        m.Cantidad -= material.Cantidad;
                        avituallamiento.ListaMateriales.Add(material);

                    }
                    else if (material.Cantidad == m.Cantidad)
                    {
                        avituallamiento.ListaMateriales.Add(material);
                        listaMateriales.Remove(material);

                    }
                    else
                    {
                        MessageBox.Show("No se puede retirar el producto");
                    }
                }
            }
        }

        /**
         * Método para añadir una carrera a la lista de carreras.
         * 
         */
        public void addCarrera(Carrera carrera)
        {

            Boolean isCarrera = false;

            foreach (Carrera c in listaCarreras)
            {
                if (c.NombreCarrera.Equals(carrera.NombreCarrera))
                {
                    isCarrera = true;
                }
            }
            if (!isCarrera)
            {
                listaCarreras.Add(carrera);

            }

        }

        /**
         * Método para modificar una carrera a la lista de carreras.
         * 
         */
        public void modifyCarrera(Carrera carrera, int posicion)
        {
            listaCarreras[posicion] = carrera;
        }

        /**
      * Método para borrar una carrera a la lista de carreras.
      * 
      */
        public void deleteCarrera(Carrera carrera)
        {
            listaCarreras.Remove(carrera);
        }
        /**
         * Método para añadir una persona a la lista de personas si no existe previamente.
         */
        public void addPerson(PersonaContacto personaContacto)
        {

                listaPersonasContacto.Add(personaContacto);
        
          }

    }
   
}
