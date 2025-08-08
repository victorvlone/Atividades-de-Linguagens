using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        double n1 = 0, n2 = 1;
        while (n1 != n2)
        {
            Console.WriteLine("Digite dois numeros: ");
            n1 = double.Parse(Console.ReadLine(), CI);
            n2 = double.Parse(Console.ReadLine(), CI);

            if (n1 > n2)
            {
                Console.Write("DECRESCENTE!");
            }
            else
            {
                Console.Write("CRESCENTE!");
            }
        }
    }
}
