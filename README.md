```markdown
# Fábrica de Interfaces Gráficas 🎨

Este proyecto implementa un sistema de creación de interfaces gráficas con diferentes temas (Modo Oscuro y Modo Claro) utilizando el patrón de diseño **Abstract Factory** en Java. El usuario puede seleccionar el tema deseado mediante un menú interactivo en la consola.

---

## Estructura del Proyecto 🗂️

El proyecto sigue la siguiente estructura de carpetas:
```
```bash
fabrica_interfaces_graficas
└── src/main/java
    └── com.interfaces_graficas
        ├── factory
        │   ├── ModoOscuroFactory.java
        │   ├── ModoClaroFactory.java
        │   └── GUIAbstractFactory.java
        ├── components
        │   ├── Button.java
        │   ├── NavBar.java
        │   ├── ModoOscuroButton.java
        │   ├── ModoOscuroNavBar.java
        │   ├── ModoClaroButton.java
        │   └── ModoClaroNavBar.java
        ├── Main.java
        └── TemaUI.java
```

---

## Requisitos 📋

- **Java Development Kit (JDK)**: Asegúrate de tener instalado JDK 8 o superior.
- **IDE o Editor de Texto**: Puedes usar IntelliJ IDEA, Eclipse, VS Code o cualquier editor de tu preferencia.

---

## Configuración ⚙️

1. Clona este repositorio o descarga el código fuente.
2. Abre el proyecto en tu IDE o editor de texto.
3. Asegúrate de que el proyecto esté configurado para usar JDK 8 o superior.

---

## Ejecución 🚀

1. Abre una terminal en la raíz del proyecto.
2. Navega a la carpeta `src/main/java/com/interfaces_graficas`.
3. Compila el código ejecutando:
   ```bash
   javac Main.java
   ```
4. Ejecuta el programa con:
   ```bash
   java com.interfaces_graficas.Main
   ```

---

## Uso del Programa 🖥️

Al ejecutar el programa, se mostrará un menú en la consola:

```
Seleccione el tema de la interfaz gráfica:
1. Modo Oscuro
2. Modo Claro
Ingrese su opción (1 o 2):
```

- Ingresa el número correspondiente al tema que deseas usar.
- El programa creará y renderizará un botón y una barra de navegación en el tema seleccionado.

### Ejemplo de Salida

Si seleccionas **Modo Oscuro**, verás:

```
Botón en Modo Oscuro: Fondo negro, texto blanco.
Barra de navegación en Modo Oscuro: Fondo gris oscuro, texto claro.
```

---

## Detalles de Implementación 🛠️

### Patrón Abstract Factory

El patrón **Abstract Factory** se utiliza para crear familias de objetos relacionados (en este caso, componentes de interfaz gráfica para diferentes temas) sin especificar sus clases concretas. Esto permite que el código sea flexible y fácil de extender.

- **`GUIAbstractFactory`**: Interfaz base para las fábricas.
- **`ModoOscuroFactory`**, **`ModoClaroFactory`**: Fábricas concretas que crean componentes para Modo Oscuro y Modo Claro, respectivamente.
- **`Button`**, **`NavBar`**: Interfaces que definen los métodos `render()` para los componentes.
- **`ModoOscuroButton`**, **`ModoOscuroNavBar`**, **`ModoClaroButton`**, **`ModoClaroNavBar`**: Implementaciones concretas de los componentes.

### Enumeración `TemaUI`

La enumeración `TemaUI` define los temas de interfaz gráfica disponibles:

```java
public enum TemaUI {
    MODO_OSCURO,
    MODO_CLARO
}
```

### Clase `Main`

La clase `Main` es el punto de entrada del programa. Aquí se muestra el menú interactivo, se procesa la entrada del usuario y se crean los componentes correspondientes.

---

## Extensibilidad 🌟

Si deseas agregar más temas de interfaz gráfica en el futuro:

1. Crea una nueva clase en el paquete `components` que implemente las interfaces `Button` y `NavBar`.
2. Crea una nueva fábrica en el paquete `factory` que implemente la interfaz `GUIAbstractFactory`.
3. Actualiza la enumeración `TemaUI` y la función `getTemaUI` en la clase `Main`.

---

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar el proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama con tu nueva funcionalidad (`git checkout -b nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Agrega nueva funcionalidad'`).
4. Haz push a la rama (`git push origin nueva-funcionalidad`).
5. Abre un Pull Request.

---

## Licencia 📄

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## Desarrollador
- [Luis Alberto Talero Martinez]

---

¡Gracias por usar este proyecto! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue o contactarme. 😊
```

---

### Cómo Usar el `README.md`

1. Crea un archivo llamado `README.md` en la raíz de tu proyecto.
2. Copia y pega el contenido anterior en el archivo.
3. Personaliza el contenido si es necesario (por ejemplo, agregando tu nombre o detalles adicionales sobre el proyecto).
