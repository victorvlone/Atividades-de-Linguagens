using System;
using System.Formats.Asn1;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Digite o valor de X: ");
        double x = double.Parse(Console.ReadLine());
        Console.Write("Digite o valor de Y: ");
        double y = double.Parse(Console.ReadLine());

        double soma = x + y;

        Console.Write("Soma: " + soma);

    }
}