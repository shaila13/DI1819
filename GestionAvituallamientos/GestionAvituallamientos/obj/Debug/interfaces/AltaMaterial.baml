   M S B A M L   `   `   `  ����  GestionAvituallamientos5    /GestionAvituallamientos.interfaces.AltaMaterial   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  AltaMaterial��5   	   $	��300��6   $	��400��6,    � Icon$ /imagenes/corredor.png��68   .��5      � ��5   
   �� 5       �� ImageSource$ /imagenes/Runners.png��6    j� Stretch$ UniformToFill=�6=   .+�5
   
   �� $��Nombre Producto:��6   $
��Left=�6+   $��	23,22,0,0q�6F   $	��Top=�6Y   $	��116��6q   $
��Bold"�6}   ���	#FFFF02D06�   �� 5   
   -   5         ��Name$ NombreProducto��5      $
��Left=�6�   $��26��6�   $��
144,22,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6  $	��207��6  ��6P   ��  �� Path$ material.Nombre� �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6  �� 5   
   -   5        	 ��Name$	 textTipo��5      $��Tipo de producto: ��6"   $
��Left=�6?   $��	23,73,0,0q�6Z   $	��Top=�6m   $
��Bold"�6�   ���	#FFFF02D06�   �� 5   
   -   5        
 ��Name$
 comboxTipoProducto��5      $
��Left=�6�   $��
144,73,0,0q�6�   $	��Top=�6�   $	��207��6�    �� SelectedItem 6T   �� $ material.Tipo���6�   �� $ listaTiposMaterial�6�   �� 5   
   -   5        $	 
textPrecio��5      $��Precio:��6$   $
��Left=�66   $��
23,116,0,0q�6Q   $	��Top=�6e   $	��116��6}   $
��Bold"�6�   ���	#FFFF02D06�   �� 5   
   -   5        $ Precio��5      $
��Left=�6�   $��26��6�   $��144,116,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��207��6  ��6G   �� $ material.Precio� .  . 6  �� 5   
   -   5        $	 textCantidad��5      $��	Cantidad:��6&   $
��Left=�6:   $��
23,164,0,0q�6U   $	��Top=�6i   $	��116��6�   $
��Bold"�6�   ���	#FFFF02D06�   �� 5   
   -   5        $ Cantidad��5      $
��Left=�6�   $��26��6�   $��144,164,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��207��6   J� RenderTransformOrigin$ -0.229,10.538&�6  ��6I   �� $ material.Cantidad� .  . 6  �� 5   
   -   5         ��Name$ AddMaterial��5      $	��ADD��6&   $
��Left=�64   $��182,224,0,0q�6O   $	��Top=�6d   $��75��6|   6�   �� 5   
   -	   5        $ Cancel��5      $��Cancel��6!   $
��Left=�62   $��276,224,0,0q�6M   $	��Top=�6b   $��75��6z   6�   5      5      