   M S B A M L   `   `   `  ����  GestionAvituallamientos(    "GestionAvituallamientos.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  
MainWindow��5   	   $	��350��6   $	��525��6)    � Icon$ /imagenes/corredor.png��65   .��5      � $��0,0,0.4,-0.2q�6   ��5   
   �� 5       �� ImageSource$ /imagenes/Runners.png��6    j� Stretch$ UniformToFill=�6=   .+�5	   
   �� -   5         ��Name$ btNewCarrera��5	      $��New Race��6'   $
��Left=�6:   $��296,210,0,0q�6U   $��75��6j   $��19��6u   $	��Top=�6�   6�   �� 5
   
   -   5        $ btModifyCarrera��5
      $��Modify Race��6+   $
��Left=�6A   $��399,210,0,0q�6\   $��75��6q   $��19��6|   $	��Top=�6�   6�   �� 5   
   -   5        $ btDeleteCarrera��5      $��Delete Race��6+   $
��Left=�6A   $��399,254,0,0q�6\   $��75��6q   $��19��6|   $	��Top=�6�   6�   o� 5   
   $��0,0,0.4,288.8q�6   .@�5      m� $��	Materials��6   $��22��6*   $	��100��66   .@�5      m� -   5         m�Name$ addMaterial��5      $��New...��60   $��20��6@   $	��120��6L   6X   m� 5      -   5        $ showMaterial��5      $
��List��61   $��20��6?   $	��120��6K   6W   5      5      &   System.Windows.Controls.DataGrid  5   
   -   5          Name$ DataGridListaCarreras��5         AutoGenerateColumns .  $
��Left=�5      $��	20,58,0,0q�6.   $	��Top=�6A   $	��136��6Y   $	��454��6f      
IsReadOnly . ��5   2   �� 	 �� Path$	 listaCarreras�
   Columns
 5   
   0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 65   �� *NombreCarrera+  5      $ Número avituallamientos��6%    6F   �� *ListaAvituallamientos.Count+5      �� 5   
   -   5        $ btSeeCarrera��5      $��See Race��6'   $
��Left=�6:   $��296,254,0,0q�6U   $��75��6j   $��19��6u   $	��Top=�6�   6�   5      5      