import java.util.Scanner;

public class Client {

    public static final int INITVALUE = 0;

    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook(1,"Java",10.5,"Loc","Java","JL");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2,"Python",12.5,"Phong","Python","BL");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3,"JavaScript",13.8,"Thong","JavaScript","NH");
        ProgrammingBook programmingBook4 = new ProgrammingBook(4,"Java",8.5,"Thang","Java","C");
        ProgrammingBook programmingBook5 = new ProgrammingBook(5,"C#",18.5,"Hung","VN","C#");

        FictionBook fictionBook1 = new FictionBook(1,"VT1", 9.5, "KA", "Viễn tưởng 1");
        FictionBook fictionBook2 = new FictionBook(2,"VT1", 1.5, "Hai", "Viễn tưởng 1");
        FictionBook fictionBook3 = new FictionBook(3,"VT1", 4.5, "Hieu", "Viễn tưởng 3");
        FictionBook fictionBook4 = new FictionBook(4,"VT1", 9.7, "Toan", "Viễn tưởng 4");
        FictionBook fictionBook5 = new FictionBook(5,"VT1", 12.5, "Nam", "Viễn tưởng 1");

        Book books[] = {programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5,
        fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5};

//        tinh tong tien
//        double sum = getSumPrice(books);
//        System.out.println("tong tien " + sum);
//        dem so PB co language la Java
//        int count = getCount(books, "Python");
//        System.out.println("So sach co ngon ngu la Python " + count);
//        dem so fictuon book co category la vien tuong
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        int count2 = countFictionByCategory(books, c);
        System.out.println(count2);
    }

    private static int getCount(Book[] books, String language) {
        int count=INITVALUE;
        for(Book b: books){
//            kiem tra xem dau la Programming Book
            if(b instanceof ProgrammingBook){
//                ep kieu
                ProgrammingBook programmingBook = (ProgrammingBook) b;
//                Lay language
                String lang = programmingBook.getLanguage();
                if (lang.equals(language)){
                    count++;
                }
            }
        }
        return count;
    }

    private static double getSumPrice(Book[] books) {
        double sum=0;
        for(Book book: books){
            sum+=book.getPrice();
        }
        return sum;
    }
//    sach Fiction co category la Vien tuong
//  1. ten phuong thuc: countFictionByCategory
//  2. tham so: mang Book, category
//  3. du lieu tra ve: so nguyen
//  4. phan than
    private static int countFictionByCategory(Book[] books, String category){
        int count= INITVALUE;
        for (Book b: books){
            if (b instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) b;
                String c = fictionBook.getCategory();
                if (c.equals(category)){
                    count++;
                }
            }
        }
        return count;
    }
}
