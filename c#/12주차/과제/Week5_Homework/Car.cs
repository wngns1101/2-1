using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week5_Homework
{
    abstract internal class Car
    {
        private readonly string _carNumber;
        private DateTime _inTime;
        private DateTime _outTime;

        public string CarNumber
        {
            get { return _carNumber; }
        }
        public DateTime InTime
        {
            get { return _inTime; }
        }

        public DateTime OutTime
        {
            get { return _outTime; }
        }

        public Car(string carnumber)
        {
            _carNumber = carnumber;
            _inTime = DateTime.Now;
        }

        public virtual void Out()
        {
            _outTime = DateTime.Now;
        }

        public virtual int Diff()
        {
            int term = 0;
            if (_outTime >= _inTime) {
                term = (int)(_outTime - _inTime).TotalSeconds;
            } else {
                term = (int)(DateTime.Now - _inTime).TotalSeconds;
            }
            return term;
        }

        public override string ToString() =>  "차량번호: " +CarNumber + " 입차시간: " +InTime + " 주차시간: " + Diff();

        abstract public int GetPrice();        

        }
    }
