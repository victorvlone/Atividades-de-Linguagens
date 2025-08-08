using System;
using System.Formats.Asn1;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.WriteLine("Dados da primeira pessoa: ");
        Console.Write("Nome: ");
        string nome1 = Console.ReadLine();
        Console.Write("Idade: ");
        int idade1 = int.Parse(Console.ReadLine());

        Console.WriteLine("Dados da segunda pessoa: ");
        Console.Write("Nome: ");
        string nome2 = Console.ReadLine();
        Console.Write("Idade: ");
        int idade2 = int.Parse(Console.ReadLine());

        double idadeMedia = (double)(idade1 + idade2) / 2;


        Console.WriteLine("A idade media de " + nome1 + " e " + nome2 + " é de " + idadeMedia.ToString("F1", CI) + " anos.");


    }
}