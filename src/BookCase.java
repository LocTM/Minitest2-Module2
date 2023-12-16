public class BookCase {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook(1,"Java",10.5,"Loc","Java","JL");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2,"Python",12.5,"Phong","Python","BL");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3,"JavaScript",13.8,"Thong","JavaScript","NH");
        ProgrammingBook programmingBook4 = new ProgrammingBook(4,"C",8.5,"Thang","VN","C");
        ProgrammingBook programmingBook5 = new ProgrammingBook(5,"C#",18.5,"Hung","VN","C#");

        FictionBook fictionBook1 = new FictionBook(1,"VT1", 9.5, "KA", "Viễn tưởng 1");
        FictionBook fictionBook2 = new FictionBook(2,"VT1", 1.5, "Hai", "Viễn tưởng 1");
        FictionBook fictionBook3 = new FictionBook(3,"VT1", 4.5, "Hieu", "Viễn tưởng 3");
        FictionBook fictionBook4 = new FictionBook(4,"VT1", 9.7, "Toan", "Viễn tưởng 4");
        FictionBook fictionBook5 = new FictionBook(5,"VT1", 12.5, "Nam", "Viễn tưởng 1");


        double totalCost = calTotalCost(programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5,
                fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);
        System.out.println("Tổng tiền của tất cả sách: " + totalCost + "$");


        int SVT = countSVT(fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);

        System.out.println("Số sách Viễn tưởng 1: " + SVT);

        int JV = countJV(programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5);

        System.out.println("Số sách Java: " + JV);

        int cheapCount = countCheapFictionBooks(fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);
        System.out.println("Số sách Fiction có giá < 100: " + cheapCount);
    }

    public static double calTotalCost(Book... books) {
        double total = 0.0;

        for (Book book : books) {
            total += book.getPrice();
        }

        return total;
    }

    public static int countSVT(FictionBook... fictionBooks) {
        int count = 0;

        for (FictionBook fictionBook : fictionBooks) {
            if ("Viễn tưởng 1".equals(fictionBook.getCategory())) {
                count++;
            }
        }

        return count;
    }
    public static int countJV(ProgrammingBook... programmingBooks) {
        int count = 0;

        for (ProgrammingBook programmingBook : programmingBooks) {
            if ("Java".equals(programmingBook.getLanguage())) {
                count++;
            }
        }

        return count;
    }
    public static int countCheapFictionBooks(FictionBook... fictionBooks) {
        int count = 0;

        for (FictionBook fictionBook : fictionBooks) {
            if (fictionBook.getPrice() < 100) {
                count++;
            }
        }

        return count;
    }
    }

