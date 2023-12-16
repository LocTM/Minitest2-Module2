public class BookCase {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook(1,"Java",10.5,"Loc","VN","JL");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2,"Python",12.5,"Phong","VN","BL");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3,"JavaScript",13.8,"Thong","VN","NH");
        ProgrammingBook programmingBook4 = new ProgrammingBook(4,"C",8.5,"Thang","VN","EK");
        ProgrammingBook programmingBook5 = new ProgrammingBook(5,"C#",18.5,"Hung","VN","KE");

        FictionBook fictionBook1 = new FictionBook(1,"VT1", 9.5, "KA", "abc");
        FictionBook fictionBook2 = new FictionBook(2,"VT1", 1.5, "Hai", "abc1");
        FictionBook fictionBook3 = new FictionBook(3,"VT1", 4.5, "Hieu", "abc2");
        FictionBook fictionBook4 = new FictionBook(4,"VT1", 9.7, "Toan", "abc3");
        FictionBook fictionBook = new FictionBook(5,"VT1", 12.5, "Nam", "abc4");
    }
}
