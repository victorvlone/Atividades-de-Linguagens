using System;
using System.Formats.Asn1;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Digite a largura do terreno: ");
        double largura = double.Parse(Console.ReadLine());
        Console.Write("Digite o comprimento do terreno: ");
        double comprimento = double.Parse(Console.ReadLine());
        Console.Write("Digite o valor do metro quadrado: ");
        double valor = double.Parse(Console.ReadLine());

        double area = largura * comprimento;
        double preco = area * valor;

        Console.WriteLine("Area do terreno: " + area.ToString("F2", CI));
        Console.WriteLine("Preço do terreno: " + preco.ToString("F2", CI));
    }
}