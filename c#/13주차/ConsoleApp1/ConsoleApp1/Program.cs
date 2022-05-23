using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class TestClass : IBasic
    {
        public int TestProperty
        {
            get; set;
        }

        public int TestInstanceMethod()
        {
            return 3;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            IBasic a = new TestClass(); //부모 - 자식
            TestClass b = new TestClass();  //자식 - 자식
            //TestClass c = new IBasic(); //자식 - 부모는 안 됨
        }
    }
}
