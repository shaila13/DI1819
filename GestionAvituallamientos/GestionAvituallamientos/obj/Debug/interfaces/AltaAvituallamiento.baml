   M S B A M L   `   `   `  ����  GestionAvituallamientos<    6GestionAvituallamientos.interfaces.AltaAvituallamiento   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  AltaAvituallamiento��5   	   $	��500��6%   $	��400��62    � Icon$ /imagenes/corredor.png��6>   .��5      � ��5   
   �� 5       �� ImageSource$ /imagenes/Runners.png��6    j� Stretch$ UniformToFill=�6=   .+�5	   
   �� -   5         ��Name$ textCarrera��5	      $��Carrera:��6%   $
��Left=�68   $��	10,21,0,0q�6S   $	��Top=�6f   ���	#FFFF11BF6~   �� 5
   
   -   5        $ textPKm��5
      $��Punto kilométrico:��6!   $
��Left=�6>   $��8,52,0,0q�6Y   $	��Top=�6k   $	��104��6�   ���	#FFFF11BF6�   �� 5   
   -   5         ��Name$ BoxPuntoKilometrico��5      $
��Left=�5      $��23��6�   $��
159,55,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6�   $��64��6�   ��6   �� *" avituallamiento.PuntoKilometrico+ �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6�   �� 5   
   $��PERSONA CONTACTO��6   $
��Left=�6+   $��	10,92,0,0q�6F   $	��Top=�6Y   $
��Bold"�6q   ���	#FFFF11BF��6�   Z� 6�   �� 5   
   $��MATERIAL��6   $
��Left=�6#   $��
14,219,0,0q�6>   $	��Top=�6R   $	��103��6j   ���	#FFFF11BF$
��Bold"�6�   �� 5   
   -   5        	 ��Name$	 btAddMaterial��5      $��Add Material��6(   $��14,249,34.6,0q�6?   $	��Top=�6V   6n   �� 5   
   -   5        $	 btAddAvituallamiento��5      $��Add Avituallamiento��6/   $
��Left=�6M   $��146,441,0,0q�6h   $	��Top=�6}   $	��117��6�   
 J� RenderTransformOrigin$
 0.287,0.677&�6�   �� 5   
   -   5        $ TbNombreContacto��5      $��159,126,0,0q�5   �   $	��Top=�6�   $	��200��6�   $��23��6�   $
��Left=�6�   ��6   �� *'%personaContacto.NombrePersonaContacto+ .  . 6�   �� 5   
   -   5        $ TbTelefonoContacto��5      $��159,159,0,0q�5   �   $	��Top=�6�   $	��200��6�   $��23��6�   $
��Left=�6�   ��6   �� *)'personaContacto.TelefonoPersonaContacto+ .  . 6�   �� 5   
   -   5        $ TbNombreCarrera��5      $
��Left=�5   s   $��23��6�   $��
159,21,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��200��6�   ��6   �� *carrera.NombreCarrera+ .  . 6�   �� 5    
   $��Nombre:��6   $
��Left=�6"   $��
14,123,0,0q�6=   $	��Top=�6Q   ���	#FFFF11BF6i   �� 5!   
   $��
Teléfono:��6   $
��Left=�6$   $��
14,159,0,0q�6?   $	��Top=�6S   ���	#FFFF11BF6k   �� 5#   
   
���   �$��1q�6%   $
��Left=�69   $��9��6T   $��	10,83,0,0q�6_   $	��Top=�6r   $	��349��6�   ��5$      
� 5%      .��5&      �  � Color$ Black��6#    � Offset$ 0Q�61   � 5'      $ 	#FFF007DC��6#   $ 1Q�65   5(      5*      �� 5+   
   
���   �$��1q�6%   $
��Left=�69   $��9��6T   $��
10,210,0,0q�6_   $	��Top=�6s   $	��349��6�   ��5,      
� 5-      .��5.      � $ Black��6#   $ 0Q�61   � 5/      $ 	#FFF007DC��6#   $ 1Q�65   50      52      &   System.Windows.Controls.DataGrid  53   
   -	   5          Name$' !DataGridMaterialesAvituallamiento��53         AutoGenerateColumns .  $��14,286,34.6,0q�54   0   $	��Top=�6G   $	��142��6_      
IsReadOnly . ��53   >   �� *ListaMateriales+   Columns 56      0  *System.Windows.Controls.DataGridTextColumn  57      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 65   �� *Nombre+  58      $ Precio��6%    65   �� *Precio+  59      $ Tipo Material��6%    6<   �� *Tipo+  5:      $ Cantidad��6%    67   �� *
Cantidad+5=      �� 5>   
   -
   5        $	 btCancel��5>      $��Cancel��6$   $
��Left=�65   $��284,441,0,0q�6P   $	��Top=�6e   $��75��6}   6�   5@      5A      