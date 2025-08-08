using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Digite a medida da glicose:: ");
        double glicose = double.Parse(Console.ReadLine(), CI);

        if (glicose <= 100)
        {
            Console.Write("Classificacao: normal");
        }
        else if (glicose > 100 && glicose < +140)
        {
            Console.Write("Classificacao: elevado");
        }
        else
        {
            Console.Write("Classificacao: diabetes");
        }
    }
}
