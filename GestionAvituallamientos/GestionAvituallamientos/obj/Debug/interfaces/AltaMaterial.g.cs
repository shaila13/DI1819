﻿#pragma checksum "..\..\..\interfaces\AltaMaterial.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "C57BB85F5DF599FDF923153F3B83A9DC9289B2B4"
//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace GestionAvituallamientos.interfaces {
    
    
    /// <summary>
    /// AltaMaterial
    /// </summary>
    public partial class AltaMaterial : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 11 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox NombreProducto;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label textTipo;
        
        #line default
        #line hidden
        
        
        #line 13 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ComboBox comboxTipoProducto;
        
        #line default
        #line hidden
        
        
        #line 15 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label textPrecio;
        
        #line default
        #line hidden
        
        
        #line 16 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox Precio;
        
        #line default
        #line hidden
        
        
        #line 17 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label textCantidad;
        
        #line default
        #line hidden
        
        
        #line 18 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox Cantidad;
        
        #line default
        #line hidden
        
        
        #line 19 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button AddMaterial;
        
        #line default
        #line hidden
        
        
        #line 20 "..\..\..\interfaces\AltaMaterial.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button Cancel;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/GestionAvituallamientos;component/interfaces/altamaterial.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\interfaces\AltaMaterial.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.NombreProducto = ((System.Windows.Controls.TextBox)(target));
            
            #line 11 "..\..\..\interfaces\AltaMaterial.xaml"
            this.NombreProducto.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.Validation_Error));
            
            #line default
            #line hidden
            return;
            case 2:
            this.textTipo = ((System.Windows.Controls.Label)(target));
            return;
            case 3:
            this.comboxTipoProducto = ((System.Windows.Controls.ComboBox)(target));
            
            #line 13 "..\..\..\interfaces\AltaMaterial.xaml"
            this.comboxTipoProducto.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.Validation_Error));
            
            #line default
            #line hidden
            return;
            case 4:
            this.textPrecio = ((System.Windows.Controls.Label)(target));
            return;
            case 5:
            this.Precio = ((System.Windows.Controls.TextBox)(target));
            
            #line 16 "..\..\..\interfaces\AltaMaterial.xaml"
            this.Precio.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.Validation_Error));
            
            #line default
            #line hidden
            return;
            case 6:
            this.textCantidad = ((System.Windows.Controls.Label)(target));
            return;
            case 7:
            this.Cantidad = ((System.Windows.Controls.TextBox)(target));
            
            #line 18 "..\..\..\interfaces\AltaMaterial.xaml"
            this.Cantidad.AddHandler(System.Windows.Controls.Validation.ErrorEvent, new System.EventHandler<System.Windows.Controls.ValidationErrorEventArgs>(this.Validation_Error));
            
            #line default
            #line hidden
            return;
            case 8:
            this.AddMaterial = ((System.Windows.Controls.Button)(target));
            
            #line 19 "..\..\..\interfaces\AltaMaterial.xaml"
            this.AddMaterial.Click += new System.Windows.RoutedEventHandler(this.addMaterial);
            
            #line default
            #line hidden
            return;
            case 9:
            this.Cancel = ((System.Windows.Controls.Button)(target));
            
            #line 20 "..\..\..\interfaces\AltaMaterial.xaml"
            this.Cancel.Click += new System.Windows.RoutedEventHandler(this.Cancel_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}
