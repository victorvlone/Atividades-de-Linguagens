using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Digite a primeira nota: ");
        double primeiraNota = double.Parse(Console.ReadLine(), CI);

        Console.Write("Digite a segunda nota: ");
        double segundaNota = double.Parse(Console.ReadLine(), CI);

        double notaFinal = primeiraNota + segundaNota;

        Console.WriteLine("NOTA FINAL: " + notaFinal);

        if (notaFinal < 60)
        {
            Console.Write("REPROVADO!");
        }
    }
}
