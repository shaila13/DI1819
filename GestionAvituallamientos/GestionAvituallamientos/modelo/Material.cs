using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;

namespace GestionAvituallamientos.modelo
{
  public  class Material: INotifyPropertyChanged,ICloneable,IDataErrorInfo
    {
        private string nombre;
        public string Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }
        

        private string tipo;
        public string Tipo
        {
            get
            {
                return tipo;
            }
            set
            {
                this.tipo = value;
               this.PropertyChanged(this, new PropertyChangedEventArgs("Tipo"));
            }
        }
        private float precio;
        public float Precio
        {
            get
            {
                return precio;
            }
            set
            {
                this.precio = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Precio"));
            }
        }
         private int cantidad;
         public int Cantidad
        {
            get
            {
                return cantidad;
            }
            set
            {
                this.cantidad = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Cantidad"));
            }
        }

        public Material()
        {
            this.cantidad= 0;
        }

        public Material(string nombreMaterial, string tipoMaterial, float precioMaterial)
        {
            this.nombre = nombreMaterial;
            this.tipo = tipoMaterial;
            this.precio = precioMaterial;
            this.cantidad = 0;
        }

        public Material(string nombreMaterial, string tipoMaterial, float precioMaterial, int cantidad)
        {

            this.nombre = nombreMaterial;
            this.tipo = tipoMaterial;
            this.precio = precioMaterial;
            this.cantidad = cantidad;
        }


        public override string ToString()
        {
            return Nombre + " - " + Tipo + " - " + Precio + " - " + Cantidad;
        }


        
        public event PropertyChangedEventHandler PropertyChanged;
     

        public object Clone()
        {
            return this.MemberwiseClone();
            
        }

        public string Error
        {
            get { return " "; }
        }

        public string this[string columnName]
        {
            get 
            { string result = "";
            if (columnName == "Nombre")
            {
                if (string.IsNullOrEmpty(nombre))
                    result = "No puede estar vacío.";
            }
            if (columnName == "Tipo")
            {
                if (string.IsNullOrEmpty(tipo))
                    result = "No puede estar vacío.";
            }
            if (columnName == "Cantidad")
            {
                if (cantidad == 0 || cantidad < 0)
                    result = "No puede ser cero o valor negativo.";
            }
            if (columnName == "Precio")
            {
                if (precio == 0 || precio <0)
                    result = "No puede ser cero o valor negativo.";
            }
            return result;
            }
        }
    }
}
