using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week12_C_2
{
    abstract class Animal //추상 클래스 - 인스턴스 생성 불가, 자료형으로는 사용 가능
    //sealed class Animal :파생클래스 불가
    //class Animal : 구상 클래스
    {
        public string Name { get; set; }

        public virtual void Test() { }

        public abstract void Eat(); //추상 메소드: 중괄호를 쓸 수 없음
    }

    class Cat : Animal
    {
        sealed public override void Test()
        {

        }

        public override void Eat()
        {
            Console.WriteLine("추르 쩝");
        }
    }

    class ExCat : Cat
    {
        //public override void Test() { }
    }

    class Dog : Animal
    {
        public override string ToString()
        {
            return Name;

        }

        public override void Eat()
        {
            Console.WriteLine("뼈다귀");
        }
    }
}