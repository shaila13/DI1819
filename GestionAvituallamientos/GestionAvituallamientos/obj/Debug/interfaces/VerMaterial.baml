   M S B A M L   `   `   `  ����  GestionAvituallamientos4    .GestionAvituallamientos.interfaces.VerMaterial   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  
Materiales��5   	   $	��324��6   $	��468��6)    � Icon$ /imagenes/corredor.png��66   .��5      � ��5   
   �� 5       �� ImageSource$ /imagenes/Runners.png��6    j� Stretch$ UniformToFill=�6=   .+�5
   
   �� -   5         ��Name$ textListaMateriales��5
      $��LISTA DE MATERIALES��6-   $��Center=�6L   $��134,11,126.6,0q�6i   $	��Top=�6�   $	��201��6�   $��16(�6�   ���	#FFF007DC$
��Bold"�6�   &   System.Windows.Controls.DataGrid  5   
   -   5          Name$ DataGridListaMateriales��5         AutoGenerateColumns .  $
��Left=�6}   $��	10,48,0,0q�6�   $	��Top=�6�   $	��181��6�   $	��442��6�   ��64   ��  �� Path$ listaMateriales�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn	   Header$	 Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn
   Binding
 65   �� *Nombre+  5      $	 Precio��6%   
 65   �� *Precio+  5      $	 Tipo Material��6%   
 6<   �� *Tipo+  5      $	 Cantidad��6%   
 67   �� *
Cantidad+5      �� 5   
   -   5         ��Name$ deleteMaterial��5      $��Delete Material��6)   $
��Left=�6C   $��256,234,0,0q�6^   $	��Top=�6s   $��91��6�   6�   �� 5   
   -   5        $ modifyMaterial��5      $��Modify Material��6)   $
��Left=�6C   $��352,234,0,0q�6^   $	��Top=�6s   $��98��6�   6�   �� 5   
   -   5        $ cancel��5      $��Cancel��6!   $
��Left=�62   $��352,265,0,0q�6M   $	��Top=�6b   $��98��6z   6�   5      5      