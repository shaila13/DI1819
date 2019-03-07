using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamientos.modelo
{
    public class Carrera : INotifyPropertyChanged, ICloneable, IDataErrorInfo
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

        private int cantidadAvituallamientos;
        public int CantidadAvituallamientos
        {
            get
            {
                return cantidadAvituallamientos;
            }
            set
            {
                this.cantidadAvituallamientos = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("CantidadAvituallamientos"));
            }
        }


        private ObservableCollection<Avituallamiento> listaAvituallamientos;
        public ObservableCollection<Avituallamiento> ListaAvituallamientos
        {
            get
            {
                return listaAvituallamientos;
            }
            set
            {
                this.listaAvituallamientos = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("ListaAvituallamientos"));
            }
        }
        

        public Carrera()
        {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }
        public Carrera(string nombreCarrera)
        {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            this.nombreCarrera = nombreCarrera;
            this.cantidadAvituallamientos = listaAvituallamientos.Count();
            
        }
 
        public override string ToString()
        {
            return NombreCarrera;
        }
        public event PropertyChangedEventHandler PropertyChanged;

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
                return result;
            }
        }


        public object Clone()
        {
            return this.MemberwiseClone();

        }
    }
}
