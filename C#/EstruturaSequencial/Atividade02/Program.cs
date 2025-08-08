using System;
using System.Formats.Asn1;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Base do retangulo: ");
        double baseRetangulo = double.Parse(Console.ReadLine());
        Console.Write("Altura do retangulo: ");
        double alturaRetangulo = double.Parse(Console.ReadLine());

        double area = baseRetangulo * alturaRetangulo;
        double perimetro = baseRetangulo * 2 + alturaRetangulo * 2;
        double diagonal = Math.Sqrt(Math.Pow(baseRetangulo, 2) + Math.Pow(alturaRetangulo, 2));

        Console.WriteLine("Area: " + area.ToString("F4", CI));
        Console.WriteLine("Perimetro: " + perimetro.ToString("F4", CI));
        Console.WriteLine("Diagonal: " + diagonal.ToString("F4", CI));
    }
}