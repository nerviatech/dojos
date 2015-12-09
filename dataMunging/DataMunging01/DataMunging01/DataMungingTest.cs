using NUnit.Framework;
using System;

namespace DataMunging01
{
	[TestFixture()]
	public class DataMungingTest
	{
		[Test()]
		public void TestCase ()
		{
			DataMunging datamunging = new DataMunging ();
			datamunging.munging ();
		}
	}
}

