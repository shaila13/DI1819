# Idiomas

# Nombre del instalador
Name "Gestion de corredores y carreras"

# The file to write
OutFile "GestionCorredoresCarreras.exe"

# The default installation directory
InstallDir $PROGRAMFILES\gcc

# Pedimos permisos para Windows 7
RequestExecutionLevel admin

# Pantallas que hay que mostrar del instalador

Page directory
Page instfiles

#Cambiar el idioma
!include "MUI.nsh"
!insertmacro MUI_LANGUAGE "Spanish"


#Seccion principal
Section

  # Establecemos el directorio de salida al directorio de instalacion
  SetOutPath $INSTDIR
  
  # Creamos el desinstalador
  writeUninstaller "$INSTDIR\uninstall.exe"
  
  # Ponemos ahi el archivo test.txt
  File "InterfaceGestionCorredoresActual.jar"
  File /r "lib"
  File /r "informe1.jasper"
  File /r "informe2.jasper"
  File /r "informe3.jasper"
  File /r "informe4.jasper"
  File /r "LogicaNegocio.dat"
  File /r "Corredores.csv"  

  # Se crea un  nuevo acceso directo en el menu de inicio. Como le pasamos
  # en el segundo parametro vacio, no llama a nada de momento
  createShortCut "$SMPROGRAMS\GestionCorredoresCarreras.lnk" "$INSTDIR\InterfaceGestionCorredoresActual.jar"
  createShortCut "$DESKTOP\GestionCorredoresCarreras.lnk" "$INSTDIR\InterfaceGestionCorredoresActual.jar"

  #Añadimos información para que salga en el menú de desinstalar de Windows
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gcc" \
                 "DisplayName" "Gestion de corredores y carreras"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gcc" \
                 "Publisher" "Shaila - Desarrollo Interfaces"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gcc" \
                 "UninstallString" "$\"$INSTDIR\uninstall.exe$\""
  
  
# Fin de la seccion
SectionEnd

# seccion del desintalador
section "uninstall"
 
    # borramos el desintalador primero
    delete "$INSTDIR\uninstall.exe"
 
    # borramos el acceso directo del menu de inicio
    delete "$INSTDIR\InterfaceGestionCorredoresActual.jar"
    RmDir /r "$INSTDIR\lib"
	RmDir /r "$INSTDIR\informe1.jasper"
	RmDir /r "$INSTDIR\informe2.jasper"
	RmDir /r "$INSTDIR\informe3.jasper"
	RmDir /r "$INSTDIR\informe4.jasper"
    RmDir /r "$INSTDIR\LogicaNegocio.dat"
	RmDir /r "$INSTDIR\Corredores.csv"  
    delete "$SMPROGRAMS\GestionCorredoresCarreras.lnk"
    delete "$DESKTOP\GestionCorredoresCarreras.lnk"
	
    RmDir "$INSTDIR"

    #Borramos la entrada del registro
    DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gcc"
 
# fin de la seccion del desinstalador
sectionEnd
