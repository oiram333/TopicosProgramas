#! /bin/bash
### Punto numero 1 ###
echo "Bienvenidos Todos..."
sleep 20
clear
pwd

### Punto numero 2 ###
touch Archivo1.txt Archivo2.txt Archivo3.txt Archivo4.txt Archivo5.txt 

### Punto numero 3 ###
mkdir Archivos

### Punto numero 4 ###
mv Archivo1.txt Archivo2.txt Archivo3.txt Archivo4.txt Archivo5.txt Archivos/

### Punto numero 5 ###
echo "Creamos 5 archivos en la carpeta Escritorio y posterior mente" 
echo "los enviamos a la carpeta creada llamada Archivos"

### Punto numero 6 ###
sleep 10

### Punto numero 7 ###
echo "Iniciando el respaldo..."

### Punto numero 8 ###
tar -cvf respaldo.tar Archivos/

### Punto numero 9 ###
mv respaldo.tar ../Documentos/

### Punto numero 10 ###
echo "El respaldo esta casi listo falta eliminar la carpeta con"
echo "los archivos :)..."

###  Punto numero 11 y 12 ###
rm -r ../Escritorio/Archivos/

### Punto numero 13 ###
echo "Hemos finalizado el respaldo correctamente, hasta luego."
