Algoritmo "MultiplicacaoNumerosProcedimento"

Procedimento Multiplicar(a, b: Real)
Var
   resultado: Real
Inicio
   resultado <- a * b
   Escreva("O resultado da multiplicação é: ", resultado)
FimProcedimento

Var
   num1, num2: Real

Inicio
   Escreva("Digite o primeiro n�mero: ")
   Leia(num1)
   Escreva("Digite o segundo n�mero: ")
   Leia(num2)

   Multiplicar(num1, num2)

FimAlgoritmo
