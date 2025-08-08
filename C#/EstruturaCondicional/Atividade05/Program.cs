using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        CultureInfo CI = CultureInfo.InvariantCulture;

        Console.Write("Preço unitario do produto: ");
        double preco = double.Parse(Console.ReadLine(), CI);

        Console.Write("Quantidade comprada: ");
        int quantidade = int.Parse(Console.ReadLine(), CI);

        Console.Write("Dinheiro recebido: ");
        double recebido = double.Parse(Console.ReadLine(), CI);

        double troco = recebido - preco * quantidade;

        if (troco >= 0)
        {
            Console.Write("TROCO = " + troco);
        }
        else
        {
            Console.Write("DINHEIRO INSUFICIENTE. FALTAM " + troco + " REAIS");
        }
    }
}
