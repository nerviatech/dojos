using System;

namespace DataMunging01
{
	public class DataMunging
	{
		private string[] parseHeader(string[] lines){
			string[] newLines = new string[lines.Length-3];
			for (int i=2;i<lines.Length-1;i++)
			{
				newLines [i - 2] = lines [i];
			}
			return newLines;
		}
		private int[] parseLines(string[] lines){
			int[] dataTemp = new int[lines.Length];

			foreach (string line in lines)
			{
				string myLine = line;
				myLine = myLine.Trim();
				int pos = myLine.IndexOf (" ");
				int day =  int.Parse( myLine.Substring (0, pos));

				myLine = myLine.Substring (pos).Trim();

				int posMax = myLine.IndexOf (" ");
				int maxTemp =  int.Parse( myLine.Substring (0, posMax).Replace("*", ""));

				myLine = myLine.Substring (posMax).Trim();

				int posMin = myLine.IndexOf (" ");
				int minTemp = int.Parse( myLine.Substring (0, posMin).Replace("*", ""));
				dataTemp [day-1] = maxTemp - minTemp;

			}
			return dataTemp;
		}
		public void munging()
		{
			string[] lines = System.IO.File.ReadAllLines(@"/media/ohierro/OS/projects/java/dojos/dataMunging/data/weather.dat");
			lines = parseHeader (lines);
			int[] data = parseLines (lines);
			int min = data [0];
			int counter = 0;
			int minday = counter;
			foreach (int day in data)
			{
				if (min > day) {
					minday = counter + 1;
					min = day;
				}
				// Use a tab to indent each line of the file.
				Console.WriteLine("\t Dia = " + (counter + 1) + ", dif temp = "  + day);
				counter++;
			}
			Console.WriteLine("\t EL dia con la minima diferencia de temperatura es " + minday + " y la temperatura es " + min);
		}
	}
}

