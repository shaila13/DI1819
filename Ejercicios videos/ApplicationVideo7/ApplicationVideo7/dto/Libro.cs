using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApplicationVideo7.dto
{
    public class Libro : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {

      private String titulo;
      public String Titulo
        {
            get
            {
                return titulo;
            }
            set
            {
                this.titulo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Titulo"));
            }
        }
        private String autor;
        public String Autor
        {
            get
            {
                return autor;
            }
            set
            {
               this.autor = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Autor"));
           
            }
        }

        private DateTime fechaEntrada;
        public DateTime FechaEntrada
        {
            get
            {
                return fechaEntrada;
            }
            set
            {
                this.fechaEntrada = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("FechaEntrada"));
           
            }
        }
        public Libro()
        {
           
            this.fechaEntrada = DateTime.Now;
        }
        public Libro(String titulo, String autor, DateTime fechaEntrada)
        {
            this.titulo = titulo;
            this.autor = autor;
            this.fechaEntrada = fechaEntrada;
        }
        public override string ToString()
        {
            return titulo + " " + autor;
        }

        public event PropertyChangedEventHandler PropertyChanged;

        //Para evitar que al modificar el libro se actualice directamente por culpa del Bilding
        public object Clone()
        {
            return this.MemberwiseClone();
        }


        public string this[string columnName]
        {
             get {
                string result = "";
                if(columnName == "Titulo")
                {
                    if(string.IsNullOrEmpty(titulo))
                        result = "Debe introducir un título";
                    
                    }
                 if(columnName == "Autor")
                {
                     if(string.IsNullOrEmpty(autor))
                        result = "Debe introducir un autor";
                }
                 return result;
            } }
          //No lo usamos

public string Error
{
	get { return ""; }
}
}
    }

