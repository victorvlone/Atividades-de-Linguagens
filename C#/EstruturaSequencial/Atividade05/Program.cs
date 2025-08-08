using System;
using System.Formats.Asn1;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Preço unitario do produto: ");
        double precoUni = double.Parse(Console.ReadLine());
        Console.Write("Quantidade comprada: ");
        int quantidade = int.Parse(Console.ReadLine());
        Console.Write("DInheiro recebido: ");
        double recebido = double.Parse(Console.ReadLine());

        double troco = recebido - precoUni * quantidade;

        Console.WriteLine("TROCO: R$" + troco.ToString("F2", CI));



    }
}