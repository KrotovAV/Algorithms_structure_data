public class exampl {
        namespace Lesson
    {
        class MyList
        {
            public Node head;

            public void reverse(){
                Node currentNode = head;
                if(currentNode == null) return;
                Node previosNode = null;
                Node nextNode = currentNode.Next;
                currentNode.Next = previosNode;
                while(nextNode != null){
                    previosNode = currentNode;
                    currentNode = nextNode;
                    nextNode = nextNode.Next;
                    currentNode.Next = previosNode;
                }
                head = currentNode;
            }
            public void AddFirst(string value)
            {
                Node newNode = new Node();
                if (head == null)
                {
                    head = newNode;
                    head.Value = value;
                }
                else
                {
                    newNode.Value = value;
                    newNode.Next = head;
                    head = newNode;
                }
            }

            public Node PopFirst()
            {
                if (head == null) return null;
                Node first = head;
                head = head.Next;
                return first;
            }

            public Node Find(string value)
            {
                Node current = head;
                while (current != null)
                {
                    if (current.Value == value) return current;
                    current = current.Next;
                }
                return null;
            }

            public bool Contain(string value)
            {
                Node current = head;
                while (current != null)
                {
                    if (current.Value == value) return true;
                    current = current.Next;
                }
                return false;
            }

            public void AddLast(string value)
            {
                Node current = head;
                if (current == null)
                {
                    AddFirst(value);
                    return;
                }
                Node newNode = new Node();
                newNode.Value = value;
                while (current.Next != null)
                {
                    current = current.Next;
                }
                current.Next = newNode;
            }
            public Node PopLast()
            {
                Node current = head;
                Node previos = current;
                if (current == null)
                {
                    return null;
                }
                if(current.Next == null){
                    head = null;
                    return current;
                }
                while (current.Next != null)
                {
                    previos = current;
                    current = current.Next;
                }
                previos.Next = null;
                return previos;
            }


        }
    }


    namespace Lesson
    {
        class Node
        {
            public Node Next { get; set; }
            public string Value { get; set; }
        }
    }


    namespace Lesson
    {
        class Program
        {
            public static void Main()
            {
                MyList list = new MyList();
                list.AddFirst("Первое значение");
                list.AddFirst("Второе значение");
                list.AddFirst("Третье значение");
                ShowList(list);
                Console.WriteLine(list.PopFirst());
                ShowList(list);
                Console.WriteLine(list.Contain("Второе значение"));
                Console.WriteLine(list.Contain("1"));
                list.AddLast("Цветочек");
                ShowList(list);
                list.PopLast();
                ShowList(list);
                list.AddLast("Новый001");
                list.AddLast("Новый002");
                list.AddLast("Новый003");
                ShowList(list);
                list.reverse();
                ShowList(list);
                list.reverse();
                ShowList(list);
                list.PopLast();
                list.PopLast();
                list.PopLast();
                list.PopLast();
                ShowList(list);
                list.PopLast();
                ShowList(list);
    
            }
            public static void ShowList(MyList list)
            {
                Node current = list.head;
                while (current != null)
                {
                    Console.Write(current.Value + ", ");
                    current = current.Next;
                }
                Console.WriteLine();
            }
        }
    
    }
}
