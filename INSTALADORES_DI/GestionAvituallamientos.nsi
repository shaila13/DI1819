# Idiomas

# Nombre del instalador
Name "Gestion de avituallamientos"

# The file to write
OutFile "GestionAvituallamientos.exe"

# The default installation directory
InstallDir $PROGRAMFILES\gda

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
  File "GestionAvituallamientos.exe"

  # Se crea un  nuevo acceso directo en el menu de inicio. Como le pasamos
  # en el segundo parametro vacio, no llama a nada de momento
  createShortCut "$SMPROGRAMS\GestionAvituallamientos.lnk" "$INSTDIR\GestionAvituallamientos.exe"
  createShortCut "$DESKTOP\GestionAvituallamientos.lnk" "$INSTDIR\GestionAvituallamientos.exe"

  #A�adimos informaci�n para que salga en el men� de desinstalar de Windows
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gda" \
                 "DisplayName" "Gestion de avituallamientos"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gda" \
                 "Publisher" "Shaila - Desarrollo Interfaces"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gda" \
                 "UninstallString" "$\"$INSTDIR\uninstall.exe$\""
  
  
# Fin de la seccion
SectionEnd

# seccion del desintalador
section "uninstall"
 
    # borramos el desintalador primero
    delete "$INSTDIR\uninstall.exe"
 
    # borramos el acceso directo del menu de inicio
    delete "$INSTDIR\GestionAvituallamientos.exe"
    delete "$SMPROGRAMS\GestionAvituallamiento.lnk"
    delete "$DESKTOP\GestionAvituallamientos.lnk"
	
    RmDir "$INSTDIR"

    #Borramos la entrada del registro
    DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\gda"
 
# fin de la seccion del desinstalador
sectionEnd
