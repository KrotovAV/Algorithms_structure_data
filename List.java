
public class List {
    ListElem head;

    public List reversList(List startListF) {
        List reversListF = new List();
        ListElem current = startListF.head;
        if (head == null) {
            return startListF;
        }
        while (current.next != null) {
            reversListF.addListElemFirst(current.content);
            startListF.delListElemFirst(startListF);
            current = current.next;
        }
        reversListF.addListElemFirst(current.content);
        startListF.delListElemFirst(startListF);
        return reversListF;
    }

    public static void ListPrint(List listF) {
        ListElem current = listF.head;
        while (current != null) {
            System.out.println(current.content + ", ");
            current = current.next;
        }
        System.out.println();
    }

    public void addListElemFirst(String contentF) {
        ListElem newListElem = new ListElem();
        if (head == null) {
            head = new ListElem();
            head.content = contentF;
        } else {
            newListElem.content = contentF;
            newListElem.next = head;
            head = newListElem;
        }
    }

    public List delListElemFirst(List listF) {
        if (head != null) {
            ListElem first = head.next;
            head = first;
        }
        return listF;
    }

    public boolean existElement(List listF, String contentF) {
        boolean flag = false;
        ListElem current = listF.head;
        while (current != null) {
            if (current.content == contentF) {
                flag = true;
            }
            current = current.next;
        }
        return flag;
    }

    public List addListElemLast(List listF, String contentF) {
        ListElem newListElem = new ListElem();
        newListElem.content = contentF;
        ListElem current = listF.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newListElem;
        return listF;
    }

    public List delListElemLast(List listF) {
        ListElem upElem = listF.head;
        ListElem current = upElem.next;
        while (current.next != null) {
            upElem = upElem.next;
            current = current.next;
        }
        upElem.next = null;
        return listF;
    }
}
