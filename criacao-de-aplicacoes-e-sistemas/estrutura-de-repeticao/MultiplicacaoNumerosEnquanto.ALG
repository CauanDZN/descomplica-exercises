Algoritmo "MultiplicacaoNumerosEnquanto"

Var
   resultado, numero: Real
   contador: Inteiro

Inicio
   resultado <- 1
   contador <- 1

   Enquanto contador <= 10 faca
      Escreva("Digite o número ", contador, ": ")
      Leia(numero)
      resultado <- resultado * numero
      contador <- contador + 1
   FimEnquanto

   Escreva("O resultado da multiplicação é: ", resultado)

FimAlgoritmo
