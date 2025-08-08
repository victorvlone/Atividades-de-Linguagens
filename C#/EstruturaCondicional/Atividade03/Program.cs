using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Primeiro valor: ");
        double primeiroValor = double.Parse(Console.ReadLine(), CI);
        Console.Write("Segundo valor: ");
        double segundoValor = double.Parse(Console.ReadLine(), CI);
        Console.Write("Terceiro valor: ");
        double terceiroValor = double.Parse(Console.ReadLine(), CI);

        if (primeiroValor < segundoValor && primeiroValor < terceiroValor)
        {
            Console.WriteLine("Menor valor: " + primeiroValor);

        }
        else if (segundoValor < primeiroValor && segundoValor < terceiroValor)
        {
            Console.WriteLine("Menor valor: " + segundoValor);
        }
        else
        {
            Console.WriteLine("Menor valor: " + terceiroValor);
        }
    }
}
