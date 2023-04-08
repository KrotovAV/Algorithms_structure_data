public class Programm {
    public static void main(String[] args) throws Exception {
    
        List list = new List(); 
        list.addListElemFirst("first content in head position");
        list.addListElemFirst("second content in head position");
        list.addListElemFirst("third content in head position");
        list.addListElemFirst("fourth content in head position");
        list.addListElemFirst("fifth content in head position");

        List.ListPrint(list);

        List.ListPrint(list.delListElemFirst(list));

        boolean exist1 = list.existElement(list, "second content in head position");
        System.out.println(exist1);

        boolean exist2 = list.existElement(list, "if exist content ");
        System.out.println(exist2);

        List newList = list.addListElemLast(list, "last position content");
        List.ListPrint(newList);

        List newListDelLat = newList.delListElemLast(newList);
        List.ListPrint(newListDelLat);

        System.out.println("-----------------------------");
        List.ListPrint(list);
        List reversList = list.reversList(list);
        List.ListPrint(reversList);
        }
}
