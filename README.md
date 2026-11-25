<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0B1026,50:4C1D95,100:0891B2&height=130&section=header&animation=twinkling" width="100%" alt=""/>

<img width="220" src="https://github.com/user-attachments/assets/e533f931-15cc-4298-94ed-267c0181a5dd" alt="Universidad Nacional de Loja"/>

<img src="assets/svg/banner.svg" width="100%" alt="Autocompletado Turístico de las Artes Vivas de Loja"/>

<a href="#-03--núcleo-del-sistema">
<img src="https://readme-typing-svg.demolab.com?font=Orbitron&weight=700&size=24&duration=3200&pause=900&color=22D3EE&center=true&vCenter=true&width=860&height=60&lines=Escribe+%22Pu%22+%E2%86%92+Puerta+de+la+Ciudad;Trie+%2B+Map+%2B+Lista+doble;Cach%C3%A9+FIFO+%C2%B7+LRU+%C2%B7+SIEVE;Explora+Loja+con+algoritmos" alt="Animación de texto"/>
</a>

**Carrera de Computación · Tercer Ciclo · Estructura de Datos · Grupo 4**

[![Trie](https://img.shields.io/badge/ÁRBOL_TRIE-00D9FF?style=for-the-badge&logo=treehouse&logoColor=black)](#-03--núcleo-del-sistema)
[![SIEVE](https://img.shields.io/badge/CACHÉ_SIEVE-9333EA?style=for-the-badge&logo=redis&logoColor=white)](#-04--gestión-inteligente-de-caché)
[![JavaScript](https://img.shields.io/badge/JAVASCRIPT-FACC15?style=for-the-badge&logo=javascript&logoColor=black)](#-05--flujo-de-búsqueda)
[![Node](https://img.shields.io/badge/NODE.JS-22C55E?style=for-the-badge&logo=nodedotjs&logoColor=black)](#-05--flujo-de-búsqueda)
![Estado](https://img.shields.io/badge/ESTADO-EN_MEJORA-F59E0B?style=for-the-badge)

<sub>Septiembre 2026 — Febrero 2027 · Loja, Ecuador</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

## 📑 Contenido

| | | |
|:--|:--|:--|
| [01 · Presentación](#-01--presentación-del-proyecto) | [02 · Interfaz](#-02--interfaz-de-exploración) | [03 · Núcleo 3D](#-03--núcleo-del-sistema) |
| [04 · Caché](#-04--gestión-inteligente-de-caché) | [05 · Flujo](#-05--flujo-de-búsqueda) | [06 · Rendimiento](#-06--experimentación-y-rendimiento) |
| [07 · Loja en imágenes](#-07--loja-en-imágenes) | [08 · Estado y ejecución](#-08--galería-y-estado-de-desarrollo) | [09 · Equipo](#-09--equipo-de-desarrollo) |

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🩵 01 · PRESENTACIÓN DEL PROYECTO

<img src="https://readme-typing-svg.demolab.com?font=Orbitron&weight=600&size=17&duration=2500&pause=600&color=A78BFA&center=true&vCenter=true&width=700&height=40&lines=Recuperaci%C3%B3n+de+informaci%C3%B3n;Algoritmos+y+estructuras+de+datos;Optimizaci%C3%B3n+con+cach%C3%A9" alt=""/>

</div>

El **Autocompletado Turístico de las Artes Vivas de la Ciudad de Loja** es una aplicación que facilita la exploración de lugares, obras y eventos culturales mediante un buscador dinámico capaz de generar sugerencias mientras el usuario escribe.

El sistema aplica estructuras de datos y algoritmos para mejorar la recuperación de información, disminuir búsquedas repetitivas y estudiar el comportamiento de las consultas mediante un sistema de almacenamiento temporal en caché.

### ✦ Objetivos del sistema

- 🎭 Facilitar el descubrimiento de lugares y eventos turísticos y culturales.
- 🌳 Implementar búsqueda por prefijos mediante un árbol Trie.
- ⚡ Optimizar la recuperación de consultas repetidas mediante caché.
- 🔗 Aplicar listas doblemente enlazadas en la administración de memoria.
- ⚖️ Comparar diferentes políticas de reemplazo.
- 📈 Analizar el comportamiento y rendimiento de las estructuras implementadas.

<div align="center">

<img src="ESPACIO_PARA_CAPTURA_PRINCIPAL" width="95%" alt="Pantalla principal del sistema"/>

<sub>Figura 1. Interfaz principal del autocompletado turístico.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 💜 02 · INTERFAZ DE EXPLORACIÓN

![Consulta dinámica](https://img.shields.io/badge/CONSULTA_DINÁMICA-8B5CF6?style=for-the-badge)
![Resultados instantáneos](https://img.shields.io/badge/RESULTADOS_INSTANTÁNEOS-EC4899?style=for-the-badge)

</div>

La interfaz permite ingresar nombres o fragmentos de palabras para localizar información cultural y turística de Loja. A medida que se introduce texto, el sistema procesa la consulta y presenta coincidencias disponibles.

| Funcionalidad | Descripción |
|---|---|
| 🔎 **Autocompletado** | Generación dinámica de sugerencias. |
| 🔤 **Búsqueda por prefijo** | Localización a partir de caracteres iniciales. |
| ⚡ **Respuesta dinámica** | Actualización de resultados durante la escritura. |
| 🗂️ **Consulta de catálogo** | Exploración de lugares, obras y eventos. |
| 🩺 **Estado del sistema** | Información sobre el estado de procesamiento. |

<div align="center">

<img src="ESPACIO_PARA_CAPTURA_AUTOCOMPLETADO" width="95%" alt="Autocompletado en tiempo real"/>

<sub>Figura 2. Generación de sugerencias a partir de una consulta parcial.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 💠 03 · NÚCLEO DEL SISTEMA

![Trie](https://img.shields.io/badge/TRIE-00D9FF?style=for-the-badge&logoColor=black)
![Map](https://img.shields.io/badge/MAP-22C55E?style=for-the-badge)
![Lista doble](https://img.shields.io/badge/LISTA_DOBLE-F472B6?style=for-the-badge)

### 🧊 Trie en 3D

<img src="assets/svg/trie-iso.svg" width="92%" alt="Trie isométrico animado"/>

<sub>Figura 3. Trie en vista isométrica animada: cada nivel agrega un carácter del prefijo.</sub>

<br/>

**Modelo 3D interactivo** → [`assets/modelo3d/trie.stl`](assets/modelo3d/trie.stl)
<br/>
<sub>GitHub abre archivos <code>.stl</code> con un visor 3D: arrastra para rotar, rueda para acercar.</sub>

</div>

El funcionamiento del proyecto se apoya en estructuras de datos que trabajan conjuntamente para organizar las consultas y gestionar los resultados recuperados.

| 🌳 Árbol Trie | ⚡ Tabla Hash (Map) | 🔗 Lista doblemente enlazada |
|:--|:--|:--|
| Organiza las palabras mediante caracteres compartidos y recorre únicamente la secuencia del prefijo consultado. | Localiza elementos por clave, dando acceso rápido a la información y referencias del sistema. | Nodos con referencia al anterior y al siguiente: permite mover y eliminar sin recorrer toda la estructura. |

### Relación entre las estructuras

```mermaid
flowchart LR
    A["🔎 Consulta"] --> B["🌳 Trie"]
    B --> C["📋 Coincidencias"]
    C --> D["⚡ Map"]
    D --> E["🔗 Lista doble"]
    E --> F["🧠 Caché"]
    F --> G["📤 Resultados"]

    style A fill:#0E7490,stroke:#22D3EE,color:#FFFFFF
    style B fill:#1D4ED8,stroke:#38BDF8,color:#FFFFFF
    style C fill:#4338CA,stroke:#818CF8,color:#FFFFFF
    style D fill:#047857,stroke:#34D399,color:#FFFFFF
    style E fill:#9D174D,stroke:#F472B6,color:#FFFFFF
    style F fill:#7E22CE,stroke:#D946EF,color:#FFFFFF
    style G fill:#BE185D,stroke:#FB7185,color:#FFFFFF
```

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🟢 04 · GESTIÓN INTELIGENTE DE CACHÉ

![SIEVE](https://img.shields.io/badge/SIEVE-00D9FF?style=for-the-badge&logoColor=black)
![FIFO](https://img.shields.io/badge/FIFO-FF9F1C?style=for-the-badge)
![LRU](https://img.shields.io/badge/LRU-C084FC?style=for-the-badge)

</div>

La caché conserva resultados de búsquedas anteriores para reutilizarlos en consultas repetidas. Debido a su capacidad limitada, el sistema decide qué elementos permanecen y cuáles se reemplazan.

| Política | Nombre | Criterio de expulsión |
|:--:|---|---|
| 🟧 **FIFO** | Primero en entrar, primero en salir | Sale el más antiguo, sin importar su uso posterior. |
| 🟪 **LRU** | Menos recientemente utilizado | Se conservan los elementos consultados hace poco. |
| 🟦 **SIEVE** | Marcado y barrido | Marcas de visita y un puntero (*hand*) que recorre la lista para elegir qué expulsar. |

### Funcionamiento conceptual de SIEVE

```mermaid
flowchart TD
    A["📥 Nueva consulta"] --> B{"¿Existe en caché?"}
    B -->|Sí| C["🟢 Acierto"]
    C --> D["Marcar elemento visitado"]
    B -->|No| E["🔵 Buscar en Trie"]
    E --> F["Guardar resultado"]
    F --> G{"¿Capacidad completa?"}
    G -->|No| H["Insertar nodo"]
    G -->|Sí| I["🔄 Recorrer con Hand"]
    I --> J{"¿Nodo visitado?"}
    J -->|Sí| K["Desmarcar y avanzar"]
    K --> I
    J -->|No| L["🗑️ Expulsar nodo"]
    L --> H

    style A fill:#0E7490,stroke:#22D3EE,color:white
    style C fill:#047857,stroke:#34D399,color:white
    style E fill:#1D4ED8,stroke:#38BDF8,color:white
    style I fill:#7E22CE,stroke:#D946EF,color:white
    style L fill:#BE185D,stroke:#FB7185,color:white
    style H fill:#047857,stroke:#34D399,color:white
```

<div align="center">

<img src="ESPACIO_PARA_CAPTURA_CACHE_SIEVE" width="95%" alt="Visualización de caché SIEVE"/>

<sub>Figura 4. Administración de elementos y mecanismo de reemplazo de caché.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🟠 05 · FLUJO DE BÚSQUEDA

![Procesamiento](https://img.shields.io/badge/PROCESAMIENTO-FF9F1C?style=for-the-badge)
![Consultas](https://img.shields.io/badge/CONSULTAS-38BDF8?style=for-the-badge)
![Respuesta](https://img.shields.io/badge/RESPUESTA-34D399?style=for-the-badge)

</div>

La consulta se procesa, se verifica su disponibilidad en caché y, si no existe, se ejecuta la búsqueda sobre el Trie.

```mermaid
sequenceDiagram
    participant U as 👤 Usuario
    participant W as 💻 Interfaz
    participant S as ⚙️ Servidor
    participant C as 🧠 Caché
    participant T as 🌳 Trie

    U->>W: Escribe consulta
    W->>S: Envía prefijo
    S->>C: Verifica caché
    alt Resultado almacenado
        C-->>S: Recupera coincidencias
    else Consulta nueva
        S->>T: Ejecuta búsqueda
        T-->>S: Devuelve resultados
        S->>C: Almacena consulta
    end
    S-->>W: Envía coincidencias
    W-->>U: Muestra sugerencias
```

### Análisis de operaciones

| Operación | Estructura | Complejidad esperada |
|---|---|:--:|
| Recorrido de prefijo | Trie | `O(L)` |
| Acceso a clave | Map | `O(1)` prom. |
| Inserción local | Lista doble | `O(1)` con referencia |
| Eliminación local | Lista doble | `O(1)` con referencia |
| Recuperación de coincidencias | Trie | Depende del nº de resultados |
| Búsqueda en caché | Map | `O(1)` prom. |

<sub>L = longitud del prefijo ingresado. La recuperación completa también depende del número de coincidencias.</sub>

<details>
<summary><b>🧮 Ejemplo: ¿qué pasa al escribir "pu"?</b></summary>

1. La interfaz envía el prefijo `pu`.
2. El servidor consulta el `Map` de la caché: si hay *acierto*, responde sin tocar el Trie.
3. Si hay *fallo*, el Trie recorre `p → u` (2 pasos) y reúne las palabras bajo ese nodo.
4. El resultado se guarda en caché; si está llena, la política activa (FIFO, LRU o SIEVE) expulsa un elemento.

</details>

<div align="center">

<img src="ESPACIO_PARA_DIAGRAMA_DEL_FLUJO_DE_BUSQUEDA" width="95%" alt="Flujo interno de búsqueda"/>

<sub>Figura 5. Flujo de procesamiento desde la consulta hasta la visualización.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🔴 06 · EXPERIMENTACIÓN Y RENDIMIENTO

![Laboratorio](https://img.shields.io/badge/LABORATORIO_DE_PRUEBAS-F43F5E?style=for-the-badge)
![Medición](https://img.shields.io/badge/MEDICIÓN-7C3AED?style=for-the-badge)
![Análisis](https://img.shields.io/badge/ANÁLISIS-06B6D4?style=for-the-badge)

</div>

La experimentación estudia el comportamiento de las estructuras bajo distintas secuencias de consultas, tamaños de datos y escenarios de reutilización.

| Indicador | Descripción |
|---|---|
| ⏱️ Tiempo de ejecución | Tiempo requerido para procesar la consulta. |
| 🟢 Aciertos de caché | Resultados recuperados sin repetir la búsqueda. |
| 🔴 Fallos de caché | Consultas que requieren procesamiento. |
| 📦 Capacidad | Límite de almacenamiento configurado. |
| ♻️ Expulsiones | Elementos eliminados de la caché. |
| 📈 Rendimiento | Comparación entre políticas. |

<div align="center">

<img src="ESPACIO_PARA_GRAFICA_COMPARATIVA_FIFO_LRU_SIEVE" width="95%" alt="Gráfica de rendimiento de políticas"/>

<sub>Figura 6. Comparación de políticas de caché bajo un mismo conjunto de consultas.</sub>

<br/>

<img src="ESPACIO_PARA_GRAFICA_TIEMPOS_DE_BUSQUEDA" width="95%" alt="Gráfica de tiempos de búsqueda"/>

<sub>Figura 7. Comportamiento de los tiempos de ejecución del sistema.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🏔️ 07 · LOJA EN IMÁGENES

<img src="https://readme-typing-svg.demolab.com?font=Orbitron&weight=600&size=17&duration=2800&pause=700&color=F472B6&center=true&vCenter=true&width=700&height=40&lines=Capital+Musical+y+Cultural+del+Ecuador;Arte%2C+m%C3%BAsica+y+tradici%C3%B3n+lojana" alt=""/>

| <img src="assets/loja/puerta-de-la-ciudad.jpg" width="100%" alt="Puerta de la Ciudad"/> | <img src="assets/loja/catedral.jpg" width="100%" alt="Catedral de Loja"/> | <img src="assets/loja/parque-central.jpg" width="100%" alt="Parque Central"/> |
|:--:|:--:|:--:|
| **Puerta de la Ciudad** | **Catedral** | **Parque Central** |
| <img src="assets/loja/calle-lourdes.jpg" width="100%" alt="Calle Lourdes"/> | <img src="assets/loja/plaza-independencia.jpg" width="100%" alt="Plaza de la Independencia"/> | <img src="assets/loja/vista-panoramica.jpg" width="100%" alt="Vista panorámica de Loja"/> |
| **Calle Lourdes** | **Plaza de la Independencia** | **Vista panorámica** |

<sub>Figuras 8–13. Lugares emblemáticos de Loja. Fotografías: añadir autor y fuente de cada imagen.</sub>

</div>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 🩷 08 · GALERÍA Y ESTADO DE DESARROLLO

![Evolución](https://img.shields.io/badge/EVOLUCIÓN_DEL_PROYECTO-EC4899?style=for-the-badge)
![Implementación](https://img.shields.io/badge/IMPLEMENTACIÓN-8B5CF6?style=for-the-badge)

### Galería de evidencias

| 🔷 Buscador | 🟣 Resultados |
|:---:|:---:|
| <img src="ESPACIO_CAPTURA_1" width="100%" alt="Buscador"/> | <img src="ESPACIO_CAPTURA_2" width="100%" alt="Resultados"/> |
| <sub>Figura 14. Búsqueda</sub> | <sub>Figura 15. Resultados</sub> |

| 🟢 Caché | 🟠 Ejecución |
|:---:|:---:|
| <img src="ESPACIO_CAPTURA_3" width="100%" alt="Caché"/> | <img src="ESPACIO_CAPTURA_4" width="100%" alt="Ejecución"/> |
| <sub>Figura 16. Memoria</sub> | <sub>Figura 17. Sistema</sub> |

</div>

### Estado de los componentes

| Componente | Estado |
|---|:---:|
| Árbol Trie | 🟢 |
| Autocompletado turístico | 🟢 |
| Servidor local | 🟢 |
| Gestión mediante Map | 🟢 |
| Lista doblemente enlazada | 🟢 |
| Política FIFO | 🟢 |
| Política LRU | 🟢 |
| Política SIEVE | 🟢 |
| Métricas de consulta | 🟢 |
| Mejoras y pruebas experimentales | 🟡 |

<sub>🟢 Implementado · 🟡 En revisión o mejora · ⚪ Pendiente</sub>

### Ejecución local

```bash
git clone URL_DEL_REPOSITORIO
cd CARPETA_DEL_PROYECTO
npm install
npm start
```

<sub>Los comandos definitivos se ajustarán a los scripts de ejecución configurados en el proyecto.</sub>

<img src="assets/svg/divider.svg" width="100%" alt=""/>

<div align="center">

## 💛 09 · EQUIPO DE DESARROLLO

![UNL](https://img.shields.io/badge/UNIVERSIDAD_NACIONAL_DE_LOJA-2563EB?style=for-the-badge)
![Grupo 4](https://img.shields.io/badge/GRUPO_4-9333EA?style=for-the-badge)
![Tercer ciclo](https://img.shields.io/badge/TERCER_CICLO-EC4899?style=for-the-badge)

### 👨‍🏫 Docente

**Ing. Cristian Narvaez**

### 👨‍💻 Integrantes

| Estudiante |
|:--:|
| Yimmy Onner Angulo Torres |
| Richard Santiago Guaman Sanchez |
| Freddy Alexander Ordoñez Gonzalez |
| Joaquin Emilio Moscol Castillo |
| Erick Jahirs Rogel Baque |

### 📅 Período Académico

**Septiembre 2026 – Febrero 2027**

<br/>

<img src="https://readme-typing-svg.demolab.com?font=Orbitron&weight=700&size=20&duration=3000&pause=800&color=22D3EE&center=true&vCenter=true&width=700&height=45&lines=ARTES+%C2%B7+CULTURA+%C2%B7+TECNOLOG%C3%8DA;Hecho+con+%E2%99%A5+en+Loja%2C+Ecuador" alt=""/>

<sub>Una aplicación académica para explorar la ciudad a través de algoritmos y estructuras de datos.</sub>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0891B2,50:4C1D95,100:0B1026&height=130&section=footer&animation=twinkling" width="100%" alt=""/>

</div>
