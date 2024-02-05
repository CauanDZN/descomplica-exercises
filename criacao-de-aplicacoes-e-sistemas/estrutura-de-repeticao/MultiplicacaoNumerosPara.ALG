Algoritmo "MultiplicacaoNumerosPara"

Var
   resultado, numero: Real
   contador: Inteiro

Inicio
   resultado <- 1

   Para contador de 1 ate 10 faca
      Escreva("Digite o número ", contador, ": ")
      Leia(numero)
      resultado <- resultado * numero
   FimPara

   Escreva("O resultado da multiplicação é: ", resultado)

FimAlgoritmo
