using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week12_C_1
{
    internal class Program
    {
        class Parent
        {
            public int variables = 123;
            
            public void Method1()
            {
                Console.WriteLine(456);
            }

            public virtual void Method2() //c#은 오버라이딩 하려면 무조건 virtual 붙여야함
            {
                Console.WriteLine(789);
            }
        }

        class Child : Parent //base:Parent, derived class:child 
        {
            public new string variables = "ABC"; //hiding :부모걸 상속 안 받고 내 걸 쓰고 싶을 때

            public new int Method1() //method hiding(부모 메소드 숨김)
            {
                Console.WriteLine("DEF");
                return 0;
            }

            public override void Method2() //method overriding(부모 메소드 없앰)
            {
                Console.WriteLine("GHI");
            }
        }

        static string name = "인하공업전문대학";
        static void Main(string[] args)
        {
            string name = "컴퓨터정보과"; //지역변수 우선
            Console.WriteLine(name);

            Parent p = new Child(); //실제로는 child를 가르킴
            Child c = (Child)p;

            Console.WriteLine("1 ------------------");
            Console.WriteLine(p.variables);
            Console.WriteLine(c.variables);

            Console.WriteLine("2 ------------------");
            p.Method1();
            c.Method1();

            Console.WriteLine("3 ------------------");
            p.Method2();
            c.Method2();

            Console.WriteLine("3 ------------------");
            DateTime dt = DateTime.Now;
            Console.WriteLine((object)dt); //dt.ToString()
            Console.WriteLine((object)p); //p.ToString()
        }

    }
}
