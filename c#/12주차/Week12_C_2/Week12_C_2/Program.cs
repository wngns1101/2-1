using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week12_C_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Animal> animals = new List<Animal>() // 추상 클래스는 타입형으로는 사용 가능
            {
                new Dog(){Name = "개1"},
                new Cat(){Name = "냥1"},
                new Cat(){Name = "냥2"},
                new Dog(){Name = "개2"},
                new Cat(){Name = "냥3"},
                new Dog(){Name = "개3"},
                new Cat(){Name = "냥4"},
               // new Animal(){Name = "동물1"} 추상 클래스는 인스턴스 생성 불가
            };
        
            foreach(var item in animals)
            {
                Console.WriteLine(item);
                item.Eat();
                //Animal의 Eat는 추상 메소드지만 이를 상속받아서 만든 derieved class에는
                //override한 Eat()가 있는 것을 보장
            }
                
        }
    }
}
