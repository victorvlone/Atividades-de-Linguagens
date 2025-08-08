using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Digite a quantidade de minutos: ");
        int minutos = int.Parse(Console.ReadLine(), CI);

        double valor;


        if (minutos <= 100)
        {
            valor = 50;
        }
        else
        {
            valor = 50 + (minutos - 100) * 2;
        }

        Console.WriteLine("Valor a pagar: R$" + valor.ToString("F2", CI));
    }
}
