## Condicionales

Codigo en Python
```python
saldo_en_sitp = float(input())

if(saldo_en_sitp >= 2500):
  print("Puede entrar")
elif(saldo_en_sitp < 0):
  print("Usted nos debe!!!")
else:
  print("Pidale a alguien que le venda el pasaje")

```

Codigo en Java
```java
package Semana1.sesion3;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese saldo Tarjeta SITP:");
        float saldoEnSitp = Float.parseFloat(input.nextLine());

        if (saldoEnSitp >= 2500){
            System.out.println("Puede entrar");
        } else if(saldoEnSitp < 0) {
            System.out.println("Usted nos debe!!!!");
        } else {
            System.out.println("Pidale a alguien que le venda el pasaje");
        }
    }
}

```

## Ciclo While

Codigo en Python
```python
indice = 0

while(indice <= 10):
  print(indice*indice)
  indice += 1

```

Codigo en Java
```java
package Semana1.sesion3;

public class CicloWhile {
    public static void main(String[] args) {
        int indice = 0;

        while(indice <= 10) {
            System.out.println(indice*indice);
            indice += 1;
        }
    }
}

```

## Do While

Codigo en Python
```python
xi = 1.0
bandera = True
while(xi > 0.0 or bandera):
    bandera = False
    x0 = xi
    xi = x0/2
print(x0)
```

Codigo en Java
```java
package Semana1.sesion3;

public class CicloDoWhile {
    public static void main(String[] args) {
        double xi = 1.0;
        double x0;
        do {
            x0 = xi;
            xi = x0/2;
        } while(xi > 0.0);
        System.out.println(x0);
    }
}

```

## Ciclo For clasico

Codigo en Python
```python
for i in range(0, 11):
  print(i, "al cuadrado es", i ** 2)
```

Codigo en Java
```java
public class CicloFor {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            System.out.println(i + " al cuadrado es " + (i * i));
        }
    }
}
```

## For-Each en Java (por cada elemento de la lista)

Codigo en Python
```python
frutas = ["naranja", "banano", "pina" ]

for fruta in frutas:
    print(fruta)

```

Codigo en Java
```java
package Semana1.sesion3;

public class CicloForeach {
    public static void main(String[] args) {
        String[] frutas =  {"naranja", "banano", "pina"};
        
        for(String fruta: frutas){
            System.out.println(fruta);
        }
        
    }
}
```

## Funciones o metodos

Programa en Python
```python
def elevarAlCuadrado(n):
    return n ** 2

def saludar():
    print("Hola 😊")

def main():
    saludar()
    print(elevarAlCuadrado(5))

main()
```

Codigo en Java
```java
package Semana1.sesion3;

import java.lang.Math;

public class Funciones {

    static double elevarAlCuadrado(int n) {
        return Math.pow(n, 2.0);
    }

    static void saludar() {
        System.out.println("Hola 😊");
    }

    public static void main(String[] args) {
        double resultado = elevarAlCuadrado(5);
        saludar();
        System.out.println(resultado);
    }
}
```