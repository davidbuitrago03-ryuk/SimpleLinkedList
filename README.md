# SimpleLinkedList
Este proyecto implementa manualmente una estructura de datos de lista en Java, similar a LinkedList, siguiendo la interfaz List del framework de colecciones de Java (Link de documentación oficial de Oracle: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html).

Link directo a este repositorio: https://github.com/MasterColleman/SimpleLinkedList.git

## Descripción

La implementación proporciona una lista dinámica que puede crecer según sea necesario, con operaciones para agregar, eliminar, buscar y manipular elementos. Todos los métodos principales de la interfaz List han sido implementados desde cero.

## Protocolo para realizar cambios

- entrar al repositorio remoto con el link

- crear bifurcación del repositorio con fork, así tendra una copia en su cuenta personal

- clonar el repositorio

- crear una nueva rama de trabajo que tenga por nombre el nombre del estudiante

- sobre el proyecto clonado realizar la implementación sólo de los métodos asignados

- ejecutar los comandos add y commit correspondientes para preparar la entrega

- hacer push al repositorio origin y la nueva rama para enviar los cambios realizados

- crear el pull request

## Características

- Implementación manual de 23 métodos de la interfaz List

- Estructura de datos dinámica basada en arreglos

- Tipado genérico para trabajar con cualquier tipo de objeto

- Operaciones de adición, eliminación, búsqueda y modificación

- Capacidad de crecimiento automático

## Métodos finales después de implementación
### Operaciones de Adición

    add(E e) - Agrega un elemento al final
    add(int index, E element) - Inserta un elemento en una posición específica
    addAll(Collection<? extends E> c) - Agrega todos los elementos de una colección
    addAll(int index, Collection<? extends E> c) - Inserta una colección en una posición específica


### Operaciones de Eliminación

    clear() - Elimina todos los elementos
    remove(int index) - Elimina un elemento por su índice
    remove(Object o) - Elimina la primera ocurrencia de un elemento
    removeAll(Collection<?> c) - Elimina todos los elementos contenidos en una colección
    retainAll(Collection<?> c) - Retiene solo los elementos contenidos en una colección

### Operaciones de Búsqueda y Consulta

    contains(Object o) - Verifica si existe un elemento
    containsAll(Collection<?> c) - Verifica si existen todos los elementos de una colección
    indexOf(Object o) - Encuentra el índice de la primera ocurrencia
    lastIndexOf(Object o) - Encuentra el índice de la última ocurrencia
    isEmpty() - Verifica si la lista está vacía
    size() - Obtiene el número de elementos
    get(int index) - Obtiene un elemento por su índice

### Operaciones de Modificación

    set(int index, E element) - Reemplaza un elemento en una posición

### Operaciones de Vista y Conversión

    subList(int fromIndex, int toIndex) - Obtiene una sublista
    toArray() - Convierte la lista a un arreglo
    toArray(T[] a) - Convierte la lista a un arreglo de un tipo específico

### Iteradores

    iterator() - Obtiene un iterador simple
    listIterator() - Obtiene un listIterator
    listIterator(int index) - Obtiene un listIterator desde una posición

### Otros

    equals(Object o) - Compara dos listas para igualdad
