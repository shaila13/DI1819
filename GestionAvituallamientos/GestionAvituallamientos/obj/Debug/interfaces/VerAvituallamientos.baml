   M S B A M L   `   `   `  ����  GestionAvituallamientos<    6GestionAvituallamientos.interfaces.VerAvituallamientos   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  VerAvituallamientos��5   	   $	��350��6%   $	��300��62   .��5      � .+�5   
   �� -   5         ��Name$ textListaAvituallamientos��5      $��LISTA DE AVITUALLAMIENTOS��63   $��Center=�6X   $��27,10,25.6,0q�6u   $	��Top=�6�   $	��241��6�   $��16(�6�   
������ ���	#FFF007DC6�   &   System.Windows.Controls.DataGrid  5   
   -   5          Name$# DataGridListaAvituallamientos��5         AutoGenerateColumns .  $
��Left=�5	      $��	10,48,0,0q�6.   $	��Top=�6A   $	��195��6Y   $	��274��6f      
IsReadOnly . ��5   :   ��  �� Path$ ListaAvituallamientos�   Columns 5
      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Contacto��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 67   �� *'%PersonaContacto.NombrePersonaContacto+  5      $ Telefono��6%    67   �� *)'PersonaContacto.TelefonoPersonaContacto+  5      $ Punto Km��6%    67   �� *PuntoKilometrico+  5      $ 
Materiales��6%    69   �� *ListaMateriales.Count+5      �� 5   
   -   5        	 ��Name$	 deleteAvituallamiento��5      $��Delete Avituallamiento��60   $
��Left=�6Q   $��
10,292,0,0q�6l   $	��Top=�6�   $	��125��6�   6�   �� 5   
   -   5        $	 modifyAvituallamiento��5      $��Modify Avituallamiento��60   $
��Left=�6Q   $��151,257,0,0q�6l   $	��Top=�6�   $	��133��6�   6�   �� 5   
   -   5        $	 cancel��5      $��Cancel��6!   $
��Left=�62   $��207,292,0,0q�6M   $	��Top=�6b   $��77��6z   6�   �� 5   
   -   5        $	 createAvituallamiento��5      $��Add Avituallamiento��60   $
��Left=�6N   $��
10,257,0,0q�6i   $	��Top=�6}   $	��125��6�   6�   5      5      