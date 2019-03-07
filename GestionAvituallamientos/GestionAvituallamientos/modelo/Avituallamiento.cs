using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;

namespace GestionAvituallamientos.modelo
{
    public class Avituallamiento : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {

        private string nombreCarrera;
        public string NombreCarrera
        {
            get
            {
                return nombreCarrera;
            }
            set
            {
                this.nombreCarrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NombreCarrera"));
            }
        }


        private int puntoKilometrico;
        public int PuntoKilometrico
        {
            get
            {
                return puntoKilometrico;
            }
            set
            {
                this.puntoKilometrico = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PuntoKilometrico"));
            }
        }

  
        private PersonaContacto personaContacto;
        public PersonaContacto PersonaContacto
        {
            get
            {
                return personaContacto;
            }
            set
            {
                this.personaContacto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PersonaContacto"));
            }
        }


        private ObservableCollection<Material> listaMateriales;
        public ObservableCollection<Material> ListaMateriales
        {
            get
            {
                return listaMateriales;
            }
            set
            {
                this.listaMateriales = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("ListaMateriales"));
            }
        }


        public Avituallamiento()
        {
            this.listaMateriales = new ObservableCollection<Material>();
        }
        public Avituallamiento(string nombreCarrera, int puntoKilometrico, PersonaContacto personaContacto)
        {
            this.listaMateriales = new ObservableCollection<Material>();
            this.nombreCarrera = nombreCarrera;
            this.puntoKilometrico = puntoKilometrico;
            this.personaContacto = personaContacto;
        }

        public override string ToString()
        {
            return nombreCarrera + " - " + puntoKilometrico + " - " + personaContacto.NombrePersonaContacto + " - " + personaContacto.TelefonoPersonaContacto;
        }

        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public string Error
        {
            get { return ""; }
        }

        public string this[string columnName]
        {
                get
            {
                string result = "";
                if (columnName == "NombreCarrera")
                {
                    if (string.IsNullOrEmpty(nombreCarrera))
                        result = "Debe introducir el nombre";
                }
   
                if (columnName == "PuntoKilometrico")
                {
                    if (puntoKilometrico == 0)
                        result = "Debe introducir el punto Kilométrico";
                }
                if (columnName == "PersonaContacto")
                {
                    if (PersonaContacto == null)
                        result = "Debe introducir persona de contacto";
                }
                if (columnName == "ListaMateriales")
                {
                    if (listaMateriales.Count == 0)
                        result = "Debe introducir algún material";
                }
                return result;
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;
    }
}
