public class Main {
    public static void main(String[] args) {
        Book b = new Book();

        b.setDescription("Intro to programming with python");
        b.setCode("python101");
        b.setPrice(10.95);





        Book c = new Book();
        c.setDescription("Beginning english skills");
        c.setCode("English1001");
        c.setPrice(100.00);


        Software s = new Software();
        s.setCode("ans2030");
        s.setPrice(295.24);
        s.setDescription("Advanced video player");

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());



    }
}
